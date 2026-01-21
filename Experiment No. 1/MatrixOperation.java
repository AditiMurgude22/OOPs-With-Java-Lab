import java.util.Scanner;

class MatrixOperation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        c[i][j] = a[i][j] + b[i][j];
                break;

            case 2:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < 2; k++)
                            c[i][j] += a[i][k] * b[k][j];
                    }
                break;

            case 3:
                System.out.println("Transpose of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(a[j][i] + " ");
                    System.out.println();
                }
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
