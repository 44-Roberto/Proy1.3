/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import java.io.*;
import Funciones.AESencripter;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author AndresLima
 */
public class ArchivoSecuencial {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public String Search(String id, String Path){
        File file = new File(Path);
        if (file.exists()) {
            try {           
                FileReader LecturaArchivo = new FileReader(file);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;                
                Linea=LeerArchivo.readLine();
                String[] registro;
                while(Linea != null){
                    if (!"".equals(Linea)) {                        
                        if (!Linea.endsWith("1")) {
                            //Si el registro esta deshabilitado se regresa un null
                            return "null";
                        }
                        registro = Linea.split("[|]");
                        String key = registro[0];
                        if (id.equals(key)) {
                            LecturaArchivo.close();
                            LeerArchivo.close();
                            return Linea;
                        }
                    }
                    Linea=LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            }
        }       
        return "null";
    }
    
    public void Add(String ingreso, String pathBit, String pathMaster, String pathBitDes, String pathMasterDesc, String user){        
        String[] registro = ingreso.split("[|]");
        if (!Search(registro[0], pathBit).equals("null") || !Search(registro[0], pathMaster).equals("null")) {
            //Si la llave primaria ya esta en la bitácora o en el maestro se retorna
            return;
        }        
        //Verificar descriptor
        String[][] descriptorBit = getDescriptor(pathBitDes);
        String[][] descriptorMast = getDescriptor(pathMasterDesc);
        String fechaMod;
        if (descriptorBit[1][1].equals(" ") && descriptorBit[2][1].equals(" ")) {
            //Fecha creción
            fechaMod = dtf.format(LocalDateTime.now()); //fecha mod
            descriptorBit[1][1] = fechaMod;
            descriptorMast[1][1] = fechaMod;
            //Usuario creacion
            descriptorBit[2][1] = user;
            descriptorMast[2][1] = user;
            setDescriptor(descriptorMast, pathMasterDesc); //se actualiza el decriptor            
        }
        
        int cantRegistrosB = Integer.parseInt(descriptorBit[5][1].trim());
        int regActivosB = Integer.parseInt(descriptorBit[6][1].trim());
        int maxReorgB = Integer.parseInt(descriptorBit[8][1].trim());
        String error = "";
        if (cantRegistrosB < maxReorgB) {
            //Se inserta en la bitácora            
            LlenarArchivo(pathBit, ingreso, error); //Se llena el archivo
            cantRegistrosB += 1; //se aumenta la cant de registros
            regActivosB += 1; //se aumenta la cant de registros activos
            fechaMod = dtf.format(LocalDateTime.now()); //fecha mod
            descriptorBit[3][1] = fechaMod; 
            descriptorBit[4][1] = user;
            descriptorBit[5][1] = cantRegistrosB + "";
            descriptorBit[6][1] = regActivosB + "";
            setDescriptor(descriptorBit, pathBitDes); //se actualiza el decriptor            
        }else{            
            Reorganizar(pathBit, pathMaster,pathBitDes, pathMasterDesc,user);
            Add(ingreso,pathBit, pathMaster,pathBitDes, pathMasterDesc,user);
        }        
    }
    
    private String[][] getDescriptor(String ruta){
        String[][] fileInfo = new String[9][2];
        File file = new File(ruta);
        if (file.exists() == true) {
            try{
                FileReader LecturaArchivo = new FileReader(file);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                for (int i = 0; i < 9; i++) {
                    String[] line = LeerArchivo.readLine().split(":");
                    fileInfo[i][0] = line[0];
                    fileInfo[i][1] = line[1];
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", WIDTH);
            }
        }
        return fileInfo;
    }
    
    private void setDescriptor(String[][] descriptor, String Path){
        try
        {     
            File Archivo = new File(Path);
            FileWriter Escribir = new FileWriter(Archivo);
            for (int i = 0; i < 9; i++) {
                
                Escribir.write(descriptor[i][0]+":"+descriptor[i][1]+System.getProperty("line.separator" ));
               
            }
                 Escribir.close();
                
                //return true;
        }
        catch(IOException ex)
        {            
            //return false;
        } 
    }
    
    private boolean LlenarArchivo(String strPath,String strContenido,String strError)
    {
        File Archivo = new File(strPath);

        try
        {//FileWriter Escribir = new FileWriter(Archivo,false);
            try (FileWriter Escribir = new FileWriter(Archivo,true); 
                 BufferedWriter bw = new BufferedWriter(Escribir)) {
                bw.write(strContenido+ System.getProperty( "line.separator" ));
                bw.close();
            }
                
                return true;
        }
        catch(IOException ex)
        {
            strError= ex.getMessage();
            return false;
        } 
        
    }
    
    private void Reorganizar(String pathBit, String pathMaster, String pathBitDesc, String pathMasterDesc, String user){
        String[][] descriptorM = getDescriptor(pathMasterDesc);
        String[][] descriptorB = getDescriptor(pathBitDesc);
        File bitacora = new File(pathBit);
        File master = new File(pathMaster);
        ArrayList<String> auxiliar = new ArrayList<>();
        
        try {
            //Leer la bitácora y añadir a la lista
            FileReader LecturaArchivo = new FileReader(bitacora);
            BufferedReader LeerAR = new BufferedReader(LecturaArchivo);
            String Linea = LeerAR.readLine();
            int cantidad = 0;
            while(Linea != null){
                if (!"".equals(Linea)) {                    
                    if (Linea.endsWith("1")) {
                        auxiliar.add(Linea);
                        cantidad += 1;
                    }                    
                }                
                Linea = LeerAR.readLine();
            }
            LecturaArchivo.close();
            LeerAR.close();
            bitacora.delete();
            bitacora.createNewFile();
            //Leer el master y añadir en el master 
            LecturaArchivo = new FileReader(master);
            LeerAR = new BufferedReader(LecturaArchivo);
            Linea = LeerAR.readLine();
            while(Linea != null){
                if (!"".equals(Linea)) {                    
                    if (Linea.endsWith("1")) {
                        auxiliar.add(Linea);
                        cantidad += 1;
                    }                    
                }                
                Linea = LeerAR.readLine();
            }
            LecturaArchivo.close();
            LeerAR.close();
            master.delete();
            master.createNewFile();
            Collections.sort(auxiliar);
            String error = "";
            for(var s : auxiliar){
                LlenarArchivo(pathMaster,s,error);
            }
            //Actualizar el decriptor de ambos
            
            //Descriptor archivo maestro
            String fechaMod = dtf.format(LocalDateTime.now()); //fecha mod
            descriptorM[3][1] = fechaMod;
            descriptorM[4][1] = user;
            descriptorM[5][1] = cantidad + "";
            descriptorM[6][1] = cantidad + "";
            setDescriptor(descriptorM, pathMasterDesc);
            
            //Descriptor archivo bitacora
            fechaMod = dtf.format(LocalDateTime.now()); //fecha mod
            descriptorB[3][1] = fechaMod;
            descriptorB[4][1] = user;
            descriptorB[5][1] = 0 + "";
            descriptorB[6][1] = 0 + "";
            setDescriptor(descriptorB, pathBitDesc);
                        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
        }                                
    }
}
