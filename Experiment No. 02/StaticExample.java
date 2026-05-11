class StaticDemo {
    static int num;

    static {
        num = 50;
        System.out.println("Static Block Executed");
    }

    static void show() {
        System.out.println("Value of num = " + num);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        StaticDemo.show();
    }
}
