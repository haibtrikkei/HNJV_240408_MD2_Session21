package da_luong_runnable;

public class DaLuong_Runable implements Runnable{
    private String name;

    public DaLuong_Runable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        show();
    }

    public void show(){
        while(true){
            System.out.println("Xu ly dang don luong: "+name);
            try {
                Thread.sleep(1000); //Tam dung 1s (1s = 1000ms)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
