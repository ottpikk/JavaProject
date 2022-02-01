package BasicPractice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatesAndTime {
    public static void main(String[] args) {

        Calendar now = new GregorianCalendar();
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        System.out.println(now.get(Calendar.MONTH)+1);
        System.out.println(now.get(Calendar.YEAR));
        now.setTimeInMillis(0);
        System.out.println(now.getTimeInMillis());

        now = Calendar.getInstance();
        System.out.println(now.getTimeZone().getDisplayName());

    }
}
