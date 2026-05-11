// ResultProgram.java

class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

interface Sports {
    int sMarks = 20;
    void setSports();
}

class Result extends Test implements Sports {

    public void setSports() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void displayResult() {
        int total = sub1 + sub2 + sMarks;
        System.out.println("Roll No: " + getRollNo());
        displayMarks();
        setSports();
        System.out.println("Total Marks: " + total);
    }
}

public class ResultProgram {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(85, 90);
        r.displayResult();
    }
}