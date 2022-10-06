/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import static Formularios.Login.FotoPath;
import static Formularios.Login.STR_LINE;
import static Formularios.Login.rol;
import javax.swing.JOptionPane;
//import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import java.io.*;
/**
 *
 * @author AndresLima
 */
public class OperationsForm extends javax.swing.JFrame {

    /**
     * Creates new form OperationsForm
     */
    public OperationsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        modify_btn = new javax.swing.JButton();
        phone_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mail_txt = new javax.swing.JTextField();
        search_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        lastname_txt = new javax.swing.JTextField();
        user_txt = new javax.swing.JTextField();
        fotoPath_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_rdb = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        foto_btn = new javax.swing.JButton();
        date_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        user_rdb = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        modify_btn.setBackground(new java.awt.Color(102, 102, 102));
        modify_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        modify_btn.setForeground(new java.awt.Color(153, 153, 153));
        modify_btn.setText("Modificar");
        modify_btn.setEnabled(false);
        modify_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_btnActionPerformed(evt);
            }
        });

        phone_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        phone_txt.setEnabled(false);
        phone_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_txtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Operaciones");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        delete_btn.setBackground(new java.awt.Color(102, 102, 102));
        delete_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(153, 153, 153));
        delete_btn.setText("Eliminar");
        delete_btn.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Buscar usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mail_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        mail_txt.setEnabled(false);
        mail_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mail_txtKeyTyped(evt);
            }
        });

        search_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_txtKeyTyped(evt);
            }
        });

        password_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        password_txt.setEnabled(false);
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });

        lastname_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lastname_txt.setEnabled(false);
        lastname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname_txtKeyTyped(evt);
            }
        });

        user_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user_txt.setEnabled(false);
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

        fotoPath_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        fotoPath_txt.setEnabled(false);
        fotoPath_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fotoPath_txtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        name_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        name_txt.setEnabled(false);
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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        admin_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        admin_rdb.setForeground(new java.awt.Color(255, 255, 255));
        admin_rdb.setText("Administrador");
        admin_rdb.setEnabled(false);
        admin_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_rdbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol");

        foto_btn.setBackground(new java.awt.Color(102, 102, 102));
        foto_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        foto_btn.setForeground(new java.awt.Color(153, 153, 153));
        foto_btn.setText("Escoger foto");
        foto_btn.setEnabled(false);
        foto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto_btnActionPerformed(evt);
            }
        });

        date_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        date_txt.setEnabled(false);
        date_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                date_txtKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono");

        user_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user_rdb.setForeground(new java.awt.Color(255, 255, 255));
        user_rdb.setText("Usuario");
        user_rdb.setEnabled(false);
        user_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_rdbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(admin_rdb)
                                            .addComponent(user_rdb))
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
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
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(foto_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modify_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(user_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(foto_btn)
                                        .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(admin_rdb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_rdb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_btn)
                            .addComponent(modify_btn))
                        .addGap(16, 16, 16)))
                .addGap(34, 34, 34))
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

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void user_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_txtKeyTyped
        // TODO add your handling code here:
        if(user_txt.getText().length() >= 20){
            evt.consume();
        }
    }//GEN-LAST:event_user_txtKeyTyped

    private void admin_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_rdbActionPerformed
        // TODO add your handling code here:
        if(admin_rdb.isSelected())
        {
            user_rdb.setSelected(false);
        }
    }//GEN-LAST:event_admin_rdbActionPerformed

    private void date_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_txtKeyTyped
        // TODO add your handling code here:
        if (date_txt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_date_txtKeyTyped

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
    
    public String searchUser(String Name)
    {
        
        String Usuario="";
        String CTN="";
         File archivoUsuario = new File("C:\\MEIA\\usuario.txt");
        File archivoBitUsuario = new File("C:\\MEIA\\bitacora_usuario.txt");
        if(archivoUsuario.exists()==true)
        {
            //String[] User;
            FileReader LecturaArchivo;
            
            try {
                LecturaArchivo = new FileReader(archivoUsuario);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                //String Linea="";
                
                String Linea;
                String[] User;
                try {
                    Linea=LeerArchivo.readLine();
                    
                    
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                           User=Linea.split("|");
                            
                           Usuario=User[0];                      
                           
                          if(Name.equals(Usuario))
                            {
                             return Linea;
                            
                            
                            }              
                                
                        }
                        Linea=LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();
                                        
                    LecturaArchivo = new FileReader(archivoBitUsuario);
                    LeerArchivo = new BufferedReader(LecturaArchivo);
                    Linea = LeerArchivo.readLine();
                    while(Linea != null){
                        if (!"".equals(Linea)) {
                            User=Linea.split("|");
                             
                            
                           Usuario=User[0];                      
                           
                          if(Name.equals(Usuario))
                            {
                             return Linea;
                            
                            
                            }              
                                
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
     return "no";
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
    private void modify_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_btnActionPerformed
        // TODO add your handling code here:
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
            int rol = 0, estatus = 0;
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

            //Comienza la escritura de datos

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error al tratar de ingresar los datos " + e.getMessage(), "Error", WIDTH);
        }

    }//GEN-LAST:event_modify_btnActionPerformed

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

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
        // TODO add your handling code here:
        if (name_txt.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_name_txtKeyTyped

    private void foto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser("C:\\MEIA\\fotografia");

        File ficheroImagen;
        String rutaArchivo;

        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();

            fotoPath_txt.setText(rutaArchivo);
        }
    }//GEN-LAST:event_foto_btnActionPerformed

    private void phone_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_txtKeyTyped
        // TODO add your handling code here:
        if (phone_txt.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_phone_txtKeyTyped

    private void search_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyTyped
        // TODO add your handling code here:
        if (search_txt.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_search_txtKeyTyped

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
        // TODO add your handling code here:
        if (password_txt.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_password_txtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(searchUser(search_txt.getText()).equals("no"))
        {
            search_txt.setText("No se encontro");
            
        }
        else
        {
            String[] Line;
            Line=searchUser(search_txt.getText()).split("|");
            
            user_txt.setText(Line[0]);
            name_txt.setText(Line[1]);
            lastname_txt.setText(Line[2]);
            password_txt.setText(Line[3]);
            date_txt.setText(Line[4]);
            mail_txt.setText(Line[5]);
            phone_txt.setText(Line[6]);
            fotoPath_txt.setText(Line[7]);
            if(Integer.parseInt(Line[8].trim())==1)
            {
                admin_rdb.setSelected(true);
                user_rdb.setSelected(false);
            }
            else
            {
                admin_rdb.setSelected(false);
                user_rdb.setSelected(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(OperationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin_rdb;
    private javax.swing.JTextField date_txt;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField fotoPath_txt;
    private javax.swing.JButton foto_btn;
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
    private javax.swing.JButton modify_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTextField search_txt;
    private javax.swing.JRadioButton user_rdb;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
