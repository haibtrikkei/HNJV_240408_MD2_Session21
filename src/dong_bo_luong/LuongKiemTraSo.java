package dong_bo_luong;

public class LuongKiemTraSo extends Thread{
    private SharedData data;

    public LuongKiemTraSo(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(true){
            synchronized (data){
                if(data.getControl()==2){
                    int n = data.getNumber();
                    if(n%2==0){
                        System.out.println(n+" la so chan");
                    }else{
                        System.out.println(n+" la so le");
                    }

                    data.setControl(1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    data.notifyAll();
                }else{
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
