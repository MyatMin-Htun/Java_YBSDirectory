/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ybsDirectory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ICE
 */
public class UpdateDate {
        DateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        public String getDate(){
            return dateformat.format(date);
            
        }
}