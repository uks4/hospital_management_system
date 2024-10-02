
package sanjeevaniapp.gui;


public class ReceptionistOptionsFrame extends javax.swing.JFrame {


    public ReceptionistOptionsFrame() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblAddPatient = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblUpdatePatient = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblViewPatient = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblDeletePatient = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Option Frame");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(234, 243, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images.png"))); // NOI18N
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 111, 240, 180));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        lblAddPatient.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblAddPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPatient.setText("    Add Patient");
        lblAddPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAddPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, 70));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        lblUpdatePatient.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdatePatient.setText("  Update Patient");
        lblUpdatePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUpdatePatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUpdatePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdatePatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUpdatePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUpdatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 70));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        lblViewPatient.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblViewPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblViewPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewPatient.setText("   View Patient");
        lblViewPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewPatient.setMaximumSize(new java.awt.Dimension(150, 26));
        lblViewPatient.setMinimumSize(new java.awt.Dimension(150, 26));
        lblViewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 200, 70));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        lblDeletePatient.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblDeletePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDeletePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeletePatient.setText("  Delete Patient");
        lblDeletePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDeletePatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeletePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeletePatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeletePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 200, 70));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Welcome Receptionist ,");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 50));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        nameLbl.setBackground(new java.awt.Color(102, 102, 102));
        nameLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLbl.setText("USER- SACHIN");

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 153));
        btnBack2.setText("LOGOUT");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(btnBack2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 620, 50));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 980, 360));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel15.setText("Sanjeevani  Application ");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 600, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 620, 70));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1010, 560));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMouseClicked
    AddPatientFrame addPatFrame=new AddPatientFrame();
    addPatFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_lblAddPatientMouseClicked

    private void lblDeletePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeletePatientMouseClicked
       
    }//GEN-LAST:event_lblDeletePatientMouseClicked

    private void lblUpdatePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdatePatientMouseClicked
     
    }//GEN-LAST:event_lblUpdatePatientMouseClicked

    private void lblViewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPatientMouseClicked

    }//GEN-LAST:event_lblViewPatientMouseClicked

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
       
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
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddPatient;
    private javax.swing.JLabel lblDeletePatient;
    private javax.swing.JLabel lblUpdatePatient;
    private javax.swing.JLabel lblViewPatient;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
