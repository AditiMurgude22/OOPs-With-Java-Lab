import java.util.Scanner;

class PrimeCheck {
   PrimeCheck() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         if (var2 % var4 == 0) {
            ++var3;
         }
      }

      if (var3 == 2) {
         System.out.println("" + var2 + " is a Prime Number");
      } else {
         System.out.println("" + var2 + " is Not a Prime Number");
      }

      var1.close();
   }
}