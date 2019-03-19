package delayqueue;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public static void  currentTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间：" + sdf.format(d));
    }
}

