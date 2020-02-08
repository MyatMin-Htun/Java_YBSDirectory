package ybsDirectory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JLabel;

import Exception.BlankException;

public class Function_SearchBusRoute extends javax.swing.JFrame {
    
	private Connection con=null;
	private Statement ste=null;
	private ResultSet rs=null;		
	
	private int firstBusStop=0;
	private int lastBusStop=48;
	private int value=0;
	private boolean condition=false;
	private boolean Searchcondition=true;
	private ArrayList busStop=new ArrayList();
	
	private User user=new User();
	
    public Function_SearchBusRoute() {
        initComponents();
        
        setButtonVisible(false);
        setAllLabelBoxVisible(false);
        setCurveVisible(false);
        con=new DBConnection().getDBConnection();
        addCboBusNumber();
    }
    
    public Function_SearchBusRoute(User user) {
    	
    	initComponents();
        
        setButtonVisible(false);
        setAllLabelBoxVisible(false);
        setCurveVisible(false);
        con=new DBConnection().getDBConnection();
        addCboBusNumber();    	
	    		    
    	this.user.setUserName(user.getUserName());
    	this.user.setType(user.getType());                        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        lblBus1Route = new javax.swing.JLabel();
        lblBus1 = new javax.swing.JLabel();
        lblBus2Route = new javax.swing.JLabel();
        lblBus2 = new javax.swing.JLabel();
        lblBus3Route = new javax.swing.JLabel();
        lblBus3 = new javax.swing.JLabel();
        lblBus4Route = new javax.swing.JLabel();
        lblBus4 = new javax.swing.JLabel();
        lblBus5 = new javax.swing.JLabel();
        lblBus5Route = new javax.swing.JLabel();
        lblBus6 = new javax.swing.JLabel();
        lblBus6Route = new javax.swing.JLabel();
        lblBus7Route = new javax.swing.JLabel();
        lblBus7 = new javax.swing.JLabel();
        lblBus8 = new javax.swing.JLabel();
        lblBus8Route = new javax.swing.JLabel();
        lblBus16 = new javax.swing.JLabel();
        lblBus16Route = new javax.swing.JLabel();
        lblBus15 = new javax.swing.JLabel();
        lblBus15Route = new javax.swing.JLabel();
        lblBus14 = new javax.swing.JLabel();
        lblBus14Route = new javax.swing.JLabel();
        lblBus13 = new javax.swing.JLabel();
        lblBus13Route = new javax.swing.JLabel();
        lblBus12 = new javax.swing.JLabel();
        lblBus12Route = new javax.swing.JLabel();
        lblBus11 = new javax.swing.JLabel();
        lblBus11Route = new javax.swing.JLabel();
        lblBus10 = new javax.swing.JLabel();
        lblBus10Route = new javax.swing.JLabel();
        lblBus9 = new javax.swing.JLabel();
        lblBus9Route = new javax.swing.JLabel();
        lblBus17 = new javax.swing.JLabel();
        lblBus17Route = new javax.swing.JLabel();
        lblBus18 = new javax.swing.JLabel();
        lblBus18Route = new javax.swing.JLabel();
        lblBus19 = new javax.swing.JLabel();
        lblBus19Route = new javax.swing.JLabel();
        lblBus20 = new javax.swing.JLabel();
        lblBus20Route = new javax.swing.JLabel();
        lblBus21 = new javax.swing.JLabel();
        lblBus21Route = new javax.swing.JLabel();
        lblBus22 = new javax.swing.JLabel();
        lblBus22Route = new javax.swing.JLabel();
        lblBus23 = new javax.swing.JLabel();
        lblBus23Route = new javax.swing.JLabel();
        lblBus24 = new javax.swing.JLabel();
        lblBus24Route = new javax.swing.JLabel();
        lblBus32 = new javax.swing.JLabel();
        lblBus32Route = new javax.swing.JLabel();
        lblBus31 = new javax.swing.JLabel();
        lblBus31Route = new javax.swing.JLabel();
        lblBus30 = new javax.swing.JLabel();
        lblBus30Route = new javax.swing.JLabel();
        lblBus29 = new javax.swing.JLabel();
        lblBus29Route = new javax.swing.JLabel();
        lblBus28 = new javax.swing.JLabel();
        lblBus28Route = new javax.swing.JLabel();
        lblBus27 = new javax.swing.JLabel();
        lblBus27Route = new javax.swing.JLabel();
        lblBus26 = new javax.swing.JLabel();
        lblBus26Route = new javax.swing.JLabel();
        lblBus25 = new javax.swing.JLabel();
        lblBus25Route = new javax.swing.JLabel();
        lblBus33 = new javax.swing.JLabel();
        lblBus33Route = new javax.swing.JLabel();
        lblBus34 = new javax.swing.JLabel();
        lblBus34Route = new javax.swing.JLabel();
        lblBus35 = new javax.swing.JLabel();
        lblBus35Route = new javax.swing.JLabel();
        lblBus36 = new javax.swing.JLabel();
        lblBus36Route = new javax.swing.JLabel();
        lblBus37 = new javax.swing.JLabel();
        lblBus37Route = new javax.swing.JLabel();
        lblBus38 = new javax.swing.JLabel();
        lblBus38Route = new javax.swing.JLabel();
        lblBus39 = new javax.swing.JLabel();
        lblBus39Route = new javax.swing.JLabel();
        lblBus40 = new javax.swing.JLabel();
        lblBus40Route = new javax.swing.JLabel();
        lblBus48Route = new javax.swing.JLabel();
        lblBus48 = new javax.swing.JLabel();
        lblBus47 = new javax.swing.JLabel();
        lblBus47Route = new javax.swing.JLabel();
        lblBus46 = new javax.swing.JLabel();
        lblBus46Route = new javax.swing.JLabel();
        lblBus45 = new javax.swing.JLabel();
        lblBus45Route = new javax.swing.JLabel();
        lblBus44 = new javax.swing.JLabel();
        lblBus44Route = new javax.swing.JLabel();
        lblBus43 = new javax.swing.JLabel();
        lblBus43Route = new javax.swing.JLabel();
        lblBus42 = new javax.swing.JLabel();
        lblBus42Route = new javax.swing.JLabel();
        lblBus41 = new javax.swing.JLabel();
        lblBus41Route = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        cboBusNo = new javax.swing.JComboBox<>();
        lblRight1 = new javax.swing.JLabel();
        lblRight2 = new javax.swing.JLabel();
        lblLeft1 = new javax.swing.JLabel();
        lblLeft2 = new javax.swing.JLabel();
        lblRight3 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bus Search");

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setMnemonic('S');
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblBus1Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N
        lblBus1Route.setDisabledIcon(null);

        lblBus1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus1.setForeground(new java.awt.Color(102, 102, 255));
        lblBus1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus1.setText("- Empty -");

        lblBus2Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus2.setForeground(new java.awt.Color(102, 102, 255));
        lblBus2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus2.setText("- Empty -");

        lblBus3Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus3.setForeground(new java.awt.Color(102, 102, 255));
        lblBus3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus3.setText("- Empty -");

        lblBus4Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus4.setForeground(new java.awt.Color(102, 102, 255));
        lblBus4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus4.setText("- Empty -");

        lblBus5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus5.setForeground(new java.awt.Color(102, 102, 255));
        lblBus5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus5.setText("- Empty -");

        lblBus5Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus6.setForeground(new java.awt.Color(102, 102, 255));
        lblBus6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus6.setText("- Empty -");

        lblBus6Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus7Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus7.setForeground(new java.awt.Color(102, 102, 255));
        lblBus7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus7.setText("- Empty -");

        lblBus8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus8.setForeground(new java.awt.Color(102, 102, 255));
        lblBus8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus8.setText("- Empty -");

        lblBus8Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus16.setForeground(new java.awt.Color(102, 102, 255));
        lblBus16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus16.setText("- Empty -");

        lblBus16Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus15.setForeground(new java.awt.Color(102, 102, 255));
        lblBus15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus15.setText("- Empty -");

        lblBus15Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus14.setForeground(new java.awt.Color(102, 102, 255));
        lblBus14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus14.setText("- Empty -");

        lblBus14Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus13.setForeground(new java.awt.Color(102, 102, 255));
        lblBus13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus13.setText("- Empty -");

        lblBus13Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus12.setForeground(new java.awt.Color(102, 102, 255));
        lblBus12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus12.setText("- Empty -");

        lblBus12Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus11.setForeground(new java.awt.Color(102, 102, 255));
        lblBus11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus11.setText("- Empty -");

        lblBus11Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus10.setForeground(new java.awt.Color(102, 102, 255));
        lblBus10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus10.setText("- Empty -");

        lblBus10Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus9.setForeground(new java.awt.Color(102, 102, 255));
        lblBus9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus9.setText("- Empty -");

        lblBus9Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus17.setForeground(new java.awt.Color(102, 102, 255));
        lblBus17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus17.setText("- Empty -");

        lblBus17Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus18.setForeground(new java.awt.Color(102, 102, 255));
        lblBus18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus18.setText("- Empty -");

        lblBus18Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus19.setForeground(new java.awt.Color(102, 102, 255));
        lblBus19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus19.setText("- Empty -");

        lblBus19Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus20.setForeground(new java.awt.Color(102, 102, 255));
        lblBus20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus20.setText("- Empty -");

        lblBus20Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus21.setForeground(new java.awt.Color(102, 102, 255));
        lblBus21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus21.setText("- Empty -");

        lblBus21Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus22.setForeground(new java.awt.Color(102, 102, 255));
        lblBus22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus22.setText("- Empty -");

        lblBus22Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus23.setForeground(new java.awt.Color(102, 102, 255));
        lblBus23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus23.setText("- Empty -");

        lblBus23Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus24.setForeground(new java.awt.Color(102, 102, 255));
        lblBus24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus24.setText("- Empty -");

        lblBus24Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus32.setForeground(new java.awt.Color(102, 102, 255));
        lblBus32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus32.setText("- Empty -");

        lblBus32Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus31.setForeground(new java.awt.Color(102, 102, 255));
        lblBus31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus31.setText("- Empty -");

        lblBus31Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus30.setForeground(new java.awt.Color(102, 102, 255));
        lblBus30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus30.setText("- Empty -");

        lblBus30Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus29.setForeground(new java.awt.Color(102, 102, 255));
        lblBus29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus29.setText("- Empty -");

        lblBus29Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus28.setForeground(new java.awt.Color(102, 102, 255));
        lblBus28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus28.setText("- Empty -");

        lblBus28Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus27.setForeground(new java.awt.Color(102, 102, 255));
        lblBus27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus27.setText("- Empty -");

        lblBus27Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus26.setForeground(new java.awt.Color(102, 102, 255));
        lblBus26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus26.setText("- Empty -");

        lblBus26Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus25.setForeground(new java.awt.Color(102, 102, 255));
        lblBus25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus25.setText("- Empty -");

        lblBus25Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus33.setForeground(new java.awt.Color(102, 102, 255));
        lblBus33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus33.setText("- Empty -");

        lblBus33Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus34.setForeground(new java.awt.Color(102, 102, 255));
        lblBus34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus34.setText("- Empty -");

        lblBus34Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus35.setForeground(new java.awt.Color(102, 102, 255));
        lblBus35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus35.setText("- Empty -");

        lblBus35Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus36.setForeground(new java.awt.Color(102, 102, 255));
        lblBus36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus36.setText("- Empty -");

        lblBus36Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus37.setForeground(new java.awt.Color(102, 102, 255));
        lblBus37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus37.setText("- Empty -");

        lblBus37Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus38.setForeground(new java.awt.Color(102, 102, 255));
        lblBus38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus38.setText("- Empty -");

        lblBus38Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus39.setForeground(new java.awt.Color(102, 102, 255));
        lblBus39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus39.setText("- Empty -");

        lblBus39Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus40.setForeground(new java.awt.Color(102, 102, 255));
        lblBus40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBus40.setText("- Empty -");

        lblBus40Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route.png"))); // NOI18N

        lblBus48Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus48.setForeground(new java.awt.Color(102, 102, 255));
        lblBus48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus48.setText("- Empty -");

        lblBus47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus47.setForeground(new java.awt.Color(102, 102, 255));
        lblBus47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus47.setText("- Empty -");

        lblBus47Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus46.setForeground(new java.awt.Color(102, 102, 255));
        lblBus46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus46.setText("- Empty -");

        lblBus46Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus45.setForeground(new java.awt.Color(102, 102, 255));
        lblBus45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus45.setText("- Empty -");

        lblBus45Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus44.setForeground(new java.awt.Color(102, 102, 255));
        lblBus44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus44.setText("- Empty -");

        lblBus44Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus43.setForeground(new java.awt.Color(102, 102, 255));
        lblBus43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus43.setText("- Empty -");

        lblBus43Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus42.setForeground(new java.awt.Color(102, 102, 255));
        lblBus42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus42.setText("- Empty -");

        lblBus42Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        lblBus41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBus41.setForeground(new java.awt.Color(102, 102, 255));
        lblBus41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBus41.setText("- Empty -");

        lblBus41Route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_left.png"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(153, 255, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Bus Route Search");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Choose Bus Number :");

