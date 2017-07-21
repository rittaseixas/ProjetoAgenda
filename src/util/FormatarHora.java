/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class FormatarHora {
    
    public static String formatarParaMySql(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:dd");
        return sdf.format(date);
    }
//    public static String formatarParaJava(String date){
//        
//    }
}
