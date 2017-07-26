package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Classe responsável por formatar e buscar as datas utilizadas no programa
public class Formatar {

    public static String formatarParaMySql(Date date) {
        //Apenas formata a data para ser utilizada pelo MySql
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        return sdf.format(date);
    }

    public static Date[] buscarProximosDias() {
        //Busca no sistema os próximos 4 dias. Utilizado para mostrar na tela Compromissos os dias e as tarefas programadas
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

    public static String formatarParaExibir(Date date) {
        //Apenas formata a data para ser exibida.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(date);
    }


}
