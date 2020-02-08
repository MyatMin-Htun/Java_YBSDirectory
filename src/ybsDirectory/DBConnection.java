package ybsDirectory;

import java.sql.*;
import java.util.*;

public class DBConnection {

	private Connection con=null;
	private String url;
	
	public Connection getDBConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ybsdirectory?user=root&password=root");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	
	public ResultSet SQLSelect(String field, String table) {
		ResultSet rs=null;
		
		try{
			Statement stmt=getDBConnection().createStatement();
			rs=stmt.executeQuery("SELECT " + field + " FROM " + table + " ORDER BY " + field);
		}catch(Exception e) {
			System.out.println(e);
		}
		return rs;
	}
	
	//key for starting with 2 character id 
	public String getPrimaryKey(String field, String table, String prefix) {
		ResultSet rs=SQLSelect(field, table);
		int current;
		
		try {
			ArrayList result=new ArrayList();
			
			while(rs.next()) {
				result.add(rs.getString(field));
			}
			
			if(result.size()>0) {
				current=Integer.parseInt(result.get(result.size()-1).toString().substring(2))+1;
				
				if(current>0 && current<=9) {
					return prefix + "000" + current;
				}
				else if(current>9 && current<=99) {
					return prefix + "00" + current;
				}
				else if(current>99 && current<=999) {
					return prefix + "0" + current;
				}
				else if(current>999 && current<=9999) {
					return prefix + current;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return prefix + "0001";
	}
	
	//key for starting with 3 character id 
	public String getPrimaryKey2(String field, String table, String prefix) {
		ResultSet rs=SQLSelect(field, table);
		int current;
		
		try {
			ArrayList result=new ArrayList();
			
			while(rs.next()) {
				result.add(rs.getString(field));
			}
			
			if(result.size()>0) {
				current=Integer.parseInt(result.get(result.size()-1).toString().substring(3))+1;
				
				if(current>0 && current<=9) {
					return prefix + "000" + current;
				}
				else if(current>9 && current<=99) {
					return prefix + "00" + current;
				}
				else if(current>99 && current<=999) {
					return prefix + "0" + current;
				}
				else if(current>999 && current<=9999) {
					return prefix + current;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return prefix + "0001";
	}

	//key for starting with 1 character id 
	public String getPrimaryKey3(String field, String table, String prefix) {
		ResultSet rs=SQLSelect(field, table);
		int current;
		
		try {
			ArrayList result=new ArrayList();
			
			while(rs.next()) {
				result.add(rs.getString(field));
			}
			
			if(result.size()>0) {
			
				current=Integer.parseInt(result.get(result.size()-1).toString().substring(1))+1;
				
				if(current>0 && current<=9) {
					return prefix + "00000000" + current;
				}
				else if(current>9 && current<=99) {
					return prefix + "0000000" + current;
				}
				else if(current>99 && current<=999) {
					return prefix + "000000" + current;
				}
				else if(current>999 && current<=9999) {
					return prefix + "00000" + current;
				}
				else if(current>9999 && current<=99999) {
					return prefix + "0000" + current;
				}
				else if(current>99999 && current<=999999) {
					return prefix + "000" + current;
				}
				if(current>999999 && current<=9999999) {
					return prefix + "00" + current;
				}
				else if(current>9999999 && current<=99999999) {
					return prefix + "0" + current;
				}								
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return prefix + "000000001";
	}
}
