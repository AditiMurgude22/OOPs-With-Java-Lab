import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        a.setDim(l, b);

        System.out.println("Area of Rectangle = " + a.getArea());

        sc.close(); // optional but good practice
    }
}
