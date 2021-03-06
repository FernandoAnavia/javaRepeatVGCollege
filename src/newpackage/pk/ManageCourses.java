/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.pk;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author feran
 */
public class ManageCourses extends javax.swing.JFrame {

    /**
     * Creates new form ManageUsers
     */
    public ManageCourses() {
        initComponents();
        fillCombos();
    }  
    
        private void fillCombos(){
        try {
            String sqlDegree ="SELECT DegreeId from vgccollege.degree";
            
            Connection conn = MySQLConnection.getConnection();
            PreparedStatement pstD = conn.prepareStatement(sqlDegree);
            ResultSet rsD = pstD.executeQuery();

            
            while (rsD.next()){
                String degreeCombo = rsD.getString("DegreeId");
                degreeComboView.addItem(degreeCombo);               
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CourseIdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBD = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        showUsersBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        degreeComboView = new javax.swing.JComboBox();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("jLabel2");

        jTextField2.setText("jTextField1");

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Course ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Degree ID");

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        tableBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableBD);

        exitBtn.setBackground(new java.awt.Color(255, 102, 102));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        showUsersBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        showUsersBtn.setText("Show Courses");
        showUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUsersBtnActionPerformed(evt);
            }
        });

        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showUsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CourseIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(degreeComboView, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(createBtn)
                .addGap(51, 51, 51)
                .addComponent(updateBtn)
                .addGap(50, 50, 50)
                .addComponent(deleteBtn)
                .addGap(42, 42, 42)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(showUsersBtn)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CourseIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(degreeComboView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
            
            String courseIdStr = CourseIdField.getText();
            String courseNameStr = NameField.getText();
            String degreeCStr = degreeComboView.getSelectedItem().toString();
            
            

            try (Connection conn = MySQLConnection.getConnection()){
                
              
                String mySQLQuery = 
                    "INSERT INTO vgccollege.course" + "(CourseId, courseName, DegreeId)" 
                        + "VALUES (?,?,?)";
                        

            PreparedStatement pst = conn.prepareStatement(mySQLQuery);
           
            pst.setString(1, courseIdStr);
            pst.setString(2, courseNameStr);
            pst.setString(3, degreeCStr);              
            pst.executeUpdate();
            
 
            JOptionPane.showMessageDialog(null, "New Course created successfully");
              
               
            }catch (Exception exception) {
                            
                
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
            
            
        }
            
         
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        
        int confirmation = JOptionPane.showConfirmDialog(null, "Are your sure you want to delete the course?","Warning", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == 0)
            
        {
                    
        try (Connection conn = MySQLConnection.getConnection()){

            
                            String sqlDel = 
                    "DELETE FROM vgccollege.course" + " WHERE CourseId =?";
            
            PreparedStatement pst = conn.prepareStatement(sqlDel);
            pst.setString(1, CourseIdField.getText());
            int i = pst.executeUpdate();
            pst.executeUpdate();

            
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Course deleted successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Course not found");
                }
                
            }catch(Exception exception) {
                                           
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        } 
        } else {
            
            JOptionPane.showMessageDialog(null, "The Course wasn't deleted");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
            String courseIdStr = CourseIdField.getText();
            String courseNameStr = NameField.getText();
            String degreeCStr = degreeComboView.getSelectedItem().toString();
            
            
        try (Connection conn = MySQLConnection.getConnection()){
                
             
                String mySQLQuery = 
                    "UPDATE vgccollege.course" + " SET courseName=?, DegreeId=? WHERE CourseId=?";                        

            PreparedStatement pst = conn.prepareStatement(mySQLQuery);
             
            pst.setString(3, courseIdStr);
            pst.setString(1, courseNameStr);
            pst.setString(2, degreeCStr);
            
            int i = pst.executeUpdate();
            pst.executeUpdate();
            
            
                if(i>0){
                    JOptionPane.showMessageDialog(null, "course updated successful");
                } else {
                    JOptionPane.showMessageDialog(null, "course could not be made");
                }
              
              
                
            }catch (Exception exception) {
                            
                
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
            
            
        }
        

    }//GEN-LAST:event_updateBtnActionPerformed

    private void showUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUsersBtnActionPerformed
        // TODO add your handling code here:
     
        try (Connection conn = MySQLConnection.getConnection()){
                
                String sql = "SELECT * FROM vgccollege.course";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                tableBD.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch (Exception exception) {
                                         
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        
    }//GEN-LAST:event_showUsersBtnActionPerformed
    }
        
    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        // TODO add your handling code here:

        
        String userIDStr = CourseIdField.getText();
        
            try (Connection conn = MySQLConnection.getConnection()){
                
                
                String sql = "SELECT * FROM vgccollege.course" + " WHERE CourseId = '" + userIDStr + "'";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeQuery();
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    NameField.setText(rs.getString("courseName"));
                    degreeComboView.setSelectedItem(rs.getString("DegreeId"));
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Course  wasn't found");
                }
                    
                
            }catch (Exception exception) {
                                         
            JOptionPane.showMessageDialog(null, exception);
            exception.printStackTrace();
        
    }
        
        
    }//GEN-LAST:event_findBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        CourseIdField.setText("");
        NameField.setText("");

        
        
    }//GEN-LAST:event_clearBtnActionPerformed

        
    
    
    
    
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
            java.util.logging.Logger.getLogger(ManageCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CourseIdField;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox degreeComboView;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton showUsersBtn;
    private javax.swing.JTable tableBD;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