        btnPrevious.setBackground(new java.awt.Color(153, 153, 255));
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setMnemonic('P');
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(153, 153, 255));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setMnemonic('N');
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        cboBusNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cboBusNo.setForeground(new java.awt.Color(51, 102, 255));
        cboBusNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----SELECT-----" }));
        cboBusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBusNoActionPerformed(evt);
            }
        });
        cboBusNo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboBusNoPropertyChange(evt);
            }
        });

        lblRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_rightCurve.png"))); // NOI18N

        lblRight2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_rightCurve.png"))); // NOI18N

        lblLeft1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_leftCurve.png"))); // NOI18N

        lblLeft2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_leftCurve.png"))); // NOI18N

        lblRight3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ybsDirectory/route_rightCurve.png"))); // NOI18N

        lblError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblLeft2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLeft1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus17Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus18Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus19Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus16Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus15Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus14Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus32Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus32, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus31Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus33Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus34Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus34, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus48Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus48, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus47Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus47, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus30Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus35Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus46Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus46, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus20Route)
                                    .addComponent(lblBus20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus21Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus22Route)
                                    .addComponent(lblBus22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus23Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus24Route)
                                    .addComponent(lblBus24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus13Route)
                                    .addComponent(lblBus13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus12Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus11Route)
                                    .addComponent(lblBus11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus10Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus9Route)
                                    .addComponent(lblBus9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRight1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBus29Route)
                                    .addComponent(lblBus29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus36Route)
                                    .addComponent(lblBus36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus45Route)
                                    .addComponent(lblBus45, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus28Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus37Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus44Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus44, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBus27Route)
                                    .addComponent(lblBus27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus38Route)
                                    .addComponent(lblBus38, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus43Route)
                                    .addComponent(lblBus43, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus26Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus39Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus39, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBus42Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBus42, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBus25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus40Route)
                                    .addComponent(lblBus40, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBus25Route)
                                    .addComponent(lblBus41Route)
                                    .addComponent(lblBus41, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRight2)
                                    .addComponent(lblRight3)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus1Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus2Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus3Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBus3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblBus4Route)
                                            .addComponent(lblBus4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBus5Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBus5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBus6Route)
                            .addComponent(lblBus6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBus7Route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBus7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBus8Route)
                            .addComponent(lblBus8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cboBusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cboBusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus7Route))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus6Route))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus5Route))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus4Route)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus3Route))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus2Route))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus1Route))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus14Route))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus15Route))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus16Route))))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus19Route))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus18Route))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblBus17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBus17Route))))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus30Route)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus35Route)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus46Route))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus31Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus32Route)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus34Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus33Route)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus47)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus47Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus48Route))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRight1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus9Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus10Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus11Route))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblBus12)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblBus12Route))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblBus13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblBus13Route))))))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus23Route)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblBus26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus26Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus25Route)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(lblBus40)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBus40Route))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(lblBus39)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBus39Route)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(lblBus41)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBus41Route))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(lblBus42)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBus42Route))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(lblRight3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus22Route))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblBus21)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblBus21Route))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(lblBus20)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblBus20Route))))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus29Route)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus36Route)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus45)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus45Route))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblBus28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus28Route)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus37)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus37Route)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBus44Route))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(lblBus27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus27Route)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus38Route)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBus43Route))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblBus24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRight2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBus24Route)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblLeft1)
                                .addGap(48, 48, 48)
                                .addComponent(lblLeft2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBus8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBus8Route)
                        .addGap(46, 46, 46))))
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
                .addContainerGap()
                .addComponent(lblBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        new MainMenu(user).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void cboBusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBusNoActionPerformed
    	busStop.clear();
    	Searchcondition=true;
    }//GEN-LAST:event_cboBusNoActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    	    	
    	boolean currentcondition=Searchcondition;
    	clear();
    	Searchcondition=currentcondition;
    	
    	lblError.setText("");
    	condition=false;    	
    	
    	if(cboBusNo.getSelectedIndex()>0) {    		
    		
        	ArrayList busStopID=new ArrayList();        	
        	
        	try {	
        		con=new DBConnection().getDBConnection();
    			ste=con.createStatement();
    			    			
    			rs=ste.executeQuery("SELECT BusStopID FROM busdetail WHERE BusLineNo=" + cboBusNo.getSelectedItem().toString().trim() + " ORDER BY BusDetailID");
    			
    			if(!rs.next()) {
    				throw new BlankException();    				
    			}    			
				rs.beforeFirst();
    			while(rs.next()) {
    				busStopID.add(rs.getString(1).trim());
    			}    			
    			
    			for(int a=0; a<busStopID.size(); a++) {
	    			rs=ste.executeQuery("SELECT BusStopName FROM busstop WHERE BusStopID='" + busStopID.get(a) + "'");
	    			
	    			if(rs.next()) {
	    				busStop.add(rs.getString(1));
	    			}
    			}
    			
    			if(Searchcondition) {    				
    				addBusStop();
    				Searchcondition=false;    				
    			}    			
    		}catch(BlankException e) {    			    			
    			clear();	
    		}catch(Exception e) {
    			System.out.println(e);	    			
    		}
        	ConnClose();
        }
        else if(cboBusNo.getSelectedIndex()==0) {
        	clear();
        	Searchcondition=true;
        	lblError.setText("*Please Choose Bus Number");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
    	
    	Searchcondition=true;
    	
    	if(firstBusStop>0) {
    		firstBusStop-=48;
        	lastBusStop-=48;
        	value-=48;
        	addBusStop();        	        	
    	}
    	if(firstBusStop==0) {
    		btnPrevious.setEnabled(false);
    	}
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void cboBusNoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboBusNoPropertyChange
        Searchcondition=true;
    }//GEN-LAST:event_cboBusNoPropertyChange

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	
    	Searchcondition=true;
    	
    	setEmpty();
    	setAllLabelBoxVisible(false);
    	setCurveVisible(false);
    	firstBusStop+=48;
    	lastBusStop+=48;
    	value+=48;
    	addBusStop();
    	btnPrevious.setEnabled(true);    	
    }                                       

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
            java.util.logging.Logger.getLogger(Function_SearchBusRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Function_SearchBusRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Function_SearchBusRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Function_SearchBusRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function_SearchBusRoute().setVisible(true);
            }
        });
    }
    
    //Function for enable label-busStop
    private void setAllLabelBoxVisible(boolean condition) {
    	lblBus1.setEnabled(condition); lblBus1Route.setEnabled(condition); lblBus2.setEnabled(condition); lblBus2Route.setEnabled(condition); lblBus3.setEnabled(condition); lblBus3Route.setEnabled(condition); lblBus4.setEnabled(condition); lblBus4Route.setEnabled(condition);
    	lblBus5.setEnabled(condition); lblBus5Route.setEnabled(condition); lblBus6.setEnabled(condition); lblBus6Route.setEnabled(condition); lblBus7.setEnabled(condition); lblBus7Route.setEnabled(condition); lblBus8.setEnabled(condition); lblBus8Route.setEnabled(condition);
    	lblBus9.setEnabled(condition); lblBus9Route.setEnabled(condition); lblBus10.setEnabled(condition); lblBus10Route.setEnabled(condition); lblBus11.setEnabled(condition); lblBus11Route.setEnabled(condition); lblBus12.setEnabled(condition); lblBus12Route.setEnabled(condition);
    	lblBus13.setEnabled(condition); lblBus13Route.setEnabled(condition); lblBus14.setEnabled(condition); lblBus14Route.setEnabled(condition); lblBus15.setEnabled(condition); lblBus15Route.setEnabled(condition); lblBus16.setEnabled(condition); lblBus16Route.setEnabled(condition);
    	lblBus17.setEnabled(condition); lblBus17Route.setEnabled(condition); lblBus18.setEnabled(condition); lblBus18Route.setEnabled(condition); lblBus19.setEnabled(condition); lblBus19Route.setEnabled(condition); lblBus20.setEnabled(condition); lblBus20Route.setEnabled(condition);
    	lblBus21.setEnabled(condition); lblBus21Route.setEnabled(condition); lblBus22.setEnabled(condition); lblBus22Route.setEnabled(condition); lblBus23.setEnabled(condition); lblBus23Route.setEnabled(condition); lblBus24.setEnabled(condition); lblBus24Route.setEnabled(condition);
    	lblBus25.setEnabled(condition); lblBus25Route.setEnabled(condition); lblBus26.setEnabled(condition); lblBus26Route.setEnabled(condition); lblBus27.setEnabled(condition); lblBus27Route.setEnabled(condition); lblBus28.setEnabled(condition); lblBus28Route.setEnabled(condition);
    	lblBus29.setEnabled(condition); lblBus29Route.setEnabled(condition); lblBus30.setEnabled(condition); lblBus30Route.setEnabled(condition); lblBus31.setEnabled(condition); lblBus31Route.setEnabled(condition); lblBus32.setEnabled(condition); lblBus32Route.setEnabled(condition);
    	lblBus33.setEnabled(condition); lblBus33Route.setEnabled(condition); lblBus34.setEnabled(condition); lblBus34Route.setEnabled(condition); lblBus35.setEnabled(condition); lblBus35Route.setEnabled(condition); lblBus36.setEnabled(condition); lblBus36Route.setEnabled(condition);
    	lblBus37.setEnabled(condition); lblBus37Route.setEnabled(condition); lblBus38.setEnabled(condition); lblBus38Route.setEnabled(condition); lblBus39.setEnabled(condition); lblBus39Route.setEnabled(condition); lblBus40.setEnabled(condition); lblBus40Route.setEnabled(condition);
    	lblBus41.setEnabled(condition); lblBus41Route.setEnabled(condition); lblBus42.setEnabled(condition); lblBus42Route.setEnabled(condition); lblBus43.setEnabled(condition); lblBus43Route.setEnabled(condition); lblBus44.setEnabled(condition); lblBus44Route.setEnabled(condition);
    	lblBus45.setEnabled(condition); lblBus45Route.setEnabled(condition); lblBus46.setEnabled(condition); lblBus46Route.setEnabled(condition); lblBus47.setEnabled(condition); lblBus47Route.setEnabled(condition); lblBus48.setEnabled(condition); lblBus48Route.setEnabled(condition);
    }
    
    //Function for enable button
    private void setButtonVisible(boolean condition) {
    	btnNext.setEnabled(condition);
    	btnPrevious.setEnabled(condition);
    }
    
    //Function for enable label-curve
    private void setCurveVisible(boolean condition) {
    	lblRight1.setEnabled(condition); lblRight2.setEnabled(condition); lblRight3.setEnabled(condition);
    	lblLeft1.setEnabled(condition); lblLeft2.setEnabled(condition);
    }
    
    //Function - Adding Bus Route
    private void addCboBusNumber() {
    	cboBusNo.removeAllItems();
    	cboBusNo.addItem("----SELECT----");
    	try {
    		con=new DBConnection().getDBConnection();
    		ste=con.createStatement();
    		String query="SELECT BusLineNo FROM busline ORDER BY BusLineNo DESC";
    		rs=ste.executeQuery(query);
    		
    		while(rs.next()) {
    			cboBusNo.addItem(rs.getString(1));
    		}
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	ConnClose();
    }
    //Function - Adding Bus Route  - End
    
    //Function addBusStop
    private void addBusStop() {
    	    	    	
    	condition=false;
    	btnNext.setEnabled(false);
    	
    	for(int a=firstBusStop; a<busStop.size() && a<=lastBusStop; a++) {
    		switch(a-value) {
    			case 0: setBusStop(lblBus1, busStop.get(a).toString().trim()); lblBus1Route.setEnabled(true); break;
    			case 1: setBusStop(lblBus2, busStop.get(a).toString().trim()); lblBus2Route.setEnabled(true); break;
    			case 2: setBusStop(lblBus3, busStop.get(a).toString().trim()); lblBus3Route.setEnabled(true); break;
    			case 3: setBusStop(lblBus4, busStop.get(a).toString().trim()); lblBus4Route.setEnabled(true); break;
    			case 4: setBusStop(lblBus5, busStop.get(a).toString().trim()); lblBus5Route.setEnabled(true); break;
    			case 5: setBusStop(lblBus6, busStop.get(a).toString().trim()); lblBus6Route.setEnabled(true); break;
    			case 6: setBusStop(lblBus7, busStop.get(a).toString().trim()); lblBus7Route.setEnabled(true); break;
    			case 7: setBusStop(lblBus8, busStop.get(a).toString().trim()); lblBus8Route.setEnabled(true); break;
    			case 8: setBusStop(lblBus9, busStop.get(a).toString().trim()); lblBus9Route.setEnabled(true); break;
    			case 9: setBusStop(lblBus10, busStop.get(a).toString().trim()); lblBus10Route.setEnabled(true); break;
    			case 10: setBusStop(lblBus11, busStop.get(a).toString().trim()); lblBus11Route.setEnabled(true); break;
    			case 11: setBusStop(lblBus12, busStop.get(a).toString().trim()); lblBus12Route.setEnabled(true); break;
    			case 12: setBusStop(lblBus13, busStop.get(a).toString().trim()); lblBus13Route.setEnabled(true); break;
    			case 13: setBusStop(lblBus14, busStop.get(a).toString().trim()); lblBus14Route.setEnabled(true); break;
    			case 14: setBusStop(lblBus15, busStop.get(a).toString().trim()); lblBus15Route.setEnabled(true); break;
    			case 15: setBusStop(lblBus16, busStop.get(a).toString().trim()); lblBus16Route.setEnabled(true); break;
    			case 16: setBusStop(lblBus17, busStop.get(a).toString().trim()); lblBus17Route.setEnabled(true); break;
    			case 17: setBusStop(lblBus18, busStop.get(a).toString().trim()); lblBus18Route.setEnabled(true); break;
    			case 18: setBusStop(lblBus19, busStop.get(a).toString().trim()); lblBus19Route.setEnabled(true); break;
    			case 19: setBusStop(lblBus20, busStop.get(a).toString().trim()); lblBus20Route.setEnabled(true); break;
    			case 20: setBusStop(lblBus21, busStop.get(a).toString().trim()); lblBus21Route.setEnabled(true); break;
    			case 21: setBusStop(lblBus22, busStop.get(a).toString().trim()); lblBus22Route.setEnabled(true); break;
    			case 22: setBusStop(lblBus23, busStop.get(a).toString().trim()); lblBus23Route.setEnabled(true); break;
    			case 23: setBusStop(lblBus24, busStop.get(a).toString().trim()); lblBus24Route.setEnabled(true); break;
    			case 24: setBusStop(lblBus25, busStop.get(a).toString().trim()); lblBus25Route.setEnabled(true); break;
    			case 25: setBusStop(lblBus26, busStop.get(a).toString().trim()); lblBus26Route.setEnabled(true); break;
    			case 26: setBusStop(lblBus27, busStop.get(a).toString().trim()); lblBus27Route.setEnabled(true); break;
    			case 27: setBusStop(lblBus28, busStop.get(a).toString().trim()); lblBus28Route.setEnabled(true); break;
    			case 28: setBusStop(lblBus29, busStop.get(a).toString().trim()); lblBus29Route.setEnabled(true); break;
    			case 29: setBusStop(lblBus30, busStop.get(a).toString().trim()); lblBus30Route.setEnabled(true); break;
    			case 30: setBusStop(lblBus31, busStop.get(a).toString().trim()); lblBus31Route.setEnabled(true); break;
    			case 31: setBusStop(lblBus32, busStop.get(a).toString().trim()); lblBus32Route.setEnabled(true); break;
    			case 32: setBusStop(lblBus33, busStop.get(a).toString().trim()); lblBus33Route.setEnabled(true); break;
    			case 33: setBusStop(lblBus34, busStop.get(a).toString().trim()); lblBus34Route.setEnabled(true); break;
    			case 34: setBusStop(lblBus35, busStop.get(a).toString().trim()); lblBus35Route.setEnabled(true); break;
    			case 35: setBusStop(lblBus36, busStop.get(a).toString().trim()); lblBus36Route.setEnabled(true); break;
    			case 36: setBusStop(lblBus37, busStop.get(a).toString().trim()); lblBus37Route.setEnabled(true); break;
    			case 37: setBusStop(lblBus38, busStop.get(a).toString().trim()); lblBus38Route.setEnabled(true); break;
    			case 38: setBusStop(lblBus39, busStop.get(a).toString().trim()); lblBus39Route.setEnabled(true); break;
    			case 39: setBusStop(lblBus40, busStop.get(a).toString().trim()); lblBus40Route.setEnabled(true); break;
    			case 40: setBusStop(lblBus41, busStop.get(a).toString().trim()); lblBus41Route.setEnabled(true); break;
    			case 41: setBusStop(lblBus42, busStop.get(a).toString().trim()); lblBus42Route.setEnabled(true); break;
    			case 42: setBusStop(lblBus43, busStop.get(a).toString().trim()); lblBus43Route.setEnabled(true); break;
    			case 43: setBusStop(lblBus44, busStop.get(a).toString().trim()); lblBus44Route.setEnabled(true); break;
    			case 44: setBusStop(lblBus45, busStop.get(a).toString().trim()); lblBus45Route.setEnabled(true); break;
    			case 45: setBusStop(lblBus46, busStop.get(a).toString().trim()); lblBus46Route.setEnabled(true); break;
    			case 46: setBusStop(lblBus47, busStop.get(a).toString().trim()); lblBus47Route.setEnabled(true); break;
    			case 47: setBusStop(lblBus48, busStop.get(a).toString().trim()); lblBus48Route.setEnabled(true); break;
    			case 48: condition=true; break;
    		}
    		if(a-value==8) {
    			lblRight1.setEnabled(true);
    		}
    		if(a-value==16) {
    			lblLeft1.setEnabled(true);
    		}
    		if(a-value==24) {
    			lblRight2.setEnabled(true);
    		}
    		if(a-value==32) {
    			lblLeft2.setEnabled(true);
    		}
    		if(a-value==40) {
    			lblRight3.setEnabled(true);
    		}
    		
    		if(condition) {
    			btnNext.setEnabled(true);
    		}
    	}    	
    }
    
    //set BusStop in label box
    private void setBusStop(JLabel label, String data) {
    	label.setEnabled(true);
    	label.setText(data);
    }
    
    //Function clear
    private void clear() {
    	setAllLabelBoxVisible(false);
    	setButtonVisible(false);
    	setCurveVisible(false);
    	setEmpty();
    	lblError.setText("");
    	firstBusStop=0;
    	lastBusStop=48;
    	value=0;
    	condition=false;
    	Searchcondition=true;
    	busStop.clear();
    }
    
    //Function set -Empty- on all label box
    private void setEmpty() {
    	lblBus1.setText("- Empty -"); lblBus2.setText("- Empty -"); lblBus3.setText("- Empty -"); lblBus4.setText("- Empty -"); lblBus5.setText("- Empty -"); lblBus6.setText("- Empty -");
    	lblBus7.setText("- Empty -"); lblBus8.setText("- Empty -"); lblBus9.setText("- Empty -"); lblBus10.setText("- Empty -"); lblBus11.setText("- Empty -"); lblBus12.setText("- Empty -");
    	lblBus13.setText("- Empty -"); lblBus14.setText("- Empty -"); lblBus15.setText("- Empty -"); lblBus16.setText("- Empty -"); lblBus17.setText("- Empty -"); lblBus18.setText("- Empty -");
    	lblBus19.setText("- Empty -"); lblBus20.setText("- Empty -"); lblBus21.setText("- Empty -"); lblBus22.setText("- Empty -"); lblBus23.setText("- Empty -"); lblBus24.setText("- Empty -");
    	lblBus25.setText("- Empty -"); lblBus26.setText("- Empty -"); lblBus27.setText("- Empty -"); lblBus28.setText("- Empty -"); lblBus29.setText("- Empty -"); lblBus30.setText("- Empty -");
    	lblBus31.setText("- Empty -"); lblBus32.setText("- Empty -"); lblBus33.setText("- Empty -"); lblBus34.setText("- Empty -"); lblBus35.setText("- Empty -"); lblBus36.setText("- Empty -");
    	lblBus37.setText("- Empty -"); lblBus38.setText("- Empty -"); lblBus39.setText("- Empty -"); lblBus40.setText("- Empty -"); lblBus41.setText("- Empty -"); lblBus42.setText("- Empty -");
    	lblBus43.setText("- Empty -"); lblBus44.setText("- Empty -"); lblBus45.setText("- Empty -"); lblBus46.setText("- Empty -"); lblBus47.setText("- Empty -"); lblBus48.setText("- Empty -");
    }
    
    //Close Connection
    private void ConnClose() {
    	try {
    		con.close();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboBusNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBus1;
    private javax.swing.JLabel lblBus10;
    private javax.swing.JLabel lblBus10Route;
    private javax.swing.JLabel lblBus11;
    private javax.swing.JLabel lblBus11Route;
    private javax.swing.JLabel lblBus12;
    private javax.swing.JLabel lblBus12Route;
    private javax.swing.JLabel lblBus13;
    private javax.swing.JLabel lblBus13Route;
    private javax.swing.JLabel lblBus14;
    private javax.swing.JLabel lblBus14Route;
    private javax.swing.JLabel lblBus15;
    private javax.swing.JLabel lblBus15Route;
    private javax.swing.JLabel lblBus16;
    private javax.swing.JLabel lblBus16Route;
    private javax.swing.JLabel lblBus17;
    private javax.swing.JLabel lblBus17Route;
    private javax.swing.JLabel lblBus18;
    private javax.swing.JLabel lblBus18Route;
    private javax.swing.JLabel lblBus19;
    private javax.swing.JLabel lblBus19Route;
    private javax.swing.JLabel lblBus1Route;
    private javax.swing.JLabel lblBus2;
    private javax.swing.JLabel lblBus20;
    private javax.swing.JLabel lblBus20Route;
    private javax.swing.JLabel lblBus21;
    private javax.swing.JLabel lblBus21Route;
    private javax.swing.JLabel lblBus22;
    private javax.swing.JLabel lblBus22Route;
    private javax.swing.JLabel lblBus23;
    private javax.swing.JLabel lblBus23Route;
    private javax.swing.JLabel lblBus24;
    private javax.swing.JLabel lblBus24Route;
    private javax.swing.JLabel lblBus25;
    private javax.swing.JLabel lblBus25Route;
    private javax.swing.JLabel lblBus26;
    private javax.swing.JLabel lblBus26Route;
    private javax.swing.JLabel lblBus27;
    private javax.swing.JLabel lblBus27Route;
    private javax.swing.JLabel lblBus28;
    private javax.swing.JLabel lblBus28Route;
    private javax.swing.JLabel lblBus29;
    private javax.swing.JLabel lblBus29Route;
    private javax.swing.JLabel lblBus2Route;
    private javax.swing.JLabel lblBus3;
    private javax.swing.JLabel lblBus30;
    private javax.swing.JLabel lblBus30Route;
    private javax.swing.JLabel lblBus31;
    private javax.swing.JLabel lblBus31Route;
    private javax.swing.JLabel lblBus32;
    private javax.swing.JLabel lblBus32Route;
    private javax.swing.JLabel lblBus33;
    private javax.swing.JLabel lblBus33Route;
    private javax.swing.JLabel lblBus34;
    private javax.swing.JLabel lblBus34Route;
    private javax.swing.JLabel lblBus35;
    private javax.swing.JLabel lblBus35Route;
    private javax.swing.JLabel lblBus36;
    private javax.swing.JLabel lblBus36Route;
    private javax.swing.JLabel lblBus37;
    private javax.swing.JLabel lblBus37Route;
    private javax.swing.JLabel lblBus38;
    private javax.swing.JLabel lblBus38Route;
    private javax.swing.JLabel lblBus39;
    private javax.swing.JLabel lblBus39Route;
    private javax.swing.JLabel lblBus3Route;
    private javax.swing.JLabel lblBus4;
    private javax.swing.JLabel lblBus40;
    private javax.swing.JLabel lblBus40Route;
    private javax.swing.JLabel lblBus41;
    private javax.swing.JLabel lblBus41Route;
    private javax.swing.JLabel lblBus42;
    private javax.swing.JLabel lblBus42Route;
    private javax.swing.JLabel lblBus43;
    private javax.swing.JLabel lblBus43Route;
    private javax.swing.JLabel lblBus44;
    private javax.swing.JLabel lblBus44Route;
    private javax.swing.JLabel lblBus45;
    private javax.swing.JLabel lblBus45Route;
    private javax.swing.JLabel lblBus46;
    private javax.swing.JLabel lblBus46Route;
    private javax.swing.JLabel lblBus47;
    private javax.swing.JLabel lblBus47Route;
    private javax.swing.JLabel lblBus48;
    private javax.swing.JLabel lblBus48Route;
    private javax.swing.JLabel lblBus4Route;
    private javax.swing.JLabel lblBus5;
    private javax.swing.JLabel lblBus5Route;
    private javax.swing.JLabel lblBus6;
    private javax.swing.JLabel lblBus6Route;
    private javax.swing.JLabel lblBus7;
    private javax.swing.JLabel lblBus7Route;
    private javax.swing.JLabel lblBus8;
    private javax.swing.JLabel lblBus8Route;
    private javax.swing.JLabel lblBus9;
    private javax.swing.JLabel lblBus9Route;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLeft1;
    private javax.swing.JLabel lblLeft2;
    private javax.swing.JLabel lblRight1;
    private javax.swing.JLabel lblRight2;
    private javax.swing.JLabel lblRight3;
    // End of variables declaration//GEN-END:variables
}
