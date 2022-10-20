/* 
* 50. Pow(x, n)
*/
package HW_Java_2;

public class Task_1 {
   public static void main(String[] args) {
      double x = 2.00000;
      int n = 10;
      System.out.println(exponentiation(x, n));
      x = 2.10000;
      n = 3;
      System.out.println(exponentiation(x, n));
      x = 2.00000;
      n = -2;
      System.out.println(exponentiation(x, n));
   }

   public static double exponentiation(double base, int num_pow) {
      if (num_pow == 0) {
         return 1;
      }
      if (num_pow == 1) {
         return base;
      }
      if (base == 0 || base == 1) {
         return base;
      }
      if (num_pow < 0) {
         return 1 / base * exponentiation(1 / base, -(num_pow + 1));
      }

      double calculation = exponentiation(base, num_pow / 2);
      double result = calculation * calculation;
      if (num_pow % 2 == 1) {
         result *= base;
      }
      return result;
   }
}
