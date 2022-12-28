public class Start {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;
        boolean b1 = (d / c + 2) >= b || !(c + b - c / a == 3);
        int x = 5;
        int y = 6;
        boolean f = false;
        boolean t = true;
        boolean b2 = (x * x - y * y / 2 != 12) || !t && f;
        System.out.println(b1);
        System.out.println(b2);
    }
}
