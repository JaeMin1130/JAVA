public class Mission2 {

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        int[][] arr2 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr1[i][j] * arr2[j][i];
            }
            for (int k = 0; k < 3; k++) {
                arr3[i][k] = sum;
                System.out.print(arr3[i][k] + "\t");
            }
            System.out.println();
        }
    }
}