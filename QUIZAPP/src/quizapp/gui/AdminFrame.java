
package quizapp.gui;

import java.awt.Frame;
import javax.swing.JOptionPane;
import quizapp.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        lblHead.setText("Hello "+UserProfile.getUserName());
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
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbRegister = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Make A Choice");

        jrbSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSetPaper);
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSetPaper.setForeground(new java.awt.Color(255, 102, 0));
        jrbSetPaper.setText("Set A Paper");

        jrbEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(255, 102, 0));
        jrbEditPaper.setText("Edit Paper");

        jrbRegister.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbRegister);
        jrbRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRegister.setForeground(new java.awt.Color(255, 102, 0));
        jrbRegister.setText("Register Student");

        jrbViewScores.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewScores);
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 102, 0));
        jrbViewScores.setText("View Scores");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 102, 0));
        btnDoTask.setText("DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/gui/admin.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        lblHead.setBackground(new java.awt.Color(0, 0, 0));
        lblHead.setForeground(new java.awt.Color(255, 102, 0));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 102, 0));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(139, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbViewScores)
                                    .addComponent(jrbRegister)
                                    .addComponent(jrbEditPaper)
                                    .addComponent(jrbSetPaper)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSetPaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbEditPaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbViewScores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(btnDoTask)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
    String option=getOption();
    if(option==null)
    {
        JOptionPane.showMessageDialog(null,"PLEASE CHOOSE ANY OPTION!!","ERROR",JOptionPane.ERROR_MESSAGE);
        return;
        
    }
    Frame f;
    if(option==null)
        JOptionPane.showMessageDialog(null, "please select an option first!","NO Selection!",JOptionPane.ERROR_MESSAGE); 
    else
        if(option.equals("Set A Paper"))
        {
         this.dispose();
        
            f=new PaperSettingFrame();
            f.setVisible(true);        
        }       
            else
        if(option.equals("Edit Paper"))
        {
            this.dispose();
            f=new EditPaperFrame();
             f.setVisible(true);
             
        }
            else 
            if(option.equals("Register Student"))
            {
                this.dispose();
                f=new RegisterStudentFrame();
              f.setVisible(true);
            }
            else 
                if(option.equals("View Scores"))
                {
                this.dispose();
                    f=new ViewScoresFrame();
                f.setVisible(true);
                }
     
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
  LoginFrame newLoginFrame=new LoginFrame();
        this.dispose();
        newLoginFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbRegister;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables

    private String getOption() {
     if(jrbSetPaper.isSelected())
         return jrbSetPaper.getActionCommand();
     else if(jrbEditPaper.isSelected())
         return jrbEditPaper.getActionCommand();
     else if(jrbRegister.isSelected())
         return jrbRegister.getActionCommand();
     else if(jrbViewScores.isSelected())
         return jrbViewScores.getActionCommand();
     else
         return null;
     
    }
}