import java.util.ArrayList;
import java.util.Scanner;

public class Q1_Main {
    public static void main(String[] args) {

        Student no1 = new Student("김재민", "2016");
        Student no2 = new Student("정지헌", "2017");
        Student no3 = new Student("정찬혁", "2018");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(no1);
        list.add(no2);
        list.add(no3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색을 원하시면 y, 종료하려면 n");
            String input1 = scanner.nextLine();
            if (input1.equals("y")) {
                System.out.println("찾으시는 학생의 이름을 입력하세요.");
                String input2 = scanner.next();
                boolean flag = false;
                for (Student stu : list) {
                    if (stu.getName().equals(input2)) {
                        System.out.println("해당하는 학생의 학번은 " + stu.getNo() + "입니다.");
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("일치하는 학생이 없습니다.");
                }
            } else if (input1.equals("n")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}