import java.lang.reflect.Array;
import java.util.Arrays;

public class intMatrixTest {
    public static void main(String args[]) {
        IntMatrix test = new IntMatrix(3,2);
        int[][] k = new int[3][2];
        int q = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                k[i][j] = q;
                q += 1;
            }
        }
        test.setMatrix(k);
        if (test.getMatrix() == k) {
            System.out.println("setMatrix Yes!");
        } else {
            System.out.println("setMatrix No!");
        }
        //get
        if (test.get(1,1) == 1) {
            System.out.println("get Yes!");
        } else {
            System.out.println("get No!");
        }

        //set
        test.set(1,1,2);
        if (test.get(1,1) == 2) {
            System.out.println("set Yes!");
        } else {
            System.out.println("set No!");
        }
        //getrow
        test.setMatrix(k);
        if (Arrays.equals(test.getRow(2), k[1])) {
            System.out.println("getrow Yes!");
        } else {
            System.out.println("getrow No!");
        }
        //getcol
        int[] x = new int[test.getMatrix().length];
        for (int i = 0; i < k.length; i++) {
            x[i] = k[i][1];
        }
        int[] c = test.getCol(1);
        if (Arrays.equals(x, test.getCol(2))) {
            System.out.println("getcol Yes!");
        } else {
            System.out.println("getcol No!");
        }

        //add
        q = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                k[i][j] = q;
            }
        }
        q = 2;
        int[][] ta = new int[3][2];
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 2; j++) {
                ta[i][j] = q;
            }
        }
        IntMatrix testadd = new IntMatrix(3,2);
        testadd.setMatrix(k);
        int[][] a = test.add(testadd).getMatrix();
        if (Arrays.deepEquals(test.add(testadd).getMatrix(), ta)) {
            System.out.println("add Yes!");
        } else {
            System.out.println("add No!");
        }
        //mutiply int
        if (Arrays.deepEquals(test.multiply(2).getMatrix(), test.add(testadd).getMatrix())) {
            System.out.println("mutiply int Yes!");
        } else {
            System.out.println("mutiply int No!");
        }
        //mutiply matrix
        int[][] k2 = new int[2][4];
        int q2 = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                k2[i][j] = q;
                q += 1;
            }
        }
        IntMatrix testmutiplyInt = new IntMatrix(2, 4);
        testmutiplyInt.setMatrix(k2);
        int[][] k3 = {{8, 10, 12, 14}, {8, 10, 12, 14}, {8, 10, 12, 14}};
        if (Arrays.deepEquals(test.multiply(testmutiplyInt).getMatrix(), k3)) {
            System.out.println("mutiply IntMatrix Yes!");
        } else {
            System.out.println("mutiply IntMatrix No!");
        }
        //tanspose
        k = new int[3][2];
        q = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                k[i][j] = q;
                q += 1;
            }
        }
        test.setMatrix(k);
        int[][] k4 = {{1, 3, 5}, {2, 4, 6}};
        if (Arrays.deepEquals(test.transpose().getMatrix(), k4)) {
            System.out.println("transpose Yes!");
        } else {
            System.out.println("transpose No!");
        }
    }
}
