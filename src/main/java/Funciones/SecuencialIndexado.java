/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresLima
 */
public class SecuencialIndexado {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public String Search(String id, String pathInd, String pathIndDesc){
        String[][] descriptor = getDescriptorInd(pathIndDesc);
        if (Integer.parseInt(descriptor[6][1]) == 0) {//Vacio?
            return "null";//Si, retornar null
        }
        int pos = Integer.parseInt(descriptor[5][1]) - 1; //Posicion en el registro
        ArrayList<String> indice = getIndice(pathInd);
        while(pos != -1){            
            String temporal = indice.get(pos);
            if (temporal.contains(id) && temporal.endsWith("1")) { //Registro coincide y esta activo
                return temporal; //Se devuelve el valor
            }else{
                String[] reg = temporal.split("[|]");
                int p = reg.length -2;
                if (reg[p].equals("null")) { // Llego al final?
                    break; //Si, se rompe el ciclo
                }else{
                    pos = Integer.parseInt(reg[5]); //Se mueve en la lista
                }
            }
        }        
        return "null";
    }
    
    public ArrayList<String> getAll(String key, String pathInd, String pathIndDesc){
        ArrayList<String> resultado = new ArrayList<>();
        String[][] descriptor = getDescriptorInd(pathIndDesc);
        if (Integer.parseInt(descriptor[6][1]) == 0) {
            return null;
        }
        int pos = Integer.parseInt(descriptor[5][1]) - 1;        
        ArrayList<String> indice = getIndice(pathInd);
        while(pos != -1){            
            String temporal = indice.get(pos);
            if (temporal.contains(key) && temporal.endsWith("1")) {
                resultado.add(temporal);
            }else{
                String[] reg = temporal.split("[|]");
                int p = reg.length -2;
                if (reg[p].equals("null")) {
                    break;
                }else{
                    pos = Integer.parseInt(reg[5]);
                }
            }
        }                
        return resultado;
    }
    
    public void Add(String key, String ingreso, String pathInd, String IndDesc, String user){        
        String[][] DescriptorInd = getDescriptorInd(IndDesc); //Se genera el dec del indice
        
        String fechaMod;
        if (DescriptorInd[1][1].equals(" ") && DescriptorInd[2][1].equals(" ")) {//Estan vacíos?
            fechaMod = dtf.format(LocalDateTime.now()); //fecha creacion
            DescriptorInd[1][1] = fechaMod;
            DescriptorInd[2][1] = user; //Usuario creacion
        }               
                
        int bloque = Integer.parseInt(DescriptorInd[10][1].trim());//Numero de bloques
        int maxOrg = Integer.parseInt(DescriptorInd[9][1].trim()); //Max reorganización
        if (bloque == 0) {//Indice vacío?
            bloque += 1;           
            createBlock("C:\\MEIA\\bloque_" + bloque + ".txt", user);//Se crea un nuevo bloque
        }
        String blockPath = "C:\\MEIA\\bloque_" + bloque + ".txt";//Ruta del bloque
        String blockDesc = "C:\\MEIA\\desc_bloque_" + bloque + ".txt";//ruta descriptor bloque
        String[][] descriptorB = getDescriptorBloque(blockDesc);
        
        int cantBloque = Integer.parseInt(descriptorB[5][1].trim());
        if (cantBloque < maxOrg) {
            addToBlock(blockPath, blockDesc, ingreso, user);
            //Añadir al indice, actualizar lista, actualizar descriptor
        }else{
            bloque += 1;           
            createBlock("C:\\MEIA\\bloque_" + bloque + ".txt", user);//Se un nuevo bloque
            Add(key, ingreso, pathInd, IndDesc, user);
        }
        
    }
    
    private String[][] getDescriptorInd(String ruta){
        String[][] fileInfo = new String[11][2];
        File file = new File(ruta);
        if (file.exists() == true) {
            try{
                FileReader LecturaArchivo = new FileReader(file);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                for (int i = 0; i < 11; i++) {
                    String[] line = LeerArchivo.readLine().split(":");
                    fileInfo[i][0] = line[0];
                    fileInfo[i][1] = line[1];
                }
                LecturaArchivo.close();
                LeerArchivo.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", WIDTH);
            }
        }
        return fileInfo;
    }
    
    private String[][] getDescriptorBloque(String ruta){
        String[][] fileInfo = new String[9][2];
        File file = new File(ruta);
        if (file.exists() == true) {
            try{
                FileReader LecturaArchivo = new FileReader(file);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                for (int i = 0; i < 8; i++) {
                    String[] line = LeerArchivo.readLine().split(":");
                    fileInfo[i][0] = line[0];
                    fileInfo[i][1] = line[1];
                }
                LecturaArchivo.close();
                LeerArchivo.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", WIDTH);
            }
        }
        return fileInfo;
    }
    
    private ArrayList<String> getIndice(String pathInd){
        ArrayList<String> resultado = new ArrayList<>();
        File indice = new File(pathInd);
        FileReader LecturaArchivo;
        BufferedReader LeerArchivo;
        if (indice.exists()) {
            try {
                LecturaArchivo = new FileReader(indice);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                Linea=LeerArchivo.readLine();
                while(Linea != null){
                    if(Linea.endsWith("1")){
                        resultado.add(Linea);
                    }
                }
                LecturaArchivo.close();
                LeerArchivo.close();
            } catch (IOException ex) {
                Logger.getLogger(SecuencialIndexado.class.getName()).log(Level.SEVERE, null, ex);                
            }
        }        
        return resultado;
    }
    
    private void createBlock(String path, String user){
        File block = new File(path);
        try {
            block.createNewFile();
            String descName = "desc_" + block.getName() + ".txt";
            String descPath = "C:\\MEIA\\" + descName;
            File blockDesc = new File(descPath);
            blockDesc.createNewFile();
            String fechaMod = dtf.format(LocalDateTime.now());
            String descInfo = "nombre_simbolico: " + descName + System.getProperty( "line.separator" )
                    + "fecha_creacion: " + fechaMod +System.getProperty( "line.separator" )
                    + "usuario_creacion: " + user + System.getProperty( "line.separator" )
                    + "fecha_modificación: " + System.getProperty( "line.separator" )
                    + "usuario_modificación: " + System.getProperty( "line.separator" )                    
                    + "#_registros: 0" + System.getProperty( "line.separator" )
                    + "registros_activos: 0" + System.getProperty( "line.separator" )
                    + "registros_inactivos: 0";
            FileWriter Escribir = new FileWriter(descPath,true);;
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(descInfo);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(SecuencialIndexado.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void addToBlock(String path, String pathDesc, String info, String user){
        String[][] descriptor = getDescriptorBloque(pathDesc);        
        String error = "";
        int cantidad = Integer.parseInt(descriptor[5][1].trim()) + 1;
        int regAct = Integer.parseInt(descriptor[6][1].trim()) + 1;
        descriptor[3][1] = dtf.format(LocalDateTime.now());
        descriptor[4][1] = user;
        descriptor[5][1] = cantidad + "";
        descriptor[6][1] = regAct + "";
        LlenarArchivo(path, info, error);
        setDescriptor(descriptor, pathDesc, 7);
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
    
    private void setDescriptor(String[][] descriptor, String Path, int n){
        try
        {     
            File Archivo = new File(Path);
            FileWriter Escribir = new FileWriter(Archivo);
            for (int i = 0; i < n; i++) {
                
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
}
