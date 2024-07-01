package da_luong_runnable;

public class Chay_Runnable {
    public static void main(String[] args) {
        DaLuong_Runable luong1,luong2;

        luong1 = new DaLuong_Runable("Luong 1");
        luong2 = new DaLuong_Runable("Luong 2");

//        luong1.show();
//        luong2.show();
        Thread t1 = new Thread(luong1);
        Thread t2 = new Thread(luong2);

        t1.start();
        t2.start();
    }
}
