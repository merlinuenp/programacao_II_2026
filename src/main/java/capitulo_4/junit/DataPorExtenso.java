
package capitulo_4.junit;

import java.util.Calendar;
import java.util.Date;


public class DataPorExtenso {
    
    public String dataPorExtenso(Date dat){
        
        StringBuilder retorno = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dat);
        retorno.append(calendar.get(Calendar.DAY_OF_MONTH));
        retorno.append(" de ");
        int mes = calendar.get(Calendar.MONTH);
        switch(mes){
            case 0 -> retorno.append("janeiro de ");
            case 1 -> retorno.append("fevereiro de ");
            case 2 -> retorno.append("março de ");
            case 3 -> retorno.append("abril de ");
            case 4 -> retorno.append("maio de ");
            case 5 -> retorno.append("junho de ");
            case 6 -> retorno.append("julho de ");
            case 7 -> retorno.append("agosto de ");
            case 8 -> retorno.append("setembro de ");
            case 9 -> retorno.append("outubro de ");
            case 10 -> retorno.append("novembro de ");
            case 11 -> retorno.append("dezembro de ");
        }
        retorno.append(calendar.get(Calendar.YEAR));
        retorno.append(".");
        return retorno.toString();
    }
    
}
