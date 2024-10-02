/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import javax.swing.JOptionPane;
import sanjeevaniapp.pojo.PatientPojo;
import sanjeevaniapp.utility.OTPSender;
import sanjeevaniapp.utility.Sender;



public class VerifyOtpFrame extends javax.swing.JFrame {

    private PatientPojo patient;   
    public VerifyOtpFrame() {
        initComponents();
        
    }
    public VerifyOtpFrame(PatientPojo patient) {
       this();
       txtPatientName.setText(patient.getFirstName()+" "+patient.getLastName());
       txtMno.setText(patient.getMno());
       this.patient=patient;
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        btnBack2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtMno = new javax.swing.JTextField();
        txtOTP = new javax.swing.JTextField();
        btnSendOTP = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verify OTP Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel4.setText("Sanjeevani  Application ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 590, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 620, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(234, 243, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 144, 886, 12));

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 153));
        btnBack2.setText("LOGOUT");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 166, 139, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 110, 21));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Phone no.");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter OTP");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 109, 110, 23));

        txtPatientName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 55, 283, -1));

        txtMno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtMno, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 55, 256, -1));

        txtOTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 430, -1));

        btnSendOTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendOTP.setForeground(new java.awt.Color(0, 153, 153));
        btnSendOTP.setText("SEND OTP");
        btnSendOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOTPActionPerformed(evt);
            }
        });
        jPanel4.add(btnSendOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 109, 270, 21));

        btnBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 162, 131, -1));

        btnVerify.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(0, 153, 153));
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 162, 440, 33));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 960, 220));

        jSeparator4.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 620, 70));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel14.setText("Sanjeevani  Application ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 1010, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        if(isValidOTP()){
            
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOTPActionPerformed
       try{
           Sender sender=new OTPSender();
           String pOtp=String.valueOf(patient.getOtp());
           boolean result=sender.send(patient.getMno(), pOtp);
           if(result){
               JOptionPane.showMessageDialog(null,"OTP sent successfully!");
           }else{
               JOptionPane.showMessageDialog(null,"Cannot send the OTP . Please check the number!");
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
       }
        
    }//GEN-LAST:event_btnSendOTPActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnBack2ActionPerformed

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
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyOtpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSendOTP;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private boolean isValidOTP() {
        boolean result=false;
        try{
            int otp=Integer.parseInt(txtOTP.getText().trim());
            if(otp==patient.getOtp())
                result=true;
        }catch(NumberFormatException ex){
            //message
           
        }finally{
            return result;
        }
        
    }
    
}
