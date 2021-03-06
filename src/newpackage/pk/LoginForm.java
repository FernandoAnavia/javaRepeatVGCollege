/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.pk;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.Properties;

/**
 *
 * @author feran
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userIDText = new javax.swing.JTextField();
        loginCombo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/pk/images/loginIcon_1.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN AS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PASSWORD");

        userIDText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        loginCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Lecturer", "Student" }));
        loginCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginComboActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new java.awt.GridLayout(1, 1, 5, 0));

        loginBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIDText)
                    .addComponent(loginCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordText, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loginCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
            String userIDStr = userIDText.getText();
            String passwordStr = passwordText.getText();
            String userTypeStr = loginCombo.getSelectedItem().toString();
            

            
        if (userTypeStr == "Admin"){
            
  
            
            
            try (Connection conn = MySQLConnection.getConnection()){
                
                
                
                String mySQLQuery = 
                    "SELECT firstName, lastName FROM adminmember Where AdminId= '" +
                    userIDStr +
                    "'" + "And loginPassword= '" +
                    passwordStr +
                    "'";
            
            PreparedStatement preparedStatement = conn.prepareStatement(mySQLQuery);
            ResultSet resultSet= preparedStatement.executeQuery();
            
                    if (resultSet.next()) {
                            
                            String StudentID = userIDText.getText();  
                            String fullName = resultSet.getString(1) + " " + resultSet.getString(2);
                            LoginSesion.fullUserName =  fullName;
                            LoginSesion.UID = userIDStr;
                            LoginSesion.Usertype = userTypeStr;
                            new AdmDashboard().setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Please enter a valid Username/Password");
                        }
            
            }catch (Exception exception) {
            JOptionPane.showInternalMessageDialog(this, "Database failure");
            
            
        }
        } else {
            
            if (userTypeStr == "Lecturer"){
            
  
            
            try (Connection conn = MySQLConnection.getConnection()){
                
                
               
                String mySQLQuery = 
                    "SELECT firstName, lastName FROM Lecturer Where LecturerId= '" +
                    userIDStr +
                    "'" + "And loginPassword= '" +
                    passwordStr +
                    "'";
            
            PreparedStatement preparedStatement = conn.prepareStatement(mySQLQuery);
            ResultSet resultSet= preparedStatement.executeQuery();
            
                    if (resultSet.next()) {
                            
                            String LecturerID = userIDText.getText();
                            String fullName = resultSet.getString(1) + " " + resultSet.getString(2);
                            LoginSesion.fullUserName =  fullName;
                            LoginSesion.UID = userIDStr;
                            LoginSesion.Usertype = userTypeStr;
                            
                            //LoginSesion.UsertypeSesion = resultSet.getString("usertype")
                                    
                            new LDashboard().setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Please enter a valid Username/Password");
                        }
            
            }catch (Exception exception) {
            JOptionPane.showInternalMessageDialog(this, "Database failure");
            
        }
        
            } else {
            
            if (userTypeStr == "Student"){
            
  
            
            try (Connection conn = MySQLConnection.getConnection()){
                

                String mySQLQuery = 
                    "SELECT firstName, lastName FROM Student Where StudentId= '" +
                    userIDStr +
                    "'" + "And loginPassword= '" +
                    passwordStr +
                    "'";
            
            PreparedStatement preparedStatement = conn.prepareStatement(mySQLQuery);
            ResultSet resultSet= preparedStatement.executeQuery();
            
                    if (resultSet.next()) {
                            
                            String StudentID = userIDText.getText();
                            String fullName = resultSet.getString(1) + " " + resultSet.getString(2);
                            LoginSesion.fullUserName =  fullName;
                            LoginSesion.UID = userIDStr;
                            LoginSesion.Usertype = userTypeStr;
                            new StDashboard().setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Please enter a valid Username/Password");
                        }
            
            }catch (Exception exception) {
            JOptionPane.showInternalMessageDialog(this, "Database failure");
            
                    } 
                } 
            } 
        }       
    }//GEN-LAST:event_loginBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginComboActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginBtn;
    private javax.swing.JComboBox loginCombo;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField userIDText;
    // End of variables declaration//GEN-END:variables
}
