public class ArrayResizer
{
  /** Returns true if and only if every value of row r in array2D is nonzero.
   * Precondition: r is a valid row of array2D.
   * Postcondition: array2D is unchanged.
   */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  {
    /* to be implemented in part (a) */
    int countNums = 0;

    for (int i= 0; i< array2D[r].length; i++)
    {
      if (array2D[r][i] > 0)
      {
        countNums++;
      }
      if (countNums == array2D[r].length)
      {
        return true;
      }
    }
    return false;
  }

  /** Returns the number of rows of array2D that contain all nonzero values.
   * Postcondition: array2D is unchanged.
   */
  public static int numNonZeroRow(int[][] array2D)
  {
    int count = 0;
    for (int row = 0; row < array2D.length; row++)
    {
       if (isNonZeroRow(array2D, row))
       {
          count++;
       }
    }
    return count;
  }

  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   */
  public static int[][] resize(int[][] array2D)
  {
    int numNonZero = numNonZeroRow(array2D);
    /* to be implemented in part (b) */
    int [][] answer = new int[numNonZero][array2D[0].length]

    int rowNum = 0;
    for (int i = 0; i<array2D[0].length;i++)
    {
      if (isNonZeroRow(array2D,r))
      {
        answer[rowNum] = array2D[r];
        rowNum++
      }

    return answer;
  }
}
