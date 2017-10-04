
package br.com.bandtec.datahora.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class IdadeApp {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner leitor = new Scanner(System.in);
        Date now = new Date();
        System.out.print("Informe a data de fabricação do produto (dd-mm-aaaa): ");
        String dateFab = leitor.next();
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateFab);
        System.out.print("Quantos dias ele vale? ");
        int days = leitor.nextInt();
        Calendar calDays = Calendar.getInstance();
        calDays.setTime(date);
        calDays.add(Calendar.DATE, days);
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(now);
        Long dif = now.getTime() - calDays.getTimeInMillis();
        String dateDays = new SimpleDateFormat("dd/MM/yyyy").format(calDays.getTime());
        if(dif < 0) {
            System.out.println("Este produto vence em "+dateDays);
        }
        else {
            System.out.println("Este produto venceu em "+dateDays);
        }
    }
    
}
