package dong_bo_luong;

public class SharedData {
    private int number;
    private int control = 1; //bien dieu khien viec chay cua cac luong

    public SharedData() {
    }

    public SharedData(int number, int control) {
        this.number = number;
        this.control = control;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }
}
