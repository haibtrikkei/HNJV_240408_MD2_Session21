package demo_da_luong;

public class TaoDaLuong extends Thread{
    private String name;

    public TaoDaLuong(String name) {
        this.name = name;
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

    @Override
    public void run() {
        show();
    }
}
