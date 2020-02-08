package ybsDirectory;

import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.*;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Exception.BlankException;
import Exception.NegativeNumericException;
import Exception.NumberZeroException;
import Exception.NumericException;
import Exception.SpecialCharacterException;
import Exception.StringException;
import ybsDirectory.*;

public class Function_AddBusStop extends javax.swing.JFrame {
	
	private Connection con=null;
	private Statement ste=null;
	private ResultSet rs=null;
	private int rdoCondition;
	private String busRoute, lastBusStop;
	private boolean duplicate, updateCondition;
	private ArrayList arrayRoute=new ArrayList();	
	private ArrayList updateArrayRoute=new ArrayList();
	private ArrayList updateBusDetailID=new ArrayList();
	
	private User user=new User();
    
    public Function_AddBusStop() {
        initComponents();
        
        con=new DBConnection().getDBConnection();
        
        rdoCondition=1;
        duplicate=false;
        updateCondition=true;
        busRoute = lastBusStop = "";
        busStopInitialize();
        addCboBusNumber();
        resetCboBusRouteError();
    }
    
    public Function_AddBusStop(User user) {
    	
    	initComponents();
        
        con=new DBConnection().getDBConnection();
        
        rdoCondition=1;
        duplicate=false;
        updateCondition=true;
        busRoute = lastBusStop = "";
        busStopInitialize();
        addCboBusNumber();
        resetCboBusRouteError();
    	        	    
    	this.user.setUserName(user.getUserName());
    	this.user.setType(user.getType());                        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusStop = new javax.swing.JTextField();
        lblErrorBusStop = new javax.swing.JLabel();
        btnBusStopCreate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtBusLine = new javax.swing.JTextField();
        lblErrorBusLine = new javax.swing.JLabel();
        btnBusLineCreate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblErrorPrice = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cboBusRouteNo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboBusRoute1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboBusRoute2 = new javax.swing.JComboBox<>();
        cboBusRoute3 = new javax.swing.JComboBox<>();
        cboBusRoute4 = new javax.swing.JComboBox<>();
        cboBusRoute5 = new javax.swing.JComboBox<>();
        cboBusRoute6 = new javax.swing.JComboBox<>();
        cboBusRoute7 = new javax.swing.JComboBox<>();
        cboBusRoute8 = new javax.swing.JComboBox<>();
        cboBusRoute9 = new javax.swing.JComboBox<>();
        cboBusRoute10 = new javax.swing.JComboBox<>();
        cboBusRoute11 = new javax.swing.JComboBox<>();
        cboBusRoute12 = new javax.swing.JComboBox<>();
        cboBusRoute13 = new javax.swing.JComboBox<>();
        cboBusRoute14 = new javax.swing.JComboBox<>();
        cboBusRoute15 = new javax.swing.JComboBox<>();
        cboBusRoute16 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRoute = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();
        lblError3 = new javax.swing.JLabel();
        lblError4 = new javax.swing.JLabel();
        lblError5 = new javax.swing.JLabel();
        lblError6 = new javax.swing.JLabel();
        lblError7 = new javax.swing.JLabel();
        lblError8 = new javax.swing.JLabel();
        lblError9 = new javax.swing.JLabel();
        lblError10 = new javax.swing.JLabel();
        lblError11 = new javax.swing.JLabel();
        lblError12 = new javax.swing.JLabel();
        lblError13 = new javax.swing.JLabel();
        lblError14 = new javax.swing.JLabel();
        lblError15 = new javax.swing.JLabel();
        lblError16 = new javax.swing.JLabel();
        rdoCreateNew = new javax.swing.JRadioButton();
        rdoUpdateExisting = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblBusRouteRes = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Bus Stop");
        setLocation(new java.awt.Point(100, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Bus Stop");

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Enter New Bus Stop Name :");

        txtBusStop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        lblErrorBusStop.setForeground(new java.awt.Color(255, 51, 51));

        btnBusStopCreate.setMnemonic('C');
        btnBusStopCreate.setText("Create");
        btnBusStopCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusStopCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblErrorBusStop, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnBusStopCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBusStop, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusStop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorBusStop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusStopCreate)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Bus Line");

        jPanel6.setBackground(new java.awt.Color(153, 255, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        txtBusLine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        lblErrorBusLine.setForeground(new java.awt.Color(255, 51, 51));

        btnBusLineCreate.setMnemonic('r');
        btnBusLineCreate.setText("Create");
        btnBusLineCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusLineCreateActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Enter New Bus Number :");

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Enter Price :");

        txtPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        lblErrorPrice.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnBusLineCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorBusLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusLine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorBusLine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBusLineCreate)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Bus Route");

        jPanel7.setBackground(new java.awt.Color(153, 255, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        cboBusRouteNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRouteNoActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Choose Bus Number :");

        cboBusRoute1.setName(""); // NOI18N
        cboBusRoute1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Start :");

        cboBusRoute2.setEnabled(false);
        cboBusRoute2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute2ActionPerformed(evt);
            }
        });

        cboBusRoute3.setEnabled(false);
        cboBusRoute3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute3ActionPerformed(evt);
            }
        });

        cboBusRoute4.setEnabled(false);
        cboBusRoute4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute4ActionPerformed(evt);
            }
        });

        cboBusRoute5.setEnabled(false);
        cboBusRoute5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute5ActionPerformed(evt);
            }
        });

        cboBusRoute6.setEnabled(false);
        cboBusRoute6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute6ActionPerformed(evt);
            }
        });

        cboBusRoute7.setEnabled(false);
        cboBusRoute7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute7ActionPerformed(evt);
            }
        });

        cboBusRoute8.setEnabled(false);
        cboBusRoute8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute8ActionPerformed(evt);
            }
        });

        cboBusRoute9.setEnabled(false);
        cboBusRoute9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute9ActionPerformed(evt);
            }
        });

        cboBusRoute10.setEnabled(false);
        cboBusRoute10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute10ActionPerformed(evt);
            }
        });

        cboBusRoute11.setEnabled(false);
        cboBusRoute11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute11ActionPerformed(evt);
            }
        });

        cboBusRoute12.setEnabled(false);
        cboBusRoute12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute12ActionPerformed(evt);
            }
        });

        cboBusRoute13.setEnabled(false);
        cboBusRoute13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute13ActionPerformed(evt);
            }
        });

        cboBusRoute14.setEnabled(false);
        cboBusRoute14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute14ActionPerformed(evt);
            }
        });

        cboBusRoute15.setEnabled(false);
        cboBusRoute15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute15ActionPerformed(evt);
            }
        });

        cboBusRoute16.setEnabled(false);
        cboBusRoute16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusRoute16ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        txtAreaRoute.setEditable(false);
        txtAreaRoute.setColumns(20);
        txtAreaRoute.setRows(5);
        txtAreaRoute.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));
        jScrollPane1.setViewportView(txtAreaRoute);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Bus Routes ::");

        btnContinue.setMnemonic('t');
        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnFinish.setMnemonic('F');
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnClear.setMnemonic('l');
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblError1.setForeground(new java.awt.Color(255, 51, 51));

        lblError2.setForeground(new java.awt.Color(255, 51, 51));

        lblError3.setForeground(new java.awt.Color(255, 51, 51));

        lblError4.setForeground(new java.awt.Color(255, 51, 51));

        lblError5.setForeground(new java.awt.Color(255, 51, 51));

        lblError6.setForeground(new java.awt.Color(255, 51, 51));

        lblError7.setForeground(new java.awt.Color(255, 51, 51));

        lblError8.setForeground(new java.awt.Color(255, 51, 51));

        lblError9.setForeground(new java.awt.Color(255, 51, 51));

        lblError10.setForeground(new java.awt.Color(255, 51, 51));

        lblError11.setForeground(new java.awt.Color(255, 51, 51));

        lblError12.setForeground(new java.awt.Color(255, 51, 51));

        lblError13.setForeground(new java.awt.Color(255, 51, 51));

        lblError14.setForeground(new java.awt.Color(255, 51, 51));

        lblError15.setForeground(new java.awt.Color(255, 51, 51));

        lblError16.setForeground(new java.awt.Color(255, 51, 51));

        buttonGroup1.add(rdoCreateNew);
        rdoCreateNew.setSelected(true);
        rdoCreateNew.setText("Create New");
        rdoCreateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCreateNewActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoUpdateExisting);
        rdoUpdateExisting.setText("Update Existing");
        rdoUpdateExisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoUpdateExistingActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("B2");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("B3");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("B4");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("B6");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("B7");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("B5");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("B8");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("B9");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("B10");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("B11");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("B12");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("B13");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("B14");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("B15");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("B16");

        lblBusRouteRes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBusRouteRes.setForeground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblError13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblError14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblError15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboBusRoute16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblError16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(rdoCreateNew)
                                        .addGap(4, 4, 4)
                                        .addComponent(rdoUpdateExisting)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(cboBusRouteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(84, 84, 84)
                                .addComponent(lblError5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblError8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(cboBusRoute9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboBusRoute10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(lblError9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel25)
                                                        .addGap(154, 154, 154)))
                                                .addComponent(jLabel26)
                                                .addGap(77, 77, 77)
                                                .addComponent(lblError10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(cboBusRoute11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboBusRoute12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblError11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(123, 123, 123)
                                                .addComponent(lblError12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblBusRouteRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(cboBusRoute1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblError1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(29, 29, 29)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cboBusRoute2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cboBusRoute3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblError3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel15))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboBusRoute4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel20)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblError4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(cboBusRoute5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboBusRoute6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblError6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboBusRoute7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblError7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboBusRoute8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(rdoCreateNew)
                                                    .addComponent(rdoUpdateExisting))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboBusRouteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBusRouteRes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cboBusRoute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboBusRoute2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboBusRoute3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboBusRoute4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblError3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblError1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(lblError4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20)))
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboBusRoute5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBusRoute8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblError7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblError6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblError5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblError8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboBusRoute9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboBusRoute10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboBusRoute11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboBusRoute12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblError11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblError10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblError9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblError12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBusRoute13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBusRoute14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBusRoute15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBusRoute16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinue)
                    .addComponent(btnFinish)
                    .addComponent(btnClear))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 78)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Y  B  S");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack)
                .addGap(83, 83, 83)
                .addComponent(jLabel14)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void btnBusStopCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusStopCreateActionPerformed
        lblErrorBusStop.setText("");
        lblErrorBusStop.setForeground(new java.awt.Color(255, 51, 51));
    	addBusStop();    	    	
    }//GEN-LAST:event_btnBusStopCreateActionPerformed

    private void btnBusLineCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusLineCreateActionPerformed
    	lblErrorBusLine.setText("");
    	lblErrorBusLine.setForeground(new java.awt.Color(255, 51, 51));
    	lblErrorPrice.setText("");
    	lblErrorPrice.setForeground(new java.awt.Color(255, 51, 51));
    	addBusLine();
    	addCboBusNumber();
    }//GEN-LAST:event_btnBusLineCreateActionPerformed

    private void cboBusRouteNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRouteNoActionPerformed
            	
    	btnContinue.setEnabled(true);
    	
    	if(rdoCondition==1) {
    		
    		lblBusRouteRes.setText("");
    		if(cboBusRouteNo.getSelectedIndex()>0) {
            	addCboBusStop(cboBusRoute1);
            }
            else if(cboBusRouteNo.getSelectedIndex()==0) {        	
            	resetCboBusRoute();            	
            }
    	}
    	
    	//update function when choosing cboBusRouteNo
    	else if(rdoCondition==2){
    		
    		lblBusRouteRes.setText("");
    		updateCondition=true;    		
    		disableAllcboBusRoute();
    		txtAreaRoute.setText("");
    		ArrayList alBusStop=new ArrayList();    		
    		updateBusDetailID.clear();
    		updateArrayRoute.clear();
    		    		
    		try {
    			con=new DBConnection().getDBConnection();
    			ste=con.createStatement();
	    		if(cboBusRouteNo.getSelectedIndex()>0) {	            	
	            	
	            	String sql="SELECT BusStopID, BusDetailID FROM busdetail WHERE BusLineNo=" + cboBusRouteNo.getSelectedItem().toString().trim() + " ORDER BY BusDetailID";
	            	rs=ste.executeQuery(sql);
	            	
	            	while(rs.next()) {
	            		alBusStop.add(rs.getString(1));
	            		updateBusDetailID.add(rs.getString(2));
	            	}
	            		            	
	            	for(int a=0; a<alBusStop.size(); a++) {
	            		String busStop="SELECT BusStopName FROM busstop WHERE BusStopID='" + alBusStop.get(a) + "'";
	            		rs=ste.executeQuery(busStop);
	            		
	            		if(rs.next()) {
	            			alBusStop.set(a, rs.getString(1));
	            		}
	            	}	    	         
	            	
	            	for(int a=0; a<alBusStop.size() && a<16; a++) {
	            		switch(a) {
		    				case 0: addCboBusStop(cboBusRoute1); cboBusRoute1.setSelectedItem(alBusStop.get(a)); cboBusRoute1.setEnabled(true); break;
		    				case 1: addCboBusStop(cboBusRoute2); cboBusRoute2.setSelectedItem(alBusStop.get(a)); cboBusRoute2.setEnabled(true); break;
		    				case 2: addCboBusStop(cboBusRoute3); cboBusRoute3.setSelectedItem(alBusStop.get(a)); cboBusRoute3.setEnabled(true); break;
		    				case 3: addCboBusStop(cboBusRoute4); cboBusRoute4.setSelectedItem(alBusStop.get(a)); cboBusRoute4.setEnabled(true); break;
		    				case 4: addCboBusStop(cboBusRoute5); cboBusRoute5.setSelectedItem(alBusStop.get(a)); cboBusRoute5.setEnabled(true); break;
		    				case 5: addCboBusStop(cboBusRoute6); cboBusRoute6.setSelectedItem(alBusStop.get(a)); cboBusRoute6.setEnabled(true); break;
		    				case 6: addCboBusStop(cboBusRoute7); cboBusRoute7.setSelectedItem(alBusStop.get(a)); cboBusRoute7.setEnabled(true); break;
		    				case 7: addCboBusStop(cboBusRoute8); cboBusRoute8.setSelectedItem(alBusStop.get(a)); cboBusRoute8.setEnabled(true); break;
		    				case 8: addCboBusStop(cboBusRoute9); cboBusRoute9.setSelectedItem(alBusStop.get(a)); cboBusRoute9.setEnabled(true); break;
		    				case 9: addCboBusStop(cboBusRoute10); cboBusRoute10.setSelectedItem(alBusStop.get(a)); cboBusRoute10.setEnabled(true); break;
		    				case 10: addCboBusStop(cboBusRoute11); cboBusRoute11.setSelectedItem(alBusStop.get(a)); cboBusRoute11.setEnabled(true); break;
		    				case 11: addCboBusStop(cboBusRoute12); cboBusRoute12.setSelectedItem(alBusStop.get(a)); cboBusRoute12.setEnabled(true); break;
		    				case 12: addCboBusStop(cboBusRoute13); cboBusRoute13.setSelectedItem(alBusStop.get(a)); cboBusRoute13.setEnabled(true); break;
		    				case 13: addCboBusStop(cboBusRoute14); cboBusRoute14.setSelectedItem(alBusStop.get(a)); cboBusRoute14.setEnabled(true); break;
		    				case 14: addCboBusStop(cboBusRoute15); cboBusRoute15.setSelectedItem(alBusStop.get(a)); cboBusRoute15.setEnabled(true); break;
		    				case 15: addCboBusStop(cboBusRoute16); cboBusRoute16.setSelectedItem(alBusStop.get(a)); cboBusRoute16.setEnabled(true); break;        			
	            		}
	            	}
	            	if(alBusStop.size()>=16) {
	            		for(int a=16; a<alBusStop.size(); a++) {
	            			txtAreaRoute.append(" " + alBusStop.get(a) + "  || ");
	            			
	            			if(a!=16 && a%4==0) {
	            				txtAreaRoute.append("\n");
	            			}
	            		}
	            	}		            	
	            }
	            else if(cboBusRouteNo.getSelectedIndex()==0) {        	
	            	resetCboBusRoute();
	            }
    		}catch(Exception e) {
    			System.out.println(e);
    		}
	    	alBusStop.clear();    		
    	}
    	ConnClose();
    }//GEN-LAST:event_cboBusRouteNoActionPerformed

    private void cboBusRoute1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute1ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute1.getSelectedIndex()>0) {
	        
	    		if(cboBusRoute1.getSelectedItem().toString().trim().equals(lastBusStop)) {
	    			lblError1.setText("*Duplicate");
	    			cboBusRoute2.removeAllItems();
	            	cboBusRoute2.addItem("------SELECT------");
	            	cboBusRoute2.setEnabled(false);
	    			duplicate=true;
	    		}
	    		else if(checkDuplicate(cboBusRoute1.getSelectedItem().toString().trim(), cboBusRoute2.getSelectedItem().toString().trim(), lblError1, lblError2)){
	    			cboBusRoute1.setSelectedItem(cboBusRoute1.getSelectedItem().toString().trim());
	    		}
	    		
	    		else {
		    		addCboBusStop(cboBusRoute2);
		        	cboBusRoute2.setEnabled(true);
		        	lblError1.setText("");
		        	duplicate=false;
	    		}    		
	        }
	        else if(cboBusRoute1.getSelectedIndex()==0) {
	        	cboBusRoute2.removeAllItems();
	        	cboBusRoute2.addItem("------SELECT------");
	        	cboBusRoute2.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
    		
    		if(cboBusRoute1.getSelectedIndex()>0) {
	    			    		
	    		if(checkDuplicate(cboBusRoute1.getSelectedItem().toString().trim(), cboBusRoute2.getSelectedItem().toString().trim(),  lblError1, lblError2)){
	    			cboBusRoute1.setSelectedItem(cboBusRoute1.getSelectedItem().toString().trim());
	    		}	    			    		
	        }
	        else if(cboBusRoute1.getSelectedIndex()==0) {
	        	lblError1.setText("");
	        	lblError2.setText("");
	        }

    	}
    }//GEN-LAST:event_cboBusRoute1ActionPerformed

    private void cboBusRoute2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute2ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute2.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute1.getSelectedItem().toString().trim(), cboBusRoute2.getSelectedItem().toString().trim(), lblError1, lblError2)){
	    			cboBusRoute3.removeAllItems();
	            	cboBusRoute3.addItem("------SELECT------");
	            	cboBusRoute3.setEnabled(false);
	    		}
	    		else {
		        	addCboBusStop(cboBusRoute3);
		        	cboBusRoute3.setEnabled(true);
		        	lblError2.setText("");
	    		}
	        }
	        else if(cboBusRoute2.getSelectedIndex()==0) {
	        	cboBusRoute3.removeAllItems();
	        	cboBusRoute3.addItem("------SELECT------");
	        	cboBusRoute3.setEnabled(false);
	        }
    	}   
    	else if(rdoCondition==2) {
	    	if(cboBusRoute2.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute3.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute1.getSelectedItem().toString().trim(), cboBusRoute2.getSelectedItem().toString().trim(), cboBusRoute3.getSelectedItem().toString().trim(), lblError1, lblError2, lblError3)){
		    			cboBusRoute2.setSelectedItem(cboBusRoute2.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute2.getSelectedIndex()==0) {
	        	lblError1.setText("");
	        	lblError2.setText("");
	        	lblError3.setText("");
	        }
    	}   
    }//GEN-LAST:event_cboBusRoute2ActionPerformed

    private void cboBusRoute3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute3ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute3.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute2.getSelectedItem().toString().trim(), cboBusRoute3.getSelectedItem().toString().trim(), lblError2, lblError3)){
	    			cboBusRoute4.removeAllItems();
	            	cboBusRoute4.addItem("------SELECT------");
	            	cboBusRoute4.setEnabled(false);
	    		}
	    		else {
		        	addCboBusStop(cboBusRoute4);
		        	cboBusRoute4.setEnabled(true);
		        	lblError3.setText("");
	    		}
	        }
	        else if(cboBusRoute3.getSelectedIndex()==0) {
	        	cboBusRoute4.removeAllItems();
	        	cboBusRoute4.addItem("------SELECT------");
	        	cboBusRoute4.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute3.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute3.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute2.getSelectedItem().toString().trim(), cboBusRoute3.getSelectedItem().toString().trim(), cboBusRoute4.getSelectedItem().toString().trim(), lblError2, lblError3, lblError4)){
		    			cboBusRoute3.setSelectedItem(cboBusRoute3.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute3.getSelectedIndex()==0) {
	        	lblError2.setText("");
	        	lblError3.setText("");
	        	lblError4.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute3ActionPerformed

    private void cboBusRoute4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute4ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute4.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute3.getSelectedItem().toString().trim(), cboBusRoute4.getSelectedItem().toString().trim(), lblError3, lblError4)){
	    			cboBusRoute5.removeAllItems();
	            	cboBusRoute5.addItem("------SELECT------");
	            	cboBusRoute5.setEnabled(false);
	    		}
	    		else {
		        	addCboBusStop(cboBusRoute5);
		        	cboBusRoute5.setEnabled(true);
		        	lblError4.setText("");
	    		}
	        }
	        else if(cboBusRoute4.getSelectedIndex()==0) {
	        	cboBusRoute5.removeAllItems();
	        	cboBusRoute5.addItem("------SELECT------");
	        	cboBusRoute5.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute4.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute4.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute3.getSelectedItem().toString().trim(), cboBusRoute4.getSelectedItem().toString().trim(), cboBusRoute5.getSelectedItem().toString().trim(), lblError3, lblError4, lblError5)){
		    			cboBusRoute4.setSelectedItem(cboBusRoute4.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute4.getSelectedIndex()==0) {
	        	lblError3.setText("");
	        	lblError4.setText("");
	        	lblError5.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute4ActionPerformed

    private void cboBusRoute5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute5ActionPerformed
	 
    	if(rdoCondition==1) {
    		if(cboBusRoute5.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute4.getSelectedItem().toString().trim(), cboBusRoute5.getSelectedItem().toString().trim(), lblError4, lblError5)){
	    			cboBusRoute6.removeAllItems();
	            	cboBusRoute6.addItem("------SELECT------");
	            	cboBusRoute6.setEnabled(false);
	    		}
	    		else {
		        	addCboBusStop(cboBusRoute6);
		        	cboBusRoute6.setEnabled(true);
		        	lblError5.setText("");
	    		}
	        }
	        else if(cboBusRoute5.getSelectedIndex()==0) {
	        	cboBusRoute6.removeAllItems();
	        	cboBusRoute6.addItem("------SELECT------");
	        	cboBusRoute6.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute5.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute5.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute4.getSelectedItem().toString().trim(), cboBusRoute5.getSelectedItem().toString().trim(), cboBusRoute6.getSelectedItem().toString().trim(), lblError4, lblError5, lblError6)){
		    			cboBusRoute5.setSelectedItem(cboBusRoute5.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute5.getSelectedIndex()==0) {
	        	lblError4.setText("");
	        	lblError5.setText("");
	        	lblError6.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute5ActionPerformed

    private void cboBusRoute6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute6ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute6.getSelectedIndex()>0) {
	
	    		if(checkDuplicate(cboBusRoute5.getSelectedItem().toString().trim(), cboBusRoute6.getSelectedItem().toString().trim(), lblError5, lblError6)){
	    			cboBusRoute7.removeAllItems();
	            	cboBusRoute7.addItem("------SELECT------");
	            	cboBusRoute7.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute7);
		        	cboBusRoute7.setEnabled(true);
		        	lblError6.setText("");
	    		}
	        }
	        else if(cboBusRoute6.getSelectedIndex()==0) {
	        	cboBusRoute7.removeAllItems();
	        	cboBusRoute7.addItem("------SELECT------");
	        	cboBusRoute7.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute6.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute6.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute5.getSelectedItem().toString().trim(), cboBusRoute6.getSelectedItem().toString().trim(), cboBusRoute7.getSelectedItem().toString().trim(), lblError5, lblError6, lblError7)){
		    			cboBusRoute6.setSelectedItem(cboBusRoute6.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute6.getSelectedIndex()==0) {
	        	lblError5.setText("");
	        	lblError6.setText("");
	        	lblError7.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute6ActionPerformed

    private void cboBusRoute7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute7ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute7.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute6.getSelectedItem().toString().trim(), cboBusRoute7.getSelectedItem().toString().trim(), lblError6, lblError7)){
	    			cboBusRoute8.removeAllItems();
	            	cboBusRoute8.addItem("------SELECT------");
	            	cboBusRoute8.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute8);
		        	cboBusRoute8.setEnabled(true);
		        	lblError7.setText("");
	    		}
	        }
	        else if(cboBusRoute7.getSelectedIndex()==0) {
	        	cboBusRoute8.removeAllItems();
	        	cboBusRoute8.addItem("------SELECT------");
	        	cboBusRoute8.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute7.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute7.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute6.getSelectedItem().toString().trim(), cboBusRoute7.getSelectedItem().toString().trim(), cboBusRoute8.getSelectedItem().toString().trim(), lblError6, lblError7, lblError8)){
		    			cboBusRoute7.setSelectedItem(cboBusRoute7.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute7.getSelectedIndex()==0) {
	        	lblError6.setText("");
	        	lblError7.setText("");
	        	lblError8.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute7ActionPerformed

    private void cboBusRoute8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute8ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute8.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute7.getSelectedItem().toString().trim(), cboBusRoute8.getSelectedItem().toString().trim(), lblError7, lblError8)){
	    			cboBusRoute9.removeAllItems();
	            	cboBusRoute9.addItem("------SELECT------");
	            	cboBusRoute9.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute9);
		        	cboBusRoute9.setEnabled(true);
		        	lblError8.setText("");
	    		}
	        }
	        else if(cboBusRoute8.getSelectedIndex()==0) {
	        	cboBusRoute9.removeAllItems();
	        	cboBusRoute9.addItem("------SELECT------");
	        	cboBusRoute9.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute8.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute8.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute7.getSelectedItem().toString().trim(), cboBusRoute8.getSelectedItem().toString().trim(), cboBusRoute9.getSelectedItem().toString().trim(), lblError7, lblError8, lblError9)){
		    			cboBusRoute8.setSelectedItem(cboBusRoute8.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute8.getSelectedIndex()==0) {
	        	lblError7.setText("");
	        	lblError8.setText("");
	        	lblError9.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute8ActionPerformed

    private void cboBusRoute9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute9ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute9.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute8.getSelectedItem().toString().trim(), cboBusRoute9.getSelectedItem().toString().trim(), lblError8, lblError9)){
	    			cboBusRoute10.removeAllItems();
	            	cboBusRoute10.addItem("------SELECT------");
	            	cboBusRoute10.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute10);
		        	cboBusRoute10.setEnabled(true);
		        	lblError9.setText("");
	    		}
	        }
	        else if(cboBusRoute9.getSelectedIndex()==0) {
	        	cboBusRoute10.removeAllItems();
	        	cboBusRoute10.addItem("------SELECT------");
	        	cboBusRoute10.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute9.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute9.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute8.getSelectedItem().toString().trim(), cboBusRoute9.getSelectedItem().toString().trim(), cboBusRoute10.getSelectedItem().toString().trim(), lblError8, lblError9, lblError10)){
		    			cboBusRoute9.setSelectedItem(cboBusRoute9.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute9.getSelectedIndex()==0) {
	        	lblError8.setText("");
	        	lblError9.setText("");
	        	lblError10.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute9ActionPerformed

    private void cboBusRoute10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute10ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute10.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute9.getSelectedItem().toString().trim(), cboBusRoute10.getSelectedItem().toString().trim(), lblError9, lblError10)){
	    			cboBusRoute11.removeAllItems();
	            	cboBusRoute11.addItem("------SELECT------");
	            	cboBusRoute11.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute11);
		        	cboBusRoute11.setEnabled(true);
		        	lblError10.setText("");
	    		}
	        }
	        else if(cboBusRoute10.getSelectedIndex()==0) {
	        	cboBusRoute11.removeAllItems();
	        	cboBusRoute11.addItem("------SELECT------");
	        	cboBusRoute11.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute10.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute10.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute9.getSelectedItem().toString().trim(), cboBusRoute10.getSelectedItem().toString().trim(), cboBusRoute11.getSelectedItem().toString().trim(), lblError9, lblError10, lblError11)){
		    			cboBusRoute10.setSelectedItem(cboBusRoute10.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute10.getSelectedIndex()==0) {
	        	lblError9.setText("");
	        	lblError10.setText("");
	        	lblError11.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute10ActionPerformed

    private void cboBusRoute11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute11ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute11.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute10.getSelectedItem().toString().trim(), cboBusRoute11.getSelectedItem().toString().trim(), lblError10, lblError11)){
	    			cboBusRoute12.removeAllItems();
	            	cboBusRoute12.addItem("------SELECT------");
	            	cboBusRoute12.setEnabled(false);
	    		}
	    		else {
		        	addCboBusStop(cboBusRoute12);
		        	cboBusRoute12.setEnabled(true);
		        	lblError11.setText("");
	    		}
	        }
	        else if(cboBusRoute11.getSelectedIndex()==0) {
	        	cboBusRoute12.removeAllItems();
	        	cboBusRoute12.addItem("------SELECT------");
	        	cboBusRoute12.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute11.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute11.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute10.getSelectedItem().toString().trim(), cboBusRoute11.getSelectedItem().toString().trim(), cboBusRoute12.getSelectedItem().toString().trim(), lblError10, lblError11, lblError12)){
		    			cboBusRoute11.setSelectedItem(cboBusRoute11.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute11.getSelectedIndex()==0) {
	        	lblError10.setText("");
	        	lblError11.setText("");
	        	lblError12.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute11ActionPerformed

    private void cboBusRoute12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute12ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute12.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute11.getSelectedItem().toString().trim(), cboBusRoute12.getSelectedItem().toString().trim(), lblError11, lblError12)){
	    			cboBusRoute13.removeAllItems();
	            	cboBusRoute13.addItem("------SELECT------");
	            	cboBusRoute13.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute13);
		        	cboBusRoute13.setEnabled(true);
		        	lblError12.setText("");
	    		}
	        }
	        else if(cboBusRoute12.getSelectedIndex()==0) {
	        	cboBusRoute13.removeAllItems();
	        	cboBusRoute13.addItem("------SELECT------");
	        	cboBusRoute13.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute12.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute12.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute11.getSelectedItem().toString().trim(), cboBusRoute12.getSelectedItem().toString().trim(), cboBusRoute13.getSelectedItem().toString().trim(), lblError11, lblError12, lblError13)){
		    			cboBusRoute12.setSelectedItem(cboBusRoute12.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute12.getSelectedIndex()==0) {
	        	lblError11.setText("");
	        	lblError12.setText("");
	        	lblError13.setText("");
	        }
    	}

    }//GEN-LAST:event_cboBusRoute12ActionPerformed

    private void cboBusRoute13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute13ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute13.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute12.getSelectedItem().toString().trim(), cboBusRoute13.getSelectedItem().toString().trim(), lblError12, lblError13)){
	    			cboBusRoute14.removeAllItems();
	            	cboBusRoute14.addItem("------SELECT------");
	            	cboBusRoute14.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute14);
		        	cboBusRoute14.setEnabled(true);
		        	lblError13.setText("");
	    		}
	        }
	        else if(cboBusRoute13.getSelectedIndex()==0) {
	        	cboBusRoute14.removeAllItems();
	        	cboBusRoute14.addItem("------SELECT------");
	        	cboBusRoute14.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute13.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute13.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute12.getSelectedItem().toString().trim(), cboBusRoute13.getSelectedItem().toString().trim(), cboBusRoute14.getSelectedItem().toString().trim(), lblError12, lblError13, lblError14)){
		    			cboBusRoute13.setSelectedItem(cboBusRoute13.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute13.getSelectedIndex()==0) {
	        	lblError12.setText("");
	        	lblError13.setText("");
	        	lblError14.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute13ActionPerformed

    private void cboBusRoute14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute14ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute14.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute13.getSelectedItem().toString().trim(), cboBusRoute14.getSelectedItem().toString().trim(), lblError13, lblError14)){
	    			cboBusRoute15.removeAllItems();
	            	cboBusRoute15.addItem("------SELECT------");
	            	cboBusRoute15.setEnabled(false);
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute15);
		        	cboBusRoute15.setEnabled(true);
		        	lblError14.setText("");
	    		}
	        }
	        else if(cboBusRoute14.getSelectedIndex()==0) {
	        	cboBusRoute15.removeAllItems();
	        	cboBusRoute15.addItem("------SELECT------");
	        	cboBusRoute15.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute14.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute14.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute13.getSelectedItem().toString().trim(), cboBusRoute14.getSelectedItem().toString().trim(), cboBusRoute15.getSelectedItem().toString().trim(), lblError13, lblError14, lblError15)){
		    			cboBusRoute14.setSelectedItem(cboBusRoute14.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute14.getSelectedIndex()==0) {
	        	lblError13.setText("");
	        	lblError14.setText("");
	        	lblError15.setText("");
	        }
    	}
    }//GEN-LAST:event_cboBusRoute14ActionPerformed

    private void cboBusRoute15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute15ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute15.getSelectedIndex()>0) {
	        	
	    		if(checkDuplicate(cboBusRoute14.getSelectedItem().toString().trim(), cboBusRoute15.getSelectedItem().toString().trim(), lblError14, lblError15)){
	    			cboBusRoute16.removeAllItems();
	            	cboBusRoute16.addItem("------SELECT------");
	            	cboBusRoute16.setEnabled(false);    			
	    		}
	    		else {
		    		addCboBusStop(cboBusRoute16);
		        	cboBusRoute16.setEnabled(true);
		        	lblError15.setText("");
	    		}
	        }
	        else if(cboBusRoute15.getSelectedIndex()==0) {
	        	cboBusRoute16.removeAllItems();
	        	cboBusRoute16.addItem("------SELECT------");
	        	cboBusRoute16.setEnabled(false);
	        }
    	}
    	else if(rdoCondition==2) {
	    	if(cboBusRoute15.getSelectedIndex()>0) {
	    		
	    		if(!cboBusRoute15.getSelectedItem().toString().trim().equals("------SELECT------")) {
		    		if(checkDuplicate(cboBusRoute14.getSelectedItem().toString().trim(), cboBusRoute15.getSelectedItem().toString().trim(), cboBusRoute16.getSelectedItem().toString().trim(), lblError14, lblError15, lblError16)){
		    			cboBusRoute15.setSelectedItem(cboBusRoute15.getSelectedItem().toString().trim());
		    		}
	    		}	    		
	        }
	        else if(cboBusRoute15.getSelectedIndex()==0) {
	        	lblError14.setText("");
	        	lblError15.setText("");
	        	lblError16.setText("");
	        }
    	}

    }//GEN-LAST:event_cboBusRoute15ActionPerformed

    private void cboBusRoute16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusRoute16ActionPerformed
    	
    	if(rdoCondition==1) {
	    	if(cboBusRoute16.getSelectedIndex()>0) {
	    		
	    		if(checkDuplicate(cboBusRoute15.getSelectedItem().toString().trim(), cboBusRoute16.getSelectedItem().toString().trim(), lblError15, lblError16)){
	    			addCboBusStop(cboBusRoute16);
	    			duplicate=false;
	    		}
	    		else {
	    			lblError16.setText("");    			
	    		}
	        }
	        else if(cboBusRoute16.getSelectedIndex()==0) {
	        	
	        }
    	}
    	else if(rdoCondition==2) {
    		
    		if(cboBusRoute16.getSelectedIndex()>0) {
	    			    		
	    		if(checkDuplicate(cboBusRoute16.getSelectedItem().toString().trim(), cboBusRoute15.getSelectedItem().toString().trim(), lblError16, lblError15)){
	    			cboBusRoute16.setSelectedItem(cboBusRoute16.getSelectedItem().toString().trim());
	    		}	    			    		
	        }
	        else if(cboBusRoute16.getSelectedIndex()==0) {
	        	lblError15.setText("");
	        	lblError16.setText("");	        	
	        }

    	}

    }//GEN-LAST:event_cboBusRoute16ActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        
    	if(rdoCondition==1) {
	    	continueCheck();               
	        duplicate=false;
	        
	        if(txtAreaRoute.getText().toString().trim().equals("<No Bus Route Detail!>")) {
	        	txtAreaRoute.setText("");
	        }
	        	        
	        if(lblError16.getText().isEmpty()) {
	        	txtAreaRoute.append(resultRoute());
	        	
	        	resetCboBusRoute();
	        	addCboBusStop(cboBusRoute1);
	        }
    	}
    	else if(rdoCondition==2) {    		    		
    		    	
    		finalDuplicateCheck();								//method to check duplicate
			if(lblError1.getText().isEmpty() && lblError2.getText().isEmpty() && lblError3.getText().isEmpty() && lblError4.getText().isEmpty() && lblError5.getText().isEmpty() && lblError6.getText().isEmpty() && lblError7.getText().isEmpty() && lblError8.getText().isEmpty() && lblError9.getText().isEmpty() && lblError10.getText().isEmpty() && lblError11.getText().isEmpty() && lblError12.getText().isEmpty() && lblError13.getText().isEmpty() && lblError14.getText().isEmpty() && lblError15.getText().isEmpty() && lblError16.getText().isEmpty()) {
    		
	    		updateCondition=true;
	    		getUpdateRouteString();
	    		updateCboBox();    		
			}
			else {
				
			}
    	}
    }//GEN-LAST:event_btnContinueActionPerformed

    //Function Finish
    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {                                                      	    	
    	
    	if(rdoCondition==1) {        	
        	arrayRoute=getArrayRoute();        	        	        	        
    	
	    	//Function to Add bus route to Database    	    	
	    	try {
	    		con=new DBConnection().getDBConnection();
	    		ste=con.createStatement();
	    		int result=0;
		    	for(int a=0; a<arrayRoute.size(); a++) {
		    		//Auto ID for BusDetailID in busDetail table
		    		String busRouteID=getAutoID("BusDetailID", "busdetail", "B");		    		
		    		
			    	rs=ste.executeQuery("SELECT BusStopID FROM busstop WHERE BusStopName='" + arrayRoute.get(a) + "'");
			    	
			    	if(rs.next()) {			    		
			    		String sql="INSERT INTO busdetail(BusDetailID, BusStopID, BusLineNo) VALUES('" + busRouteID + "', '" + rs.getString(1) + "', " + cboBusRouteNo.getSelectedItem().toString().trim() + ")";
			    		result=ste.executeUpdate(sql);				    					    		
			    	}
			    	
		    	}		    	
		    	if(result==1) {
		    		lblBusRouteRes.setText("Routes Saved!");
		    		
		    		//update detail in update detail table    				
    				addUpdateDetail("added Bus Route For " + cboBusRouteNo.getSelectedItem().toString().trim());
    				clear();
		    	}
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}   
    	}
    	else {    		
    		
    		try {
    			finalDuplicateCheck();								//method to check duplicate
    			if(lblError1.getText().isEmpty() && lblError2.getText().isEmpty() && lblError3.getText().isEmpty() && lblError4.getText().isEmpty() && lblError5.getText().isEmpty() && lblError6.getText().isEmpty() && lblError7.getText().isEmpty() && lblError8.getText().isEmpty() && lblError9.getText().isEmpty() && lblError10.getText().isEmpty() && lblError11.getText().isEmpty() && lblError12.getText().isEmpty() && lblError13.getText().isEmpty() && lblError14.getText().isEmpty() && lblError15.getText().isEmpty() && lblError16.getText().isEmpty()) {
		    		
    				if(updateCondition==true) {
    	    			getUpdateRouteString();
    	    			updateCondition=false;
    	    		}
    				
    				int result=0;
		    		con=new DBConnection().getDBConnection();
		    		ste=con.createStatement();
		    		for(int a=0; a<updateArrayRoute.size(); a++) {
		    			result=ste.executeUpdate(updateArrayRoute.get(a).toString().trim());	    			
		    		}
		    		if(result==1) {
		    			clear();
		    			lblBusRouteRes.setText("Routes Updated!");	   
		    			
		    			//update detail in update detail table    				
	    				addUpdateDetail("updated Bus Route For " + cboBusRouteNo.getSelectedItem().toString().trim());
		    		}
    			}
    		}catch(Exception e) {
    			System.out.println(e);
    		}
    	}
    	
    	btnContinue.setEnabled(true);
    	ConnClose();
    }//Function to Add bus route to Database  - End                                         

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void rdoCreateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCreateNewActionPerformed
    	updateCondition=true;
    	rdoCondition=1;
        clear();
        btnContinue.setText("Continue");
        btnContinue.setMnemonic('t');
        cboBusRoute1.setEnabled(true);
    }//GEN-LAST:event_rdoCreateNewActionPerformed

    private void rdoUpdateExistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoUpdateExistingActionPerformed
    	updateCondition=true;
    	rdoCondition=2;
        clear();
        btnContinue.setText("Next");
        btnContinue.setMnemonic('N');
        updateBusDetailID.clear();
        updateArrayRoute.clear();
    }//GEN-LAST:event_rdoUpdateExistingActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        new MainMenu(user).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function_AddBusStop().setVisible(true);
            }
        });
    }
    
    //adding Bus Stop function
    private void addBusStop() {    	    	
    	
    	String busStopid=getAutoID("BusStopID", "busstop", "BS");
    	String busStopName=txtBusStop.getText().trim();    	    	
    	
    	try {
    		con=new DBConnection().getDBConnection();
    		ste=con.createStatement();
    		    	
    		if(busStopName.isEmpty()) {
    			throw new BlankException();    			
    		}
    		    		
			if(Character.isDigit(busStopName.charAt(0))) {
				throw new StringException();
			}  
			
			//To check Special Character
			Pattern pattern=Pattern.compile("[a-zA-Z0-9()]+$");
			Matcher matcher=pattern.matcher(busStopName);
			if(!matcher.find()) {
				throw new SpecialCharacterException();
			}
			//To check Special Character  - End
			
    		rs=ste.executeQuery("SELECT * FROM busstop WHERE BusStopName='" + busStopName + "'");    		
    		
    		if(rs.next()) {
    			lblErrorBusStop.setText("*Inputted Bus Stop name existed!");
    			txtBusStop.requestFocus();
    		}
    		else {
    			String sql="INSERT INTO busstop(BusStopID, BusStopName) VALUES('" + busStopid + "', '" + busStopName + "')";
    			
    			int result=ste.executeUpdate(sql);
    			if(result==1) {
    				txtBusStop.setText("");
    				
    				lblErrorBusStop.setForeground(new java.awt.Color(0, 255, 255));    				    				    				
    				lblErrorBusStop.setText("Record Saved!");    
    				
    				//update detail in update detail table    				
    				addUpdateDetail("added Bus Stop: " + busStopid);
    				
    				requestFocus(txtBusStop);      				     				    				
    			}
    		}
    	}catch(StringException e){
			lblErrorBusStop.setText("The First Character can't be Number");
			
			txtBusStop.setText("");	
			requestFocus(txtBusStop);			
    	}catch(BlankException e) {
    		lblErrorBusStop.setText(e.getMessage());
			
			txtBusStop.setText("");								
			requestFocus(txtBusStop);  		
    	}catch(SpecialCharacterException e) {
    		lblErrorBusStop.setText(e.getMessage());
			
			txtBusStop.setText("");								
			requestFocus(txtBusStop);    		
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	ConnClose();
    }
    //adding Bus Stop function  - End
    
    //adding Bus Line function
    private void addBusLine() {    	    	
    	    	
    	String stringBusLine, stringBusPrice;
    	stringBusLine=txtBusLine.getText().trim();
    	stringBusPrice=txtPrice.getText().trim();  
    	
    	int busLine, busPrice;
    	busLine=busPrice=0;
    	
    	Boolean state=true;
    	
    	//for BusLine Error Checking
    	try {    	    		    	
    		if(stringBusLine.isEmpty()) {
    			throw new BlankException();	    				    			
    		}    		    	
    		
			//Check Bus Line isDigit
    		for(int a=0; a<stringBusLine.length(); a++) {
    			if(stringBusLine.charAt(0)=='-') {
        			
        		}
    			else if(!Character.isDigit(stringBusLine.charAt(a))) {
    				throw new NumericException();	        					        				
    			}    			
    		}	        		
    		//Check Bus Line isDigit  - End	    		    		    		    			    		    		    		    		    	    		    		 											
				
			busLine=Integer.parseInt(txtBusLine.getText().trim());		    	
	    	
	    	if(busLine<=0) {
	    		
	    		if(busLine==0) {
	    			throw new NumberZeroException();	    					    		
	    		}
	    		
	    		throw new NegativeNumericException();	    			    		
	    	}
	    	
	    	//for BusPrice Error Checking
	    	try {    		    		    		
		    	if(stringBusPrice.isEmpty()) {
		    		throw new BlankException();    				    			    		
	    		}
		    	
				//Check Price isDigit
	    		for(int a=0; a<stringBusPrice.length(); a++) {
	    			if(stringBusPrice.charAt(0)=='-') {
	        			
	        		}
	    			else if(!Character.isDigit(stringBusPrice.charAt(a))) {
	    				throw new NumericException();
	    			}    			
	    		}	        		
	    		//Check Bus Line isDigit  - End    		      		    		    	    		    		 				
											
		    	busPrice=Integer.parseInt(txtPrice.getText().trim());
			    			    
		    	if(busPrice<=0) {
		    		
		    		if(busPrice==0) {
		    			throw new NumberZeroException();
		    		}
		    		
		    		throw new NegativeNumericException();
		    	}
		    	
		    	//Check Bus No existed
		    	try {
		    		con=new DBConnection().getDBConnection();
		    		ste=con.createStatement();
									
		    		rs=ste.executeQuery("SELECT * FROM busline WHERE BusLineNo=" + busLine);    		
		    		
		    		if(rs.next()) {
		    			lblErrorBusLine.setText("*Inputted Bus Line number existed!");
		    			txtBusLine.selectAll();
		    			requestFocus(txtBusLine);
		    		}
		    		else {
		    			String sql="INSERT INTO busline(BusLineNo, BusPrice) VALUES(" + busLine + ", " + busPrice + ")";
		    			
		    			int result=ste.executeUpdate(sql);
		    			if(result==1) {
		    				txtBusLine.setText("");
		    				txtPrice.setText("");
		    				
		    				lblErrorBusLine.setForeground(new java.awt.Color(0, 255, 255));
		    				lblErrorBusLine.setText("Record Saved!");  
		    				
		    				//update detail in update detail table
		    				addUpdateDetail("added Bus Line: " + busLine);
		    				
		    				requestFocus(txtBusLine);	    				
		    			}
		    		}		    		
		    	}catch(Exception e) {
		    		System.out.println(e);
		    	}
		    	//Check Bus No existed  - End
	    	}catch(BlankException e) {
	    		lblErrorPrice.setText(e.getMessage());
				
	    		txtPrice.setText("");	
				requestFocus(txtPrice);	    			
				state=false;
	    	}catch(NumericException e) {
	    		lblErrorPrice.setText(e.getMessage());
				state=false;
				txtPrice.setText("");
				requestFocus(txtPrice);
	    	}catch(NumberZeroException e) {
	    		lblErrorPrice.setText(e.getMessage());
	    		txtPrice.setText("");
	    		requestFocus(txtPrice);
	    	}catch(NegativeNumericException e) {
	    		lblErrorPrice.setText(e.getMessage());
	    		txtPrice.setText("");
	    		requestFocus(txtPrice);
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    	//for BusPrice Error Checking  - End	    	
    	}catch(BlankException e) {
    		lblErrorBusLine.setText(e.getMessage());
			
			txtBusLine.setText("");	
			requestFocus(txtBusLine);	    			
			state=false;
    	}catch(NumericException e) {
    		lblErrorBusLine.setText(e.getMessage());
			state=false;
			txtBusLine.setText("");
			requestFocus(txtBusLine);
    	}catch(NumberZeroException e) {
    		lblErrorBusLine.setText(e.getMessage());
    		txtBusLine.setText("");
    		requestFocus(txtBusLine);
    	}catch(NegativeNumericException e) {
    		lblErrorBusLine.setText(e.getMessage());
    		txtBusLine.setText("");
    		requestFocus(txtBusLine);
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	ConnClose();
    	//for BusLine Error Checking  - End    	    	    	    	    	        	    	
    }
    //adding Bus Line function  - End        
    
    //Function - Adding Bus Route
    private void addCboBusNumber() {
    	cboBusRouteNo.removeAllItems();
    	cboBusRouteNo.addItem("------SELECT------");
    	try {
    		con=new DBConnection().getDBConnection();
    		ste=con.createStatement();
    		String query="SELECT BusLineNo FROM busline ORDER BY BusLineNo DESC";
    		rs=ste.executeQuery(query);
    		
    		while(rs.next()) {
    			cboBusRouteNo.addItem(rs.getString(1));
    		}
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	ConnClose();
    }
    //Function - Adding Bus Route  - End
    
    //cboBus Stops Initialize 
    private void busStopInitialize() {
    	cboBusRouteNo.addItem("------SELECT------");    	
    }
    
    private void resetCboBusRoute() {
    	try {
	    	cboBusRoute1.removeAllItems();
	    	cboBusRoute1.addItem("------SELECT------");
	    	cboBusRoute2.removeAllItems();
	    	cboBusRoute2.addItem("------SELECT------");
	    	cboBusRoute3.removeAllItems();
	    	cboBusRoute3.addItem("------SELECT------");
	    	cboBusRoute4.removeAllItems();
	    	cboBusRoute4.addItem("------SELECT------");
	    	cboBusRoute5.removeAllItems();
	    	cboBusRoute5.addItem("------SELECT------");
	    	cboBusRoute6.removeAllItems();
	    	cboBusRoute6.addItem("------SELECT------");
	    	cboBusRoute7.removeAllItems();
	    	cboBusRoute7.addItem("------SELECT------");
	    	cboBusRoute8.removeAllItems();
	    	cboBusRoute8.addItem("------SELECT------");
	    	cboBusRoute9.removeAllItems();
	    	cboBusRoute9.addItem("------SELECT------");
	    	cboBusRoute10.removeAllItems();
	    	cboBusRoute10.addItem("------SELECT------");
	    	cboBusRoute11.removeAllItems();
	    	cboBusRoute11.addItem("------SELECT------");
	    	cboBusRoute12.removeAllItems();
	    	cboBusRoute12.addItem("------SELECT------");
	    	cboBusRoute13.removeAllItems();
	    	cboBusRoute13.addItem("------SELECT------");
	    	cboBusRoute14.removeAllItems();
	    	cboBusRoute14.addItem("------SELECT------");
	    	cboBusRoute15.removeAllItems();
	    	cboBusRoute15.addItem("------SELECT------");
	    	cboBusRoute16.removeAllItems();
	    	cboBusRoute16.addItem("------SELECT------");
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    //disable all cboBusRoute
    private void disableAllcboBusRoute() {
    	resetCboBusRoute();
    	cboBusRoute1.setEnabled(false); cboBusRoute2.setEnabled(false); cboBusRoute3.setEnabled(false); cboBusRoute4.setEnabled(false);
    	cboBusRoute5.setEnabled(false); cboBusRoute6.setEnabled(false); cboBusRoute7.setEnabled(false); cboBusRoute8.setEnabled(false);
    	cboBusRoute9.setEnabled(false); cboBusRoute10.setEnabled(false); cboBusRoute11.setEnabled(false); cboBusRoute12.setEnabled(false);
    	cboBusRoute13.setEnabled(false); cboBusRoute14.setEnabled(false); cboBusRoute15.setEnabled(false); cboBusRoute16.setEnabled(false);
    }
    //disable all cboBusRoute  - End
    
    //Function - Adding Bus Stop
    private void addCboBusStop(JComboBox cboBox) {
    	cboBox.removeAllItems();
    	cboBox.addItem("------SELECT------");
    	try {
    		con=new DBConnection().getDBConnection();
    		ste=con.createStatement();
    		String query="SELECT BusStopName FROM busstop ORDER BY BusStopName";
    		rs=ste.executeQuery(query);
    		
    		while(rs.next()) {
    			cboBox.addItem(rs.getString(1));
    		}
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	ConnClose();
    }
    //Function - Adding Bus Stop  - End
    
    //Function continueCheck
    private void continueCheck() {
    	if(cboBusRoute1.getSelectedIndex()==0) {
    		lblError1.setText("Emptied!");
    	}
    	if(cboBusRoute2.getSelectedIndex()==0) {
    		lblError2.setText("Emptied!");
    	}
    	if(cboBusRoute3.getSelectedIndex()==0) {
    		lblError3.setText("Emptied!");
    	}
    	if(cboBusRoute4.getSelectedIndex()==0) {
    		lblError4.setText("Emptied!");
    	}
    	if(cboBusRoute5.getSelectedIndex()==0) {
    		lblError5.setText("Emptied!");
    	}
    	if(cboBusRoute6.getSelectedIndex()==0) {
    		lblError6.setText("Emptied!");
    	}
    	if(cboBusRoute7.getSelectedIndex()==0) {
    		lblError7.setText("Emptied!");
    	}
    	if(cboBusRoute8.getSelectedIndex()==0) {
    		lblError8.setText("Emptied!");
    	}
    	if(cboBusRoute9.getSelectedIndex()==0) {
    		lblError9.setText("Emptied!");
    	}
    	if(cboBusRoute10.getSelectedIndex()==0) {
    		lblError10.setText("Emptied!");
    	}
    	if(cboBusRoute11.getSelectedIndex()==0) {
    		lblError11.setText("Emptied!");
    	}
    	if(cboBusRoute12.getSelectedIndex()==0) {
    		lblError12.setText("Emptied!");
    	}
    	if(cboBusRoute13.getSelectedIndex()==0) {
    		lblError13.setText("Emptied!");
    	}
    	if(cboBusRoute14.getSelectedIndex()==0) {
    		lblError14.setText("Emptied!");
    	}
    	if(cboBusRoute15.getSelectedIndex()==0) {
    		lblError15.setText("Emptied!");
    	}
    	if(cboBusRoute16.getSelectedIndex()==0) {
    		lblError16.setText("Emptied!");
    	}
    }
    //Function continueCheck  - End
    
    //Check Duplicate
    private Boolean checkDuplicate(String busStop1, String busStop2, JLabel label1, JLabel label2) {
    	if(busStop1.equals(busStop2)) {
    		label1.setText("*Duplicate");
    		label2.setText("*Duplicate");
    		duplicate=true;
    		
    		return true;
    	}
    	else {
    		label1.setText("");
    		label2.setText("");
    		duplicate=false;
    		
    		return false;
    	}
    }
    //Check Duplicate  - End
    
    //Check Duplicate For Update Detail
    private Boolean checkDuplicate(String busStop1, String busStop2, String busStop3, JLabel label1, JLabel label2, JLabel label3) {
    	
    	label1.setText("");
		label2.setText("");
		label3.setText("");
		
    	if(busStop1.equals(busStop2)) {
    		label1.setText("*Duplicate");
    		label2.setText("*Duplicate");
    		duplicate=true;
    		
    		return true;
    	}
    	else if(busStop2.equals(busStop3)) {
    		label2.setText("*Duplicate");
    		label3.setText("*Duplicate");
    		duplicate=true;
    		
    		return true;
    	}
    	else {
    		label1.setText("");
    		label2.setText("");
    		label3.setText("");
    		duplicate=false;
    		
    		return false;
    	}
    }
    //Check Duplicate For Update Detail - End
    
    //reset busline and bus stop
    private void resetALLBus() {
    	
    	//reset error label box of busline and bus stop
    	txtBusStop.setText("");
    	txtBusLine.setText("");
    	txtPrice.setText("");
    	
    	//reset error label box of busline and bus stop
    	lblErrorBusLine.setText("");
    	lblErrorBusStop.setText("");
    	lblErrorPrice.setText("");
    }
    
    //Reset cboBusRoute Error
    private void resetCboBusRouteError() {
    	lblError1.setText("");	lblError2.setText("");	lblError3.setText("");
    	lblError4.setText("");	lblError5.setText("");	lblError6.setText("");
    	lblError7.setText("");	lblError8.setText("");	lblError9.setText("");
    	lblError10.setText("");	lblError11.setText("");	lblError12.setText("");
    	lblError13.setText("");	lblError14.setText("");	lblError15.setText("");
    	lblError16.setText("");
    	
    }
    //Reset cboBusRoute Error  - End
    
    //clear
    private void clear() {
    	resetALLBus();
    	addCboBusNumber();
    	resetCboBusRoute();
    	txtAreaRoute.setText("");
    	resetCboBusRouteError();
    	duplicate=false;
    	updateCondition=true;
    	arrayRoute.clear();
    	lastBusStop="";
    	lblBusRouteRes.setText("");
    	btnContinue.setEnabled(true);
    }
    //clear  - End
    
    //txtArea route result
    private String resultRoute() {
    	String route="";
    	route+="\n " + cboBusRoute1.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute2.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute3.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute4.getSelectedItem().toString().trim() + "  ||\n ";
    	route+=cboBusRoute5.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute6.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute7.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute8.getSelectedItem().toString().trim() + "  ||\n ";
    	route+=cboBusRoute9.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute10.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute11.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute12.getSelectedItem().toString().trim() + "  ||\n ";
    	route+=cboBusRoute13.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute14.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute15.getSelectedItem().toString().trim() + "  ||  " + cboBusRoute16.getSelectedItem().toString().trim() + "  ||";        	    	    	
    	
    	lastBusStop=cboBusRoute16.getSelectedItem().toString().trim();
    	
    	return route;
    }
    //txtArea route result  - End
    
    //for auto id store in table (eg. busstop table	(field-busStopID, table-busstop, prefix-BS))
    private String getAutoID(String field, String table, String prefix) {
    	
    	DBConnection connect=new DBConnection();
    	if(table.equals("busstop")) {
    		return connect.getPrimaryKey(field, table, prefix);
    	}
    	else if(table.equals("busdetail") || table.equals("updatedetail")) {
    		return connect.getPrimaryKey3(field, table, prefix);
    	}
    	else {
    		return connect.getPrimaryKey2(field, table, prefix);
    	}    	
    }
    //for auto id store in busstop table	(field-busStopID, table-busstop, prefix-BS)  - End
    
    //add Bus Route selected in bus route combo 
    private void addRouteFromCombo(ArrayList aRoute) {
		if(cboBusRoute1.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute1.getSelectedItem().toString().trim());
		}
		if(cboBusRoute2.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute2.getSelectedItem().toString().trim());
		}
		if(cboBusRoute3.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute3.getSelectedItem().toString().trim());
		}
		if(cboBusRoute4.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute4.getSelectedItem().toString().trim());
		}
		if(cboBusRoute5.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute5.getSelectedItem().toString().trim());
		}
		if(cboBusRoute6.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute6.getSelectedItem().toString().trim());
		}
		if(cboBusRoute7.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute7.getSelectedItem().toString().trim());
		}
		if(cboBusRoute8.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute8.getSelectedItem().toString().trim());
		}
		if(cboBusRoute9.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute9.getSelectedItem().toString().trim());
		}
		if(cboBusRoute10.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute10.getSelectedItem().toString().trim());
		}
		if(cboBusRoute11.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute11.getSelectedItem().toString().trim());
		}
		if(cboBusRoute12.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute12.getSelectedItem().toString().trim());
		}
		if(cboBusRoute13.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute13.getSelectedItem().toString().trim());
		}
		if(cboBusRoute14.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute14.getSelectedItem().toString().trim());
		}
		if(cboBusRoute15.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute15.getSelectedItem().toString().trim());
		}
		if(cboBusRoute16.getSelectedItem().toString().trim()!="------SELECT------") {
			aRoute.add(cboBusRoute16.getSelectedItem().toString().trim());
		}
    }
    
    private void updateCboBox() {
    	ArrayList aRoute=new ArrayList();
    	aRoute=getArrayRoute();
    	txtAreaRoute.setText("");
    	
    	if(aRoute.size()!=0) {
    		disableAllcboBusRoute();
    	}
    	
    	if(aRoute.size()<=16 && rdoCondition==2) {
    		btnContinue.setEnabled(false);								//There is no data left to Continue in text area
    	}
    	
    	for(int a=0; a<aRoute.size() && a<16; a++) {    		
			switch(a) {
				case 0: addCboBusStop(cboBusRoute1); cboBusRoute1.setSelectedItem(aRoute.get(a)); cboBusRoute1.setEnabled(true); break;
				case 1: addCboBusStop(cboBusRoute2); cboBusRoute2.setSelectedItem(aRoute.get(a)); cboBusRoute2.setEnabled(true); break;
				case 2: addCboBusStop(cboBusRoute3); cboBusRoute3.setSelectedItem(aRoute.get(a)); cboBusRoute3.setEnabled(true); break;
				case 3: addCboBusStop(cboBusRoute4); cboBusRoute4.setSelectedItem(aRoute.get(a)); cboBusRoute4.setEnabled(true); break;
				case 4: addCboBusStop(cboBusRoute5); cboBusRoute5.setSelectedItem(aRoute.get(a)); cboBusRoute5.setEnabled(true); break;
				case 5: addCboBusStop(cboBusRoute6); cboBusRoute6.setSelectedItem(aRoute.get(a)); cboBusRoute6.setEnabled(true); break;
				case 6: addCboBusStop(cboBusRoute7); cboBusRoute7.setSelectedItem(aRoute.get(a)); cboBusRoute7.setEnabled(true); break;
				case 7: addCboBusStop(cboBusRoute8); cboBusRoute8.setSelectedItem(aRoute.get(a)); cboBusRoute8.setEnabled(true); break;
				case 8: addCboBusStop(cboBusRoute9); cboBusRoute9.setSelectedItem(aRoute.get(a)); cboBusRoute9.setEnabled(true); break;
				case 9: addCboBusStop(cboBusRoute10); cboBusRoute10.setSelectedItem(aRoute.get(a)); cboBusRoute10.setEnabled(true); break;
				case 10: addCboBusStop(cboBusRoute11); cboBusRoute11.setSelectedItem(aRoute.get(a)); cboBusRoute11.setEnabled(true); break;
				case 11: addCboBusStop(cboBusRoute12); cboBusRoute12.setSelectedItem(aRoute.get(a)); cboBusRoute12.setEnabled(true); break;
				case 12: addCboBusStop(cboBusRoute13); cboBusRoute13.setSelectedItem(aRoute.get(a)); cboBusRoute13.setEnabled(true); break;
				case 13: addCboBusStop(cboBusRoute14); cboBusRoute14.setSelectedItem(aRoute.get(a)); cboBusRoute14.setEnabled(true); break;
				case 14: addCboBusStop(cboBusRoute15); cboBusRoute15.setSelectedItem(aRoute.get(a)); cboBusRoute15.setEnabled(true); break;
				case 15: addCboBusStop(cboBusRoute16); cboBusRoute16.setSelectedItem(aRoute.get(a)); cboBusRoute16.setEnabled(true); break;
			}    		
    	}
    	if(aRoute.size()>=16) {
    		for(int a=16; a<aRoute.size(); a++) {
    			txtAreaRoute.append(" " + aRoute.get(a) + "  || ");
    			
    			if(a!=16 && a%4==0) {
    				txtAreaRoute.append("\n");
    			}
    		}
    	}
    	aRoute.clear();    	
    }        
    
    private void getUpdateRouteString() {
    	
    	String sql="UPDATE busdetail SET BusStopID='";
    	ArrayList updatebusStop=new ArrayList();
    	ArrayList updatebusStopID=new ArrayList();
    	ArrayList updatebusRouteID=new ArrayList();    	    	    	
    	
    	try {
	    	if(updateBusDetailID.size()!=0) {
				for(int a=0; a<16; a++) {
		    		
					if(updateBusDetailID.size()!=0) {
						switch(a) {
				    		case 0: updatebusStop.add(cboBusRoute1.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 1: updatebusStop.add(cboBusRoute2.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 2: updatebusStop.add(cboBusRoute3.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 3: updatebusStop.add(cboBusRoute4.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 4: updatebusStop.add(cboBusRoute5.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 5: updatebusStop.add(cboBusRoute6.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 6: updatebusStop.add(cboBusRoute7.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 7: updatebusStop.add(cboBusRoute8.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 8: updatebusStop.add(cboBusRoute9.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 9: updatebusStop.add(cboBusRoute10.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 10: updatebusStop.add(cboBusRoute11.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 11: updatebusStop.add(cboBusRoute12.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 12: updatebusStop.add(cboBusRoute13.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 13: updatebusStop.add(cboBusRoute14.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 14: updatebusStop.add(cboBusRoute15.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
							case 15: updatebusStop.add(cboBusRoute16.getSelectedItem().toString().trim()); updatebusRouteID.add(updateBusDetailID.get(0)); updateBusDetailID.remove(0); break;
			    		}
					}
				}
	    	}
    	}catch(Exception e) {
    		System.out.println(e);
    	}    	    	    	    	    	
    	
    	//generate Delete sql code for combo box that choosing ---SELECT---
    	for(int a=0; a<updatebusStop.size(); a++) {    		    		    		        		
    		
    		if(updatebusStop.get(a).equals("------SELECT------")) {
    			int num=a;
    			
    			updateArrayRoute.add("DELETE FROM busdetail WHERE BusDetailID='" + updatebusRouteID.get(a) + "'");
    			updatebusStop.remove(a);
    			updatebusRouteID.remove(a);    			    			
    			    			
    			a=num;
    		}    		    		
    	}     	
    	
    	for(int a=0; a<updatebusStop.size(); a++) {
    		
    		try {
    			con=new DBConnection().getDBConnection();    			
    			ste=con.createStatement();
    			    			
    			rs=ste.executeQuery("SELECT BusStopID FROM busstop WHERE BusStopName='" + updatebusStop.get(a) + "'");
    			
    			if(rs.next()) {
    				updatebusStopID.add(rs.getString(1).trim());
    			}    			    			    			    		
				updateArrayRoute.add(sql + updatebusStopID.get(a) + "' WHERE BusDetailID='" + updatebusRouteID.get(a) + "'");
    			
    		}catch(Exception e) {
    			System.out.println(e);	    			
    		}
		}
    	ConnClose();
    }
    
    //return ArrayList tokenized in textArea
    private ArrayList getArrayRoute() {
    	
    	ArrayList aRoute=new ArrayList();    	
    	
    	if(rdoCondition==1) {
	    	if(!txtAreaRoute.getText().toString().trim().isEmpty()||cboBusRoute1.getSelectedItem().toString().trim()!="------SELECT------") {
	    	
	    		if(!txtAreaRoute.getText().toString().trim().equals("<No Bus Route Detail!>")) {
	    			busRoute=txtAreaRoute.getText().toString().trim();
	    		}
	    		
	    		//Tokenize the text area route
	    		StringTokenizer stk=new StringTokenizer(busRoute, "||");
	    		while(stk.hasMoreElements()) {
	    			aRoute.add(stk.nextToken().trim());
	    		}
	    		
	    		addRouteFromCombo(aRoute);
	    		
	    		//cut the data duplicated in combo
	    		if(duplicate) {
	    			aRoute.remove(aRoute.size()-1);
	    		}    		    		
	    	}
	    	else {
	    		txtAreaRoute.setText("<No Bus Route Detail!>");
	    	}    	    	
	    	return aRoute;
    	}
    	else {
    		if(!txtAreaRoute.getText().toString().trim().isEmpty()||cboBusRoute1.getSelectedItem().toString().trim()!="------SELECT------") {
    	    	
	    		if(!txtAreaRoute.getText().toString().trim().equals("<No Bus Route Detail!>")) {
	    			busRoute=txtAreaRoute.getText().toString().trim();
	    		}
	    		
	    		//Tokenize the text area route
	    		StringTokenizer stk=new StringTokenizer(busRoute, "||");
	    		while(stk.hasMoreElements()) {
	    			aRoute.add(stk.nextToken().trim());
	    		}
    		}
    		else {
	    		txtAreaRoute.setText("<No Bus Route Detail!>");	    		
	    	}    	    	
	    	return aRoute;
    	}
    }
    
    private void requestFocus(JTextField textfield) {
    	textfield.requestFocus();
    }
    
    //Close Connection
    private void ConnClose() {
    	try {
    		con.close();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
    private void finalDuplicateCheck() {
    	    	
    	checkDuplicate(cboBusRoute1.getSelectedItem().toString().trim(), cboBusRoute2.getSelectedItem().toString().trim(), cboBusRoute3.getSelectedItem().toString().trim(), lblError1, lblError2, lblError3);
    	checkDuplicate(cboBusRoute4.getSelectedItem().toString().trim(), cboBusRoute5.getSelectedItem().toString().trim(), cboBusRoute6.getSelectedItem().toString().trim(), lblError4, lblError5, lblError6);
    	checkDuplicate(cboBusRoute7.getSelectedItem().toString().trim(), cboBusRoute8.getSelectedItem().toString().trim(), cboBusRoute9.getSelectedItem().toString().trim(), lblError7, lblError8, lblError9);
    	checkDuplicate(cboBusRoute10.getSelectedItem().toString().trim(), cboBusRoute11.getSelectedItem().toString().trim(), cboBusRoute12.getSelectedItem().toString().trim(), lblError10, lblError11, lblError12);
    	checkDuplicate(cboBusRoute13.getSelectedItem().toString().trim(), cboBusRoute14.getSelectedItem().toString().trim(), lblError13, lblError14);
    	checkDuplicate(cboBusRoute15.getSelectedItem().toString().trim(), cboBusRoute16.getSelectedItem().toString().trim(), lblError15, lblError16);
    	
    	//check the joint between three check duplicate
    	checkDuplicate(cboBusRoute3.getSelectedItem().toString().trim(), cboBusRoute4.getSelectedItem().toString().trim(), lblError3, lblError4);
    	checkDuplicate(cboBusRoute6.getSelectedItem().toString().trim(), cboBusRoute7.getSelectedItem().toString().trim(), lblError6, lblError7);
    	checkDuplicate(cboBusRoute9.getSelectedItem().toString().trim(), cboBusRoute10.getSelectedItem().toString().trim(), lblError9, lblError10);
    	checkDuplicate(cboBusRoute12.getSelectedItem().toString().trim(), cboBusRoute13.getSelectedItem().toString().trim(), lblError12, lblError13);
    	checkDuplicate(cboBusRoute14.getSelectedItem().toString().trim(), cboBusRoute15.getSelectedItem().toString().trim(), lblError14, lblError15);
    	
    	clearSelectError();
    }
    
    //clear the error label box that is selected "------SELECT------"
    private void clearSelectError() {
    	if(cboBusRoute1.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError1.setText("");
    	}
    	if(cboBusRoute2.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError2.setText("");
    	}
    	if(cboBusRoute3.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError3.setText("");
    	}
    	if(cboBusRoute4.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError4.setText("");
    	}
    	if(cboBusRoute5.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError5.setText("");
    	}
    	if(cboBusRoute6.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError6.setText("");
    	}
    	if(cboBusRoute7.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError7.setText("");
    	}
    	if(cboBusRoute8.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError8.setText("");
    	}
    	if(cboBusRoute9.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError9.setText("");
    	}
    	if(cboBusRoute10.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError10.setText("");
    	}
    	if(cboBusRoute11.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError11.setText("");
    	}
    	if(cboBusRoute12.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError12.setText("");
    	}
    	if(cboBusRoute13.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError13.setText("");
    	}
    	if(cboBusRoute14.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError14.setText("");
    	}
    	if(cboBusRoute15.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError15.setText("");
    	}
    	if(cboBusRoute16.getSelectedItem().toString().trim().equals("------SELECT------")) {
    		lblError16.setText("");
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
    	ConnClose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusLineCreate;
    private javax.swing.JButton btnBusStopCreate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnFinish;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboBusRoute1;
    private javax.swing.JComboBox<String> cboBusRoute10;
    private javax.swing.JComboBox<String> cboBusRoute11;
    private javax.swing.JComboBox<String> cboBusRoute12;
    private javax.swing.JComboBox<String> cboBusRoute13;
    private javax.swing.JComboBox<String> cboBusRoute14;
    private javax.swing.JComboBox<String> cboBusRoute15;
    private javax.swing.JComboBox<String> cboBusRoute16;
    private javax.swing.JComboBox<String> cboBusRoute2;
    private javax.swing.JComboBox<String> cboBusRoute3;
    private javax.swing.JComboBox<String> cboBusRoute4;
    private javax.swing.JComboBox<String> cboBusRoute5;
    private javax.swing.JComboBox<String> cboBusRoute6;
    private javax.swing.JComboBox<String> cboBusRoute7;
    private javax.swing.JComboBox<String> cboBusRoute8;
    private javax.swing.JComboBox<String> cboBusRoute9;
    private javax.swing.JComboBox<String> cboBusRouteNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBusRouteRes;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError10;
    private javax.swing.JLabel lblError11;
    private javax.swing.JLabel lblError12;
    private javax.swing.JLabel lblError13;
    private javax.swing.JLabel lblError14;
    private javax.swing.JLabel lblError15;
    private javax.swing.JLabel lblError16;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblError3;
    private javax.swing.JLabel lblError4;
    private javax.swing.JLabel lblError5;
    private javax.swing.JLabel lblError6;
    private javax.swing.JLabel lblError7;
    private javax.swing.JLabel lblError8;
    private javax.swing.JLabel lblError9;
    private javax.swing.JLabel lblErrorBusLine;
    private javax.swing.JLabel lblErrorBusStop;
    private javax.swing.JLabel lblErrorPrice;
    private javax.swing.JRadioButton rdoCreateNew;
    private javax.swing.JRadioButton rdoUpdateExisting;
    private javax.swing.JTextArea txtAreaRoute;
    private javax.swing.JTextField txtBusLine;
    private javax.swing.JTextField txtBusStop;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
