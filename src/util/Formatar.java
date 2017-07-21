/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class Formatar {

    public static String formatarParaMySql(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        return sdf.format(date);
    }

    public static Date[] buscarProximosDias() {
        Date[] datas = new Date[4];
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        datas[0] = dt;
        for (int i = 1; i <= 3; i++) {
            c.add(Calendar.DATE, 1);
            dt = c.getTime();
            datas[i] = dt;
        }
        return datas;
    }

    public static String formatarParaExibir(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(date);
    }
//    public static String formatarParaJava(String date){
//        
//    }
}
