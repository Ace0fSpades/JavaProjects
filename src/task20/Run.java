package task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
    public static void main(String args[]) throws InterruptedException {
        Date date1 = new Date();
        System.out.println(date1);
        Thread.sleep(5000);
        Date date2 = new Date();
        System.out.println(date2);

        Calendar c = new GregorianCalendar(2019, 2, 12);
        date1 = c.getTime();
        System.out.println(date1);

    }
}
