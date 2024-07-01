package demo_da_luong;

public class TestDaLuong {
    public static void main(String[] args) {
        TaoDaLuong luong1, luong2;

        luong1 = new TaoDaLuong("Luong 1");
        luong2 = new TaoDaLuong("Luong 2");

        luong1.start();
        luong2.start();
    }
}
