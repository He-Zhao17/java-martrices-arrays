import java.util.Arrays;

/** An IntMatrix is a wrapper for a 2D matrix.
 *
 */
public class IntMatrix {

    private int[][] matrix;

    public IntMatrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    /**
     * Return the element at [row, col]. Throw an IllegalArgumentException if the input is invalid.
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {

    }

    /**
     * Set the element at [row,col] to be value. Throw an IllegalArgumentException if the input is invalid.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {

   }

    @Override
    public String toString() {
        return "IntMatrix{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
/**  return an array of integers containing the elements of row r.
     * Throw an IllegalArgumentException if the input is invalid.
     * @param row
     * @param col
    * @return
     */
    public int[] getRow(int r) {

    }
/**  return an array of integers containing the elements of column c.
 * Throw an IllegalArgumentException if the input is invalid.
 * @param row
 * @param col
 * @return
            */

    public int[] getCol(int c) {

    }

    /**
     * Return a new IntMatrix that is the sum of this matrix plus otherMatrix.
     * Recall that:
     * | a b|  +  |c  d| = |a+c  b+d|
     * | e f|     |g  h|   |e+g  f+h|
     * Throw an IllegalArgumentException if the input is invalid.
     * @param otherMatrix
     * @return
     */

    public IntMatrix add(IntMatrix otherMatrix) {

    }

    /**
     * Return a new IntMatrix that is the product of this matrix plus a scalar.
     * Recall that:
     * | a b|  * c = |ac  bc|
     * | e f|        |ec  fc|
     * Throw an IllegalArgumentException if the input is invalid.
     * @param scalar
     * @return
     */

    public IntMatrix multiply(int scalar) {

    }

    /**
     * Return a new IntMatrix that is the product of this matrix and otherMatrix.
     * Recall that:
     * | a b c|  *  |g  h| = |ag+bi+ck  ah+bj+cl|
     * | d e f|     |i  j|   |dg+ei+fk  dh+ej+fl|
     *              |k  l|
     * Throw an IllegalArgumentException if the input is invalid.
     * @param otherMatrix
     * @return
     */
    public IntMatrix multiply(IntMatrix otherMatrix) {

    }

    /**
     * Return a new IntMatrix that is the transpose of this matrix.
     * Recall that the transpose of :
     * | a b|  is  |a  c|
     * | c d|      |b  d|
     * @return
     */
    public IntMatrix transpose() {

    }

}



