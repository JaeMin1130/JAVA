public class Answer {
    public static void main(String[] args) {

        int[][] arrA = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int[][] arrB = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arrA[0].length; k++) {
                    sum += (arrA[i][k] * arrB[k][j]);
                }
                System.out.print(sum + "\t");
            }
            System.out.println();
        }
    }
}
