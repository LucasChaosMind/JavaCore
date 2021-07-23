package javacore.datas;

import java.util.Calendar;
import java.util.Date;

public class Manipulation_of_Date {
    public static void main(String[] args) {
        /**unless system**/
        Date date = new Date();

        Calendar c = Calendar.getInstance();

        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domengo eh o Primeiro Dia da Semana!");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        Date date02 = c.getTime();
        System.out.println(date02);

    }
}
