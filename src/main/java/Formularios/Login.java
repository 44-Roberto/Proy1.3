/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import java.awt.Color;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Roberto Moya
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPFctn = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JBCrear = new javax.swing.JButton();
        jTBMostrar = new javax.swing.JToggleButton();
        JTFUser = new javax.swing.JTextField();
        logo_lbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 204));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Ingrese un Usuario");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Ingrese una Contraseña");

        jPFctn.setBackground(new java.awt.Color(153, 153, 153));
        jPFctn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFctnActionPerformed(evt);
            }
        });
        jPFctn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPFctnKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setText("Crear usuario");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        JBCrear.setBackground(new java.awt.Color(153, 153, 153));
        JBCrear.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBCrear.setForeground(new java.awt.Color(255, 255, 255));
        JBCrear.setText("Iniciar Sesión");
        JBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearActionPerformed(evt);
            }
        });

        jTBMostrar.setBackground(new java.awt.Color(153, 153, 153));
        jTBMostrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jTBMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jTBMostrar.setText("Mostrar");
        jTBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBMostrarActionPerformed(evt);
            }
        });

        JTFUser.setBackground(new java.awt.Color(153, 153, 153));
        JTFUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUserActionPerformed(evt);
            }
        });
        JTFUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFUserKeyTyped(evt);
            }
        });

        logo_lbl.setIcon(new javax.swing.ImageIcon("C:\\MEIA\\fotografia\\spotify.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Spotify");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPFctn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jTBMostrar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(logo_lbl))
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFctn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTBMostrar))
                .addGap(18, 18, 18)
                .addComponent(JBCrear)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBMostrarActionPerformed
        // TODO add your handling code here:
        if(jTBMostrar.isSelected())
        {
            jPFctn.setEchoChar((char)0);
            jTBMostrar.setText("Ocultar");
        }
        else
        {
            jPFctn.setEchoChar('\u2022');
            jTBMostrar.setText("Mostrar");
        }
    }//GEN-LAST:event_jTBMostrarActionPerformed

    private void JBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearActionPerformed
        // TODO add your handling code here:}
        if (JTFUser.getText().isBlank() || jPFctn.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos ", "Ingreso no válido", WIDTH);
        }
         String contra= new String(jPFctn.getPassword());
        int CTNLong =0;
        int CAux=0;
        String Usuario="";
        String CTN="";
        int[] split=new int[8];
        int[] RangoINF=new int[4];
        int[] RangoSUP=new int[4];
        CTNLong=contra.length();

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
                
                
                try {
                    String Linea;
                String[] User;
                    Linea=LeerArchivo.readLine();
                    
                    
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                           User=Linea.split("|");
                            
                           Usuario=User[0];
                           CTN=User[3];
                           FotoPath=User[7];
                           rol = Integer.parseInt(User[8]);
                           if(JTFUser.getText().equals(Usuario))
                                {
                                    if(jPFctn.getText().equals(CTN))
                                    {
                                        STR_LINE=Linea;
                                      CAux=1;
                                      break;
                                    }              
                                }
                        }
                        Linea=LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();
                                        
                    LecturaArchivo = new FileReader(archivoBitUsuario);
                    LeerArchivo = new BufferedReader(LecturaArchivo);
                    String Linea2;
                String[] User2;
                    Linea2 = LeerArchivo.readLine();
                    while(Linea != null){
                        if (!"".equals(Linea2)) {
                            User2=Linea2.split("|");
                            Usuario=User2[0];
                            CTN=User2[3];
                            FotoPath=User2[7];
                            rol = Integer.parseInt(User2[8]);
                            
                            if (JTFUser.getText().equals(Usuario)) {
                                if(jPFctn.getText().equals(CTN))
                                {
                                     STR_LINE=Linea2;
                                    CAux=1;
                                    break;
                                }
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
        
        
        if(CAux==1)
        {
            CAux=0;
             usertx=Usuario;
               Menu m1 = new Menu();
                m1.setVisible(true);
                this.setVisible(false);
        }
//        if(JTFUser.getText().equals(Usuario))
//        {
//            if(jPFctn.getText().equals(CTN))
//            {
//              usertx=Usuario;
//                Menu m1 = new Menu();
//                m1.setVisible(true);
//                  this.setVisible(false);
//            }
//                
//              
//        }
        //Salida S1= new Salida();

        //S1.setVisible(true);
       // dispose();

    }//GEN-LAST:event_JBCrearActionPerformed
  public static String usertx="";
  public static String STR_LINE="";
  public static String FotoPath="";
  public static int rol = 0;
    private void jPFctnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFctnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFctnActionPerformed

    private void JTFUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUserActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        //Salida S1= new Salida();
        ValAdm2=2;
           CreateUsersForm s1 = new CreateUsersForm();
        s1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
public static int ValAdm2=0;
    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
         jLabel3.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel3MouseExited

    private void JTFUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFUserKeyTyped
        // TODO add your handling code here:
        if (JTFUser.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFUserKeyTyped

    private void jPFctnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFctnKeyTyped
        // TODO add your handling code here:
        if (jPFctn.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_jPFctnKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCrear;
    private javax.swing.JTextField JTFUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPFctn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jTBMostrar;
    private javax.swing.JLabel logo_lbl;
    // End of variables declaration//GEN-END:variables
}
