/* 
 * 695. Max Area of Island
 */
package HW_Java_2;

public class Task_3 {
   public static void main(String[] args) {
      int[][] arr = {
            { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
            { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
            { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
      };
      System.out.println(maxAreaOfIsland(arr));

      int[][] arr1 = {
            { 0, 0, 0, 0, 0, 0, 0, 0 }
      };
      System.out.println(maxAreaOfIsland(arr1));
   }

   public static int maxAreaOfIsland(int[][] grid) {
      int square = 0;
      for (int i = 0; i < grid.length; i++) {
         for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 1) {
               int countArea = calculatedArea(i, j, grid);
               if (square < countArea) {
                  square = countArea;
               }
            }
         }
      }
      return square;
   }

   public static int calculatedArea(int i, int j, int[][] grid) {
      if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
         return 0;
      }
      grid[i][j] = 0; // Для того чтобы не повторялся подсчет
      return 1 + calculatedArea(i - 1, j, grid) + calculatedArea(i, j - 1, grid) + calculatedArea(i + 1, j, grid)
            + calculatedArea(i, j + 1, grid);
   }
}
