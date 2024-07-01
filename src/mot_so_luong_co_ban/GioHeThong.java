package mot_so_luong_co_ban;

import java.util.Calendar;

public class GioHeThong extends Thread{
    @Override
    public void run() {
        int minute = 1;

        int second = 1;
        while(minute<=2){
            Calendar cl = Calendar.getInstance();
            System.out.println(cl.get(Calendar.HOUR)+" : "+cl.get(Calendar.MINUTE)+" : "+cl.get(Calendar.SECOND));
            try {
                Thread.sleep(1000);
                second++;
                if(second%60==0){
                    minute++;
                    second = 1;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Da het 2 phut, hen gap lai!");
    }
}
