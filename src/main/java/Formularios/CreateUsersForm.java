/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import Funciones.AESencripter;
import Funciones.ArchivoSecuencial;

/**
 *
 * @author AndresLima
 */
public class CreateUsersForm extends javax.swing.JFrame {
    
    File file;
    File archivo = new File("C:\\MEIA\\usuario.txt");
    File archivo2 = new File("C:\\MEIA\\bitacora_usuario.txt");
    byte[] image;
    FileInputStream input;
    FileOutputStream output;
    FileReader LecturaArchivo;
    BufferedReader LeerArchivo;
    FileWriter Escribir;
    BufferedWriter bw;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public static String fotoPath;
    /**
     * Creates new form CreateUsersForm
     */
    public CreateUsersForm() {
        initComponents();
        this.setLocationRelativeTo(null);         
            Menu m1= new Menu();
            Login l1=new Login();
            
        if (archivo.length() == 0 && archivo2.length() == 0) {                
            admin_rdb.setSelected(true);
            user_rdb.setSelected(false);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
        else if(m1.ValAdm==1)
        {
            admin_rdb.setSelected(false);
            user_rdb.setSelected(true);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
        else if(l1.ValAdm2==2)
        {
            admin_rdb.setSelected(false);
            user_rdb.setSelected(true);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        mail_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fotoPath_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone_txt = new javax.swing.JTextField();
        user_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin_rdb = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        user_rdb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        add_btn.setBackground(new java.awt.Color(102, 102, 102));
        add_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Agregar usuario");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Crear usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_txtKeyTyped(evt);
            }
        });

        mail_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mail_txtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        lastname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname_txtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");

        fotoPath_txt.setEditable(false);
        fotoPath_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fotoPath_txtKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Escoger foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        phone_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_txtKeyTyped(evt);
            }
        });

        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        user_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_txtKeyTyped(evt);
            }
        });

        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        admin_rdb.setBackground(new java.awt.Color(51, 51, 51));
        admin_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        admin_rdb.setForeground(new java.awt.Color(255, 255, 255));
        admin_rdb.setText("Administrador");
        admin_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_rdbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol");

        date_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                date_txtKeyTyped(evt);
            }
        });

        user_rdb.setBackground(new java.awt.Color(51, 51, 51));
        user_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user_rdb.setForeground(new java.awt.Color(255, 255, 255));
        user_rdb.setText("Usuario");
        user_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_rdbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(26, 26, 26)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_rdb)
                                    .addComponent(admin_rdb))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(78, 78, 78)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(date_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mail_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jButton1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phone_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add_btn)
                        .addGap(44, 44, 44)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(admin_rdb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_rdb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(add_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
        // TODO add your handling code here:
        if (name_txt.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_name_txtKeyTyped

    private void user_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_txtKeyTyped
        // TODO add your handling code here:
        if(user_txt.getText().length() >= 20){
            evt.consume();
        }
    }//GEN-LAST:event_user_txtKeyTyped

    private void date_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_txtKeyTyped
        // TODO add your handling code here:
        if (date_txt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_date_txtKeyTyped

    private void mail_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mail_txtKeyTyped
        // TODO add your handling code here:
        if (mail_txt.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_mail_txtKeyTyped

    private void lastname_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastname_txtKeyTyped
        // TODO add your handling code here:
        if (lastname_txt.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_lastname_txtKeyTyped

    private void fotoPath_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fotoPath_txtKeyTyped
        // TODO add your handling code here:
        if (fotoPath_txt.getText().length() >= 200) {
            evt.consume();
        }
    }//GEN-LAST:event_fotoPath_txtKeyTyped

    private void phone_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_txtKeyTyped
        // TODO add your handling code here:
        if (phone_txt.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_phone_txtKeyTyped

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
        // TODO add your handling code here:
        if (password_txt.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_password_txtKeyTyped

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        
        
         String contra= new String(password_txt.getPassword());
        int CTNLong =0;
        int VPaso=0;//Validar el paso de la contraseña
        int CAux=0;
        String Usuario="";
        String CTN="";
        int[] split=new int[8];
        int[] RangoINF=new int[4];
        int[] RangoSUP=new int[4];
        CTNLong=contra.length();
        //Lectura del archivo 1. PUNTUACION
        File archivoUNO = new File("C:\\MEIA\\puntuacion.txt");

        if(archivoUNO.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(archivoUNO);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                //String Linea="";
                String Linea;
                try {
                    Linea=LeerArchivo.readLine();

                    int indice=0;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split[indice]=Integer.parseInt(Linea);

                            indice++;
                        }
                        Linea=LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {

            }
        }
        else
        {

        }
        //Lectura del archivo 2. PUNTUACION
        File archivoDOS = new File("C:\\MEIA\\resultado.txt");

        if(archivoDOS.exists()==true)
        {
            FileReader LecturaArchivo2;
            try {
                LecturaArchivo2 = new FileReader(archivoDOS);
                BufferedReader LeerArchivo2 = new BufferedReader(LecturaArchivo2);
                //String Linea="";
                String Linea2;
                try {
                    Linea2=LeerArchivo2.readLine();

                    String[] strSplit;
                    int indice=0;
                    while(Linea2 != null)
                    {
                        if(!"".equals(Linea2))
                        {
                            strSplit=Linea2.split(",");
                            RangoINF[indice]=Integer.parseInt(strSplit[0]);
                            RangoSUP[indice]=Integer.parseInt(strSplit[1]);

                            indice++;
                        }
                        Linea2=LeerArchivo2.readLine();
                    }

                    LecturaArchivo2.close();
                    LeerArchivo2.close();

                } catch (IOException ex) {

                }
            } catch (FileNotFoundException ex) {

            }
        }
        else
        {

        }
        //***********************************
        //******Manejo de la cadena
        int NMayus=0;
        int NLetras=0;
        int Nnum=0;
        int Nsimb=0;

        for(int i=0; i<contra.length();i++)
        {
            if(contra.charAt(i)<='Z'&& contra.charAt(i)>='A')
            {
                NMayus++;
                NLetras++;
            }
            else if(contra.charAt(i)<='9'&& contra.charAt(i)>='0')
            {
                Nnum++;
            }
            else if(contra.charAt(i)<='z'&& contra.charAt(i)>='a')
            {
                NLetras++;
            }
            else
            {
                Nsimb++;
            }
        }

        //***********************************
        int puntuacion=0;
        //Comienzan las validaciones

        if(split[0]<=CTNLong)
        {
            puntuacion=split[1]+CTNLong;
            puntuacion=puntuacion +((split[2])*(NMayus));
            puntuacion=puntuacion + (NLetras+split[3]);
            puntuacion=puntuacion+(Nnum+split[4]);
            puntuacion = puntuacion + (Nsimb*(CTNLong+split[5]));

            if(NLetras!=0 && Nnum==0)
            {
                puntuacion=puntuacion-split[6];

            }
            else if(NLetras==0 && Nnum!=0)
            {
                puntuacion=puntuacion-split[7];
            }
        }
        else
        {
            
            JOptionPane.showMessageDialog(null, "No puede ingresar una contraseña con menos de "+split[0]+" caracteres. ", "Ingreso no válido", WIDTH);
             VPaso=1;
        }

        if(puntuacion>=RangoINF[0]&&puntuacion<RangoSUP[0])
        {
           
            JOptionPane.showMessageDialog(null, "Contraseña insegura. Ingrese otra contraseña. ", "Ingreso no válido", WIDTH);
            VPaso=1;
   
        }        
        if(VPaso==1)
        {
            
        }
        else{
            VPaso=0;
        if (emptyFields()) {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos ", "Ingreso no válido", WIDTH);
            return;
        }
        if (invalidChars()) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar el caracter ';' ", "Ingreso no válido", WIDTH);
            return;
        }
        try {
            String usuario = user_txt.getText(),
                   nombre = name_txt.getText(),
                   apellido = lastname_txt.getText(),
                   password = password_txt.getText(),
                   fecha = date_txt.getText(),
                   correo = mail_txt.getText(),
                   path_fotografia = fotoPath_txt.getText();
            int telefono = Integer.parseInt(phone_txt.getText());
            int rol = 0, estatus = 1;
            
            if (admin_rdb.isSelected()) {
                rol = 1;
            }
            
            if (!correct_dateFormat(fecha)) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto", "Ingreso no válido", WIDTH);
                return;
            }
            if (!correct_mailFormat(correo)) {
                JOptionPane.showMessageDialog(null, "Formato de correo incorrecto", "Ingreso no válido", WIDTH);
                return;
            }
            if(!correct_phoneFormat(phone_txt.getText())){
                JOptionPane.showMessageDialog(null, "Formato de teléfono incorrecto", "Ingreso no válido", WIDTH);
                return;
            }
            
            //Comienza la escritura de datos en bitacora
            String bitacoraUsersPath="C:\\MEIA\\bitacora_usuario.txt"; //Dirección
            String userPath = "C:\\MEIA\\usuario.txt";
            String bitacoraDesc = "C:\\MEIA\\desc_bitacora_usuario.txt";
            String userDec = "C:\\MEIA\\desc_usuario.txt";
            AESencripter encriptador = new AESencripter();
            String contraseñaCifrada = encriptador.encriptar(password, usuario);
            String Informacion = String.join("|", usuario,nombre,apellido,contraseñaCifrada,fecha,correo,path_fotografia,telefono + "",rol + "","1");
            String strError="";
            
            ArchivoSecuencial as = new ArchivoSecuencial();            
            as.Add(Informacion, bitacoraUsersPath, userPath, bitacoraDesc, userDec, usuario);
            Login l1 =new Login();
            l1.setVisible(true);
            this.setVisible(false);
            
                
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error al tratar de ingresar los datos " + e.getMessage(), "Error", WIDTH);
        }
        
        }
        
    }//GEN-LAST:event_add_btnActionPerformed
         
    public byte[] openFile(File file_){
        byte[] image_ = new byte[1024*100];
        try{
            input = new FileInputStream(file);
            input.read(image_);
        }
        catch(IOException e){
            return null;
        }
        return image_;
    }
    
    public String saveFile(File file_, byte[] image_){
        String message = null;
        try{
            output = new FileOutputStream(file_);
            output.write(image_);
            message = "Saved file";
        }
        catch(IOException e){
            return message;
        }
        return message;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser select = new JFileChooser("C:\\MEIA\\fotografia");
        
        if(select.showDialog(null, null) == JFileChooser.APPROVE_OPTION){
            String filePath_;
            file = select.getSelectedFile();
            if(file.canRead()){
                if(file.getName().endsWith("jpg") || file.getName().endsWith("png"));
                image = openFile(file);
                filePath_ = file.getPath();
                fotoPath_txt.setText(filePath_);
                fotoPath = filePath_;               
            }
            else{
                JOptionPane.showMessageDialog(null, "Unsupported file");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void admin_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_rdbActionPerformed
        // TODO add your handling code here:
        if(admin_rdb.isSelected())
        {
            user_rdb.setSelected(false);
        }
    }//GEN-LAST:event_admin_rdbActionPerformed

    private void user_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_rdbActionPerformed
        // TODO add your handling code here:
         if(user_rdb.isSelected())
        {
            admin_rdb.setSelected(false);
        }
    }//GEN-LAST:event_user_rdbActionPerformed

    public boolean emptyFields(){//Verifica que los campos ingresados no esten vacíos
        return user_txt.getText().isBlank() || name_txt.getText().isBlank() ||
                lastname_txt.getText().isBlank() || password_txt.getText().isBlank() ||
                phone_txt.getText().isBlank() || mail_txt.getText().isBlank() ||
                fotoPath_txt.getText().isBlank() || date_txt.getText().isBlank();
    }
    
    public boolean invalidChars(){//Verifica que no se ingrese el delimitador
        return user_txt.getText().contains(";") || name_txt.getText().contains(";") ||
                lastname_txt.getText().contains(";") || password_txt.getText().contains(";") ||
                phone_txt.getText().contains(";") || mail_txt.getText().contains(";") ||
                fotoPath_txt.getText().contains(";") || date_txt.getText().contains(";");
    }
    
    public boolean correct_dateFormat(String dateText){//Función que verifica el formato de la fecha
        boolean flag = true;
        if(dateText.length() != 10){
            flag = false;
        }
        String[] fecha = dateText.split("/");
        if (fecha.length != 3) {//Se verifica que se haya añadido el delimitador "/"
            flag = false;
        }        
        else{
            if(fecha[0].length() != 2 || fecha[1].length() != 2){//Formato dd y mm
                return false;
            }
            char[] day = fecha[0].toCharArray();
            if (!Character.isDigit(day[0]) || !Character.isDigit(day[1])) { //El día contiene algún caracter distinto a un número
                flag = false;
            }
            
            char[] month = fecha[1].toCharArray();
            if (!Character.isDigit(month[0]) || !Character.isDigit(month[1])) { //El mes contiene algún caracter distinto a un número
                flag = false;
            }
            
            char[] year = fecha[2].toCharArray();
            if (!Character.isDigit(year[0]) || !Character.isDigit(year[1])
                || !Character.isDigit(year[2]) || !Character.isDigit(year[3])) { //El año contiene algún caracter distinto a un número
                flag = false;
            }
        }        
        return flag;
    }
    
    public boolean correct_mailFormat(String mail){//Función que verifica el formato del correo        
        return mail.contains("@");
    }
    
    public boolean correct_phoneFormat(String phone){
        return phone.length() == 8;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JRadioButton admin_rdb;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField fotoPath_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname_txt;
    private javax.swing.JTextField mail_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JRadioButton user_rdb;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
