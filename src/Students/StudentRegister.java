/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Harris Abdallah Musa
 */
public class StudentRegister extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegister
     */
    Connection Con = null;
    PreparedStatement Pst = null;
    Statement St = null, St1 = null;
    ResultSet Rs = null, Rs1 = null;
   
    public StudentRegister() {
        initComponents();
    }

    int StId = 0;
    private void countStud(){
        try{
            St1 = (Statement) Con.createStatement();
            Rs1 = St1.executeQuery("select max(StudentId) from registeredstud");
            Rs1.next();
            StId = Rs1.getInt(1) +1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        StudNameTb = new javax.swing.JTextField();
        StudPasswordTb = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        RefNumberTb = new javax.swing.JTextField();
        StudEmailTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoginLnk = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Student Name");

        StudNameTb.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        StudNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudNameTbActionPerformed(evt);
            }
        });

        StudPasswordTb.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Refference Number");

        RefNumberTb.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        RefNumberTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefNumberTbActionPerformed(evt);
            }
        });

        StudEmailTb.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        StudEmailTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudEmailTbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Student Email");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setText("Already have an account?");

        LoginLnk.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        LoginLnk.setForeground(new java.awt.Color(102, 153, 255));
        LoginLnk.setText("Login");
        LoginLnk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginLnkMouseClicked(evt);
            }
        });

        RegisterBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(51, 102, 255));
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(StudNameTb)
                            .addComponent(RefNumberTb)
                            .addComponent(StudEmailTb)
                            .addComponent(StudPasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addComponent(LoginLnk))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(RegisterBtn)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RefNumberTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudEmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudPasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterBtn)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LoginLnk))
                .addContainerGap(51, Short.MAX_VALUE))
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

    private void StudNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudNameTbActionPerformed

    private void RefNumberTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefNumberTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefNumberTbActionPerformed

    private void StudEmailTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudEmailTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudEmailTbActionPerformed

    private void LoginLnkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLnkMouseClicked
        // TODO add your handling code here:
        new StudentLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginLnkMouseClicked

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        if( StudNameTb.getText().isEmpty() || RefNumberTb.getText().isEmpty() || StudEmailTb.getText().isEmpty() || StudPasswordTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "All field required");
        }else{
            String db_url = "jdbc:mysql://localhost:3308/studentmanagementsystem";
            try{
                Con = DriverManager.getConnection(db_url, "root", "");
                countStud();
                PreparedStatement Add = Con.prepareStatement("insert into registeredstud values (?,?,?,?,?)");
                Add.setInt(1, StId);
                Add.setString(2, StudNameTb.getText());
                Add.setInt(3, Integer.parseInt(RefNumberTb.getText()));
                Add.setString(4, StudEmailTb.getText());
                Add.setString(5, StudPasswordTb.getText());
                int Rows = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "You have been registered!!");
                Con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_RegisterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLnk;
    private javax.swing.JTextField RefNumberTb;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField StudEmailTb;
    private javax.swing.JTextField StudNameTb;
    private javax.swing.JPasswordField StudPasswordTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
