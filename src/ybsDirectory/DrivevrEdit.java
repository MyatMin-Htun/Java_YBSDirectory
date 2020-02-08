package ybsDirectory;

import Exception.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ICE
 */
public class DrivevrEdit extends javax.swing.JFrame {
    private Connection con=null;
    public String id;
    private Statement ste=null;
    private ResultSet rs=null;
    private String query;
    DefaultTableModel tbl=new DefaultTableModel();
    boolean condition;
    String name,phno,gender;
    int age;
    
    private User user=new User();
    
    public DrivevrEdit() {
        initComponents();
        con=new DBConnection().getDBConnection();
        createtable();
        fillDriver();
    }
    
    public DrivevrEdit(User user) {
    	
    	initComponents();
        con=new DBConnection().getDBConnection();
        createtable();
        fillDriver();
           
    	this.user.setUserName(user.getUserName());
    	this.user.setType(user.getType());                       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtphno = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDriver = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorAge = new javax.swing.JLabel();
        lblErrorPhno = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Driver Edit");

        jPanel1.setBackground(new java.awt.Color(251, 251, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 251));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 251));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 251));
        jLabel2.setText("Age:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 251));
        jLabel3.setText("Phone Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 251));
        jLabel4.setText("Gender:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtphno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 102, 102));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 102, 102));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblDriver.setForeground(new java.awt.Color(51, 51, 255));
        tblDriver.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDriverMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDriver);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnDelete)
                                .addGap(30, 30, 30)
                                .addComponent(btnCancel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtphno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(5, 5, 5)
                                                .addComponent(jRadioButton2)
                                                .addGap(0, 20, Short.MAX_VALUE))
                                            .addComponent(lblErrorAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtphno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addGap(3, 3, 3)
                                .addComponent(lblErrorPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))))
                    .addComponent(lblErrorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try { 
            if(tblDriver.getSelectedRow()<0){
                JOptionPane.showMessageDialog(this,"Please Select Row to Update");
            }
            else{
                condition= true;
    		ste=con.createStatement();
                String a=txtAge.getText().toString().trim();
                String p=txtphno.getText().toString().trim();
    		//EmptyError();
    		String n=txtName.getText().toString().trim();
    		if(txtName.getText().isEmpty()) {
                    condition=false;
                    lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
                    lblErrorName.setText("*Please Enter User Name");
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
                    lblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
    		    lblErrorAge.setText("*Please Enter Age.");
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
                
                if(txtphno.getText().isEmpty()){
                    condition=false;
                    lblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
                    lblErrorPhno.setText("*Please Enter Phone Number");
                    txtphno.requestFocus();
                }
                
                else{
                    if(p.length()<11 ){
                        condition =false;
                        lblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
                        lblErrorPhno.setText("*Please Enter Valid Phone Number");
                        txtphno.requestFocus();
                    }
                    for(int i=0; i<p.length(); i++) {
                    	if(!Character.isDigit(p.charAt(i))) {
                            throw new PhnoException();	        					        				
                    	}    		
                    }
                }
                }
                if(condition){
                    name=txtName.getText();
		        age=Integer.parseInt(txtAge.getText());    	            	        	        	    
		        phno=txtphno.getText().trim();
                        query="UPDATE  busdriver SET BusDriverName='"+name+"',BusDriverPhNo='"+phno+"',Age='"+age+"',Gender='"+gender+"' WHERE BusDriverID='"+id+"'";
                        ste=con.createStatement();
                        int result=ste.executeUpdate(query);  
                        if(result==1){
                        	
                        	//update detail in update detail table    				
            				addUpdateDetail("Update Driver Info : " +  txtName.getText().toString().trim());
                        	
                            clearData();
                            JOptionPane.showMessageDialog(this,"This Bus Driver record is Edit successfully.");
                            tbl.setRowCount(0);
                    fillDriver();
                        }
                }               
        }catch(SpecialCharacterException e){
            condition =false;
            lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
            txtName.setText("");
            txtName.requestFocus();
            lblErrorName.setText(e.getMessage());
        }
        catch(PhnoException e) {
            condition =false;
            lblErrorPhno.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorPhno.setText(e.getMessage());
            txtphno.setText("");
            txtphno.requestFocus();
    	}
        catch(StringException e){
            condition =false;
            lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorName.setText("Driver Name must not be Digit.");
            txtName.setText("");	
            txtName.requestFocus();			
    	}
        catch(NumericException e) {
            condition =false;
            lblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(NegativeNumericException e){
            condition =false;
            lblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}catch(ageException e) {
            condition =false;
            lblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(NumberZeroException e) {
            condition =false;
            lblErrorAge.setForeground(new java.awt.Color(255, 0, 0));
            lblErrorAge.setText(e.getMessage());
            txtAge.setText("");
            txtAge.requestFocus();
    	}
        catch(Exception e) {
            condition =false;
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Save Record is failure.");
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            if(tblDriver.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Please Select row to Delete");        
        }
            else{
                query="UPDATE  busdriver SET BusDriverName='null',BusDriverPhNo='null',Age=0,Gender='null' WHERE BusDriverID='"+id+"'";
                ste=con.createStatement();
                int result=ste.executeUpdate(query);              
                if(result==1){
                	//update detail in update detail table    				
    				addUpdateDetail("Delete Driver Info : " +  txtName.getText().toString().trim());
    				
                    clearData();
                    JOptionPane.showMessageDialog(this,"This Bus Driver record is Delete successfully.");
                    tbl.setRowCount(0);
                    fillDriver();
                    
                    //update detail in update detail table    				
    				addUpdateDetail("updated Bus Driver Info");    				    				
                }
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearData();
        tblDriver.setSelectionMode(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtphnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphnoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        gender="Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void tblDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDriverMouseClicked
        // TODO add your handling code here
        int r=tblDriver.getSelectedRow();
        
        txtName.setText(tblDriver.getValueAt(r, 1).toString());
        txtAge.setText(tblDriver.getValueAt(r, 2).toString());
        txtphno.setText(tblDriver.getValueAt(r, 3).toString());
        id=tblDriver.getValueAt(r, 0).toString();
        //JOptionPane.showMessageDialog(this, tblDriver.getValueAt(r, 3).toString());
        if(tblDriver.getValueAt(r, 4).toString().equals("Male")){
            gender="Male";
            jRadioButton1.setSelected(true);
        }
            else{
            jRadioButton2.setSelected(true);
                    gender="Female";}
            
    }//GEN-LAST:event_tblDriverMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        new MainMenu(user).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    public void fillDriver(){
       String  strdriver[]=new String[5];
       try{
           boolean cond=true;
           ste=con.createStatement();
           String q="SELECT * FROM busdriver";
           rs=ste.executeQuery(q);
           while(rs.next()){
               cond=true;
               strdriver[0]=rs.getString(1);
               strdriver[1]=rs.getString(2);
               if(strdriver[1].equals("null")){
                   cond=false;
               }
               
               strdriver[2]=rs.getString(4);
               strdriver[3]=rs.getString(3);
               strdriver[4]=rs.getString(5);
               if(cond){
                   tbl.addRow(strdriver);
               }
               
           }
           tblDriver.setModel(tbl);
       }catch(Exception e){
           System.out.print(e);
       }
       
    }
    public void createtable(){
        tbl.addColumn("ID");
        tbl.addColumn("Driver Name");
        tbl.addColumn("Driver Age");
        tbl.addColumn("Phone Number");
        tbl.addColumn("Gender");
        tblDriver.setModel(tbl);
        //tblDriver.removeColumn(tblDriver.getColumn(5));
    }
    public void clearData(){
        txtName.setText("");
        txtAge.setText("");
        txtphno.setText("");
        jRadioButton1.setSelected(true);
        lblErrorName.setText("");
        lblErrorAge.setText("");
        lblErrorPhno.setText("");
        tblDriver.setSelectionMode(0);
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
            java.util.logging.Logger.getLogger(DrivevrEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrivevrEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrivevrEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrivevrEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrivevrEdit().setVisible(true);
            }
        });
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
    
    //for auto id store in table (eg. busstop table	(field-busStopID, table-busstop, prefix-BS))
    private String getAutoID(String field, String table, String prefix) {
    	
    	DBConnection connect=new DBConnection();
    	if(table.equals("updatedetail")) {
    		return connect.getPrimaryKey3(field, table, prefix);
    	}
    	else {
    		return connect.getPrimaryKey2(field, table, prefix);
    	}    	
    }
    //for auto id store in busstop table	(field-busStopID, table-busstop, prefix-BS)  - End
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblErrorAge;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPhno;
    private javax.swing.JTable tblDriver;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtphno;
    // End of variables declaration//GEN-END:variables
}
