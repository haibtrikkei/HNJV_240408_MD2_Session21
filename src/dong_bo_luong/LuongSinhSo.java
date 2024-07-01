package dong_bo_luong;

import java.util.Random;

public class LuongSinhSo extends Thread{
    private SharedData data;

    public LuongSinhSo(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true){
            synchronized (data){
                if(data.getControl()==1){
                    //thuc hien
                    data.setNumber(r.nextInt(100));
                    System.out.println("So vua sinh ra: "+data.getNumber());

                    data.setControl(2);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    data.notifyAll();
                }else{
                    //dung
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
