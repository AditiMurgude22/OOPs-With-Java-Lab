import java.util.Scanner;

class Student {
    int roll_no;

    void getRoll(int r) {
        roll_no = r;
    }

    void displayRoll() {
        System.out.println("Roll No: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2, sub3, sub4, sub5;

    void getMarks(int s1, int s2, int s3, int s4, int s5) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
        sub5 = s5;
    }

    void displayMarks() {
        System.out.println("Marks in 5 Subjects:");
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
    }
}

class Result extends Test {

    void calculateResult() {
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        r.getRoll(roll);

        System.out.println("Enter marks of 5 subjects:");
        r.getMarks(sc.nextInt(), sc.nextInt(), sc.nextInt(),
                   sc.nextInt(), sc.nextInt());

        System.out.println("\n--- Student Result ---");
        r.displayRoll();
        r.displayMarks();
        r.calculateResult();

        sc.close();
    }
}
