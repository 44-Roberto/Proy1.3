/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import java.io.*;
import Funciones.AESencripter;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author AndresLima
 */
public class ArchivoSecuencial {
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
                        registro = Linea.split("[|]");
                        if (Integer.parseInt(registro[9]) != 1) {
                            //Si el registro esta deshabilitado se regresa un null
                            return "null";
                        }
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
    
    public void Add(String[] registro, String pathBit, String pathMaster){        
        if (!Search(registro[0], pathBit).equals("null") || !Search(registro[0], pathMaster).equals("null")) {
            //Si la llave primaria ya esta en la bitácora o en el maestro se retorna
            return;
        }
        //Verificar descriptor
        //Insertar y modificar en el descriptor
    }
    
    public String[][] getDescriptor(String ruta){
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
}
