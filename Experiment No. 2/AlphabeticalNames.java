// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalNames {
   public AlphabeticalNames() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String[] var2 = new String[10];
      System.out.println("Enter 10 names:");

      for(int var3 = 0; var3 < 10; ++var3) {
         var2[var3] = var1.nextLine();
      }

      Arrays.sort(var2);
      System.out.println("\nNames in Alphabetical Order:");
      String[] var7 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var7[var5];
         System.out.println(var6);
      }

   }
}
