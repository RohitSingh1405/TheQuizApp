/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import quizapp.dao.PerformanceDAO;
import quizapp.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        
        super.setLocationRelativeTo(null);
lblHead.setText("Hello "+UserProfile.getUserName());
    }

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        LoginFrame newLoginFrame=new LoginFrame();
        this.dispose();
        newLoginFrame.setVisible(true);
    }                                        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbTakeTest = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        jrbChangePassword = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ONLINE QUIZ STUDENT PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Make A Choics");

        jrbTakeTest.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbTakeTest);
        jrbTakeTest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbTakeTest.setForeground(new java.awt.Color(255, 153, 0));
        jrbTakeTest.setText("Take Test");

        jrbViewScores.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewScores);
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 153, 0));
        jrbViewScores.setText("View Scores");
        jrbViewScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewScoresActionPerformed(evt);
            }
        });

        jrbChangePassword.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbChangePassword);
        jrbChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbChangePassword.setForeground(new java.awt.Color(255, 153, 0));
        jrbChangePassword.setText("Change Password");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 153, 0));
        btnDoTask.setText("DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/gui/student.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 102, 0));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblHead.setBackground(new java.awt.Color(0, 0, 0));
        lblHead.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, Short.MAX_VALUE)
                        .addGap(211, 211, 211)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jrbChangePassword)
                                    .addComponent(jrbTakeTest)
                                    .addComponent(jrbViewScores))
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLogout)
                                .addGap(39, 39, 39))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogout)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jrbTakeTest)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScores)
                        .addGap(18, 18, 18)
                        .addComponent(jrbChangePassword)
                        .addGap(58, 58, 58)
                        .addComponent(btnDoTask))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
                                     
        // TODO add your handling code here:
        LoginFrame newLoginFrame=new LoginFrame();
        this.dispose();
        newLoginFrame.setVisible(true);
           // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseClicked

    
    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
           if(validateInputs()==false){
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jrbTakeTest.isSelected())
        {
            PaperSelectionFrame paperFrame=new PaperSelectionFrame();
            paperFrame.setVisible(true);
            
        }
        else if(jrbViewScores.isSelected())
        {
            try
            {
            ArrayList<String> examIdList=PerformanceDAO.getAllExamId(UserProfile.getUserName());
            if(examIdList.size()==0){
            JOptionPane.showMessageDialog(null, "You haven't appeared for any exam yet!","No Records!!",JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            ViewSingleStudentScoreFrame scoreFrame=new ViewSingleStudentScoreFrame(examIdList);
            scoreFrame.setVisible(true);
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();  
            }
           
        }
        else if(jrbChangePassword.isSelected())
        {
            ChangePasswordFrame passwordFrame=new ChangePasswordFrame();
            passwordFrame.setVisible(true);	
            
        }
        this.dispose();

   
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrbViewScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewScoresActionPerformed

    }//GEN-LAST:event_jrbViewScoresActionPerformed

    private String getOption()
{
    if(jrbTakeTest.isSelected())
        return jrbTakeTest.getActionCommand();
    else if(jrbViewScores.isSelected())
        return jrbViewScores.getActionCommand();
    else if(jrbChangePassword.isSelected())
        return jrbChangePassword.getActionCommand();
    else return null;
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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbChangePassword;
    private javax.swing.JRadioButton jrbTakeTest;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables
private boolean validateInputs(){
    if(jrbTakeTest.isSelected()==false && jrbViewScores.isSelected()==false && jrbChangePassword.isSelected()==false)
        return false;
    return true;
}

}
