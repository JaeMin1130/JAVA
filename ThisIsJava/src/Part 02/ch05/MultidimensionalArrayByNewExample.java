public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        //각 반의 학생수가 3명으로 동일한 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        
        //배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 90;
        mathScores[1][0] = 77;
        mathScores[1][1] = 95;
        mathScores[1][2] = 88;

        //전체 학생의 평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for(int i = 0; i < mathScores.length; i++ ) {
            totalStudent += mathScores[i].length;
            for(int k = 0; k < mathScores[i].length; k++) {
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double)totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
        
        System.out.println();  //한 줄 띄우기

        //각 반의 학생 수가 다른 경우 점수 저장을 위한 2차원 배열 생성

        int[][] englishScores = new int [2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        englishScores[0][0] = 90;
        englishScores[0][1] = 89;

        englishScores[1][0] = 77;
        englishScores[1][1] = 87;
        englishScores[1][2] = 97;

        totalStudent = 0;
        int totalEngSum = 0;
        for(int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for(int k = 0; k < englishScores[i].length; k++) {
                totalEngSum += englishScores[i][k];
            }
        }

        double totalEngAvg = (double)totalEngSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 : " + totalEngAvg);
        System.out.println();
    }
}