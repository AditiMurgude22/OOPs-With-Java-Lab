import java.util.Scanner;

class Factorial {
   Factorial() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      long var3 = 1L;
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();

      for(int var5 = 1; var5 <= var2; ++var5) {
         var3 *= (long)var5;
      }

      System.out.println("Factorial of " + var2 + " = " + var3);
      var1.close();
   }
}