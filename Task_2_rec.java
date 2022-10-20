/* 
 * 70. Climbing Stairs
 */
package HW_Java_2;

public class Task_2_rec {
   public static void main(String[] args) {
      int n = 1;
      System.out.println(climbStairs(n));
      n = 2;
      System.out.println(climbStairs(n));
      n = 3;
      System.out.println(climbStairs(n));
      n = 45;
      System.out.println(climbStairs(n));
   }

   public static int climbStairs(int n) {
      int[] arr = new int[n + 1];
      arr[0] = 1;
      arr[1] = 1;
      steps(n, arr);
      return arr[n];
   }

   public static int steps(int n, int[] arr) {
      if (arr[n] != 0) {
         return arr[n];
      }
      arr[n] = steps(n - 1, arr) + steps(n - 2, arr);
      return arr[n];
   }
}
