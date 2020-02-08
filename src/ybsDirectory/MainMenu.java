package ybsDirectory;

import java.awt.Cursor;

public class MainMenu extends javax.swing.JFrame {
  
	private User user=new User();
	
    public MainMenu(User user) {
        initComponents();                
                
        this.user.setUserName(user.getUserName());
    	this.user.setType(user.getType());                   
                
        if(this.user.getType().equals("admin")) {
        	showManagement(true);
        }
        else {
        	showManagement(false);
        }
    }
    
    public MainMenu() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LineManagement = new javax.swing.JPanel();
        lblManagement = new javax.swing.JLabel();
        btnRouteManagement = new javax.swing.JButton();
        btnDriverManagement = new javax.swing.JButton();
        btnDriverAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnRouteSearch = new javax.swing.JButton();
        btnDriverSearch = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        LineManagement.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout LineManagementLayout = new javax.swing.GroupLayout(LineManagement);
        LineManagement.setLayout(LineManagementLayout);
        LineManagementLayout.setHorizontalGroup(
            LineManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        LineManagementLayout.setVerticalGroup(
            LineManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        lblManagement.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblManagement.setForeground(new java.awt.Color(51, 51, 255));
        lblManagement.setText("Information Management");

        btnRouteManagement.setBackground(new java.awt.Color(255, 255, 51));
        btnRouteManagement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRouteManagement.setForeground(new java.awt.Color(102, 102, 255));
        btnRouteManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/ybsManagement.jpg"))); // NOI18N
        btnRouteManagement.setText("Route Management");
        btnRouteManagement.setBorder(null);
        btnRouteManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRouteManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRouteManagement.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnRouteManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRouteManagementActionPerformed(evt);
            }
        });

        btnDriverManagement.setBackground(new java.awt.Color(255, 255, 51));
        btnDriverManagement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDriverManagement.setForeground(new java.awt.Color(102, 102, 255));
        btnDriverManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/ybsDriverManagement.jpg"))); // NOI18N
        btnDriverManagement.setText("Driver Management");
        btnDriverManagement.setBorder(null);
        btnDriverManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDriverManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDriverManagement.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnDriverManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverManagementActionPerformed(evt);
            }
        });

        btnDriverAdd.setBackground(new java.awt.Color(255, 255, 51));
        btnDriverAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDriverAdd.setForeground(new java.awt.Color(102, 102, 255));
        btnDriverAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/ybsAdd.jpg"))); // NOI18N
        btnDriverAdd.setText("Bus Driver Add");
        btnDriverAdd.setBorder(null);
        btnDriverAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDriverAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDriverAdd.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnDriverAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblManagement))
                    .addComponent(LineManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnRouteManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnDriverManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnDriverAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRouteManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriverManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriverAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Information Search");

        jPanel7.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        btnRouteSearch.setBackground(new java.awt.Color(255, 255, 51));
        btnRouteSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRouteSearch.setForeground(new java.awt.Color(102, 102, 255));
        btnRouteSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/ybsSearch.jpg"))); // NOI18N
        btnRouteSearch.setText("Bus Stop Search");
        btnRouteSearch.setBorder(null);
        btnRouteSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRouteSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRouteSearch.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnRouteSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRouteSearchActionPerformed(evt);
            }
        });

        btnDriverSearch.setBackground(new java.awt.Color(255, 255, 51));
        btnDriverSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDriverSearch.setForeground(new java.awt.Color(102, 102, 255));
        btnDriverSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/ybsLicensePlate.jpg"))); // NOI18N
        btnDriverSearch.setText("Bus Search");
        btnDriverSearch.setBorder(null);
        btnDriverSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDriverSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDriverSearch.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnDriverSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverSearchActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(0, 0, 204));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/logOutIcon.png"))); // NOI18N
        lblLogout.setText(" Log Out");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 0, 204));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/searchIcon.png"))); // NOI18N
        lblSearch.setText("View Update Detail");
        lblSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnRouteSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnDriverSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch)
                    .addComponent(lblLogout))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDriverSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRouteSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSearch)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRouteManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRouteManagementActionPerformed
        this.setVisible(false);
        new Function_AddBusStop(user).setVisible(true);;
    }//GEN-LAST:event_btnRouteManagementActionPerformed

    private void btnDriverManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverManagementActionPerformed
    	this.setVisible(false);
        new DriverDetail(user).setVisible(true);;
    }//GEN-LAST:event_btnDriverManagementActionPerformed

    private void btnDriverAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverAddActionPerformed
    	this.setVisible(false);
        new Driver(user).setVisible(true);
    }//GEN-LAST:event_btnDriverAddActionPerformed

    private void btnRouteSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRouteSearchActionPerformed
    	this.setVisible(false);
        new Function_SearchBusRoute(user).setVisible(true);
    }//GEN-LAST:event_btnRouteSearchActionPerformed

    private void btnDriverSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverSearchActionPerformed
    	this.setVisible(false);
        new SearchDriverInfo(user).setVisible(true);
    }//GEN-LAST:event_btnDriverSearchActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.setVisible(false);
    	new UserLogIn().setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        this.setVisible(false);
    	new UpdateInfo(user).setVisible(true);
    }//GEN-LAST:event_lblSearchMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private void showManagement(boolean condition) {
    	lblManagement.setVisible(condition);
    	LineManagement.setVisible(condition);
    	btnRouteManagement.setVisible(condition);
    	btnDriverAdd.setVisible(condition);
    	btnDriverManagement.setVisible(condition);
    	lblSearch.setVisible(condition);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LineManagement;
    private javax.swing.JButton btnDriverAdd;
    private javax.swing.JButton btnDriverManagement;
    private javax.swing.JButton btnDriverSearch;
    private javax.swing.JButton btnRouteManagement;
    private javax.swing.JButton btnRouteSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblManagement;
    private javax.swing.JLabel lblSearch;
    // End of variables declaration//GEN-END:variables
}
