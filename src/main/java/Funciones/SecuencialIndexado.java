/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        int start = 0;
        ArrayList<String> indice = getIndice(pathInd);
        
        return "null";
    }
    
    public void Add(String key, String ingreso, String pathInd, String IndDesc, String user){
        String[] registro = ingreso.split("[|]");
        String[][] DescriptorInd = getDescriptorInd(IndDesc);
        
        String fechaMod;
        if (DescriptorInd[1][1].equals(" ") && DescriptorInd[2][1].equals(" ")) {
            fechaMod = dtf.format(LocalDateTime.now()); //fecha mod
            DescriptorInd[1][1] = fechaMod;
            DescriptorInd[2][1] = user;
        }               
                
        int bloque = Integer.parseInt(DescriptorInd[10][1]);
        
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
            } catch (IOException ex) {
                Logger.getLogger(SecuencialIndexado.class.getName()).log(Level.SEVERE, null, ex);                
            }
        }
        return resultado;
    }
    
    private void createBlock(String path, int id){
        
    }
}
