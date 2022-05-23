import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateandTime {
    public static void main(String[] args) {
        Date date= new Date();//current date and time
        System.out.println(date);

        System.out.println(date.getTime());
        
        Date date1=new Date(38003423L);//in this milliseconds
        System.out.println(date1);

        //gives a calendar
        System.out.println(Calendar.getInstance());
        System.out.println(Calendar.getInstance(Locale.US));

        Calendar c=Calendar.getInstance();
        System.out.println("current date is : " + c.getTime());
        //prints the current date and time

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,12);//to set month
        cal.set(Calendar.DAY_OF_MONTH,26);//to set day
        cal.set(Calendar.YEAR,2022);//to set year
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);

    }
}
