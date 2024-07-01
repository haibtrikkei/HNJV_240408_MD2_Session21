package demo_da_luong;

public class DonLuong {
    public void show(String name){
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
