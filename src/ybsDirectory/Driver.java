package ybsDirectory;
import Exception.NegativeNumericException;
import Exception.PhnoException;
import Exception.NumberZeroException;
import Exception.NumericException;
import Exception.SpecialCharacterException;
import Exception.StringException;
import Exception.ageException;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
/**
 *
 * @author ICE
 */
public class Driver extends javax.swing.JFrame {
    private Connection con=null;
    private String name,gender,phno;
    private int age;
    public String id;
    private Statement ste=null;
    private ResultSet rs=null;
    private String query;
    boolean condition =true;
    UpdateDate d=new UpdateDate();
    
    private User user=new User();
    /**
     * Creates new form Driver
     */
    public Driver() {
        initComponents();
        con=new DBConnection().getDBConnection();
        
        gender="Male";
    }
    
    public Driver(User user) {
    	
    	initComponents();
        con=new DBConnection().getDBConnection();
        
        gender="Male";
    	      
    	this.user.setUserName(user.getUserName());
    	this.user.setType(user.getType());        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPhno = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        LblErrorName = new javax.swing.JLabel();
        LblErrorAge = new javax.swing.JLabel();
        LblErrorPhno = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnSave1 = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Driver Information");

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/IMG_20190402_132931.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Phone Number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPhno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhnoActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 153, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 153, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnSave1.setBackground(new java.awt.Color(153, 153, 255));
        btnSave1.setText("Edit");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LblErrorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblErrorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblErrorPhno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(51, 51, 51)
                        .addComponent(btnSave1)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancel)
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(LblErrorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblErrorPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here
        id=getAutoID("BusDriverID","busdriver","BD");
        //System.outprint(id);
        try { 
                condition= true;
    		ste=con.createStatement();
                String a=txtAge.getText().toString().trim();
                String p=txtPhno.getText().toString().trim();
    		EmptyError();
    		String n=txtName.getText().toString().trim();
    		if(txtName.getText().isEmpty()) {
                    condition=false;
                    LblErrorName.setForeground(new java.awt.Color(255, 0, 0));
                    LblErrorName.setText("*Please Enter User Name");
                    txtName.requestFocus();
    		}
    		
                else{
                    
                    Pattern pattern=Pattern.compile("[a-zA-Z]+$");
                    Matcher matcher=pattern.matcher(txtName.getText().trim());
                    if(!matcher.find()) {
                       throw new SpecialCharacterException();
                    }
                    if(Character.isDigit(n.charAt(0)))
                        throw new  StringException();
                }
                
                if(txtAge.getText().isEmpty()){
                    condition =false;
                    LblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
    		    LblErrorAge.setText("*Please Enter Age.");
                    txtAge.requestFocus();
                }
                else{
                    for(int i=0; i<a.length(); i++) {
    			if(a.charAt(0)=='-') {
                            
                        }
    			else if(!Character.isDigit(a.charAt(i))) {
                            throw new NumericException();	        					        				
    			}    			
    		    }
                    
                    int b=Integer.parseInt(txtAge.getText().trim());		    	
	    	
	    	    if(b<=0) {
	    		
	    		if(b==0) {
	    			throw new NumberZeroException();	    					    		
	    		}
                        throw new NegativeNumericException();
                    }
		    	    else if(b<17 || b>60){
	                    throw new ageException();
	                }
                }  
                
                if(txtPhno.getText().isEmpty()){
                    condition=false;
                    LblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
                    LblErrorPhno.setText("*Please Enter Phone Number");
                    txtPhno.requestFocus();
                }
                
                else{
                    if(p.length()<11 ){
                        condition =false;
                        LblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
                        LblErrorPhno.setText("*Please Enter Valid Phone Number");
                        txtPhno.requestFocus();
                    }
                    for(int i=0; i<p.length(); i++) {
                    	if(!Character.isDigit(p.charAt(i))) {
                            throw new PhnoException();	        					        				
                    	}    		
                    }
                }              
                if(condition){
                    name=txtName.getText();
		        age=Integer.parseInt(txtAge.getText());    	            	        	        	    
		        phno=txtPhno.getText().trim();
                        query="insert into busdriver(BusDriverID,BusDriverName,BusDriverPhno,Age,Gender) values('"+id+"','"+name+"','"+phno+"','"+age+"','"+gender+"')";
                        ste=con.createStatement();
                        int result=ste.executeUpdate(query);  
                        if(result==1){
                            clearData();
                            JOptionPane.showMessageDialog(this,"This Bus Driver record is save successfully.");
                            
                            //update detail in update detail table    				
            				addUpdateDetail("added bus driver : " + name);
                        }
                }
        }catch(SpecialCharacterException e){
            condition =false;
            LblErrorName.setForeground(new java.awt.Color(255, 0, 0));
            txtName.setText("");
            txtName.requestFocus();
            LblErrorName.setText(e.getMessage());
        }
        catch(PhnoException e) {
            condition =false;
            LblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorPhno.setText(e.getMessage());
            txtPhno.setText("");
            txtPhno.requestFocus();
    	}
        catch(StringException e){
            condition =false;
            LblErrorName.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorName.setText("Driver Name must not be Digit.");
            txtName.setText("");	
            txtName.requestFocus();			
    	}
        catch(NumericException e) {
            condition =false;
            LblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(NegativeNumericException e){
            condition =false;
            LblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}catch(ageException e) {
    		condition =false;
            LblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(NumberZeroException e) {
            condition =false;
            LblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            LblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(Exception e) {
            condition =false;
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Save Record is failure.");
        }
        
        //System.out.println(id);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPhnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhnoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        gender="Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        new MainMenu(user).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        this.setVisible(false);
        new DrivevrEdit(user).setVisible(true);
    }//GEN-LAST:event_btnSave1ActionPerformed
    
    public void clearData(){
        txtName.setText("");
        txtAge.setText("");
        txtPhno.setText("");
        jRadioButton1.setSelected(true);
        LblErrorName.setText("");
        LblErrorAge.setText("");
        LblErrorPhno.setText("");
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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }
    
    private void EmptyError() {
    	LblErrorName.setText("");
    	LblErrorAge.setText(""); 
        LblErrorPhno.setText("");
        
    }
    
    private void EmptyData() {
    	txtName.setText("");
    	txtAge.setText("");
        txtPhno.setText("");
    	EmptyError();
    }
    
    private String getAutoID(String field, String table, String prefix) {
    	
    	DBConnection connect=new DBConnection();
    	if(table.equals("busdriver")) {
    		return connect.getPrimaryKey(field, table, prefix);
    	}
    	else if(table.equals("updatedetail")) {
    		return connect.getPrimaryKey3(field, table, prefix);
    	}
    	else {
    		return connect.getPrimaryKey2(field, table, prefix);
    	}
    }
    
 	//Function to Add bus route to Database
    private void addUpdateDetail(String description) {    	    	    	       	    	    	
    	
    	try {    		
    		con=new DBConnection().getDBConnection();
    		ste=con.createStatement();
    		int result=0;	    	

    		//Auto ID for updateDetail-id in updateDetail table
    		String updateID=getAutoID("UpdateID", "updatedetail", "U");    		
	    			    			    		
    		String sql="INSERT INTO updatedetail(UpdateID, UserName, Date, Description) VALUES('" + updateID + "', '" + user.getUserName() + "', '" + new UpdateDate().getDate() + "', '" + description + "')";
    		result=ste.executeUpdate(sql);			    				    			    	
	    	   
	    	if(result==1) {
	    		System.out.println("Update Detail: Updated!");
	    	}
    	}catch(Exception e) {
    		System.out.println(e);
    	}    	
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblErrorAge;
    private javax.swing.JLabel LblErrorName;
    private javax.swing.JLabel LblErrorPhno;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhno;
    // End of variables declaration//GEN-END:variables
}
