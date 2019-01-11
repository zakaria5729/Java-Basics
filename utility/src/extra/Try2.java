package extra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Try2 {

    public static void main(String[] args) {

//        Try ob = new Try();
//        ob.getData();
        long unix_seconds = 1525294800;
        //convert seconds to milliseconds
        ///Date date = new Date(unix_seconds*1000L); 
        // format of the date
//   SimpleDateFormat jdf = new SimpleDateFormat("hh:mm: a");
//   jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
//   String java_date = jdf.format(date);
//   System.out.println("\n"+java_date+"\n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm a");
        String currentDate = simpleDateFormat.format(new Date());
//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
//        String dayString = sdf.format(currentDate);

        System.out.println(currentDate);
        //System.out.println(dayString);

    }
}
