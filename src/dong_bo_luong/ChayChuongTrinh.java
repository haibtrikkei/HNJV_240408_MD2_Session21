package dong_bo_luong;

public class ChayChuongTrinh {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        LuongSinhSo ss = new LuongSinhSo(data);
        LuongKiemTraSo kt = new LuongKiemTraSo(data);

        kt.start();
        ss.start();
    }
}
