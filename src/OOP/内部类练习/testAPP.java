package OOP.内部类练习;

public class testAPP {
    public static void main(String[] args) {
        Out outter = new Out();
        outter.out();
        Out.In in = outter.new In();
        in.in();

    }
}
