class Student {
    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

interface Sports {
    void set(int sMarks);
}

class Result extends Test implements Sports {
    private int sportsMarks;

    public void set(int sMarks) {
        this.sportsMarks = sMarks;
    }

    public void displayResult() {
        int total = sub1 + sub2 + sportsMarks;

        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

public class Main {
    public static void main(String[] args) {

        Result student1 = new Result();

        student1.setRollNo(100);
        student1.setMarks(85, 90);
        student1.set(15);

        student1.displayResult();
    }
}