import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 컴퓨터 날짜 및 시간 정보를 가진 Calendar 객체를 얻는다.
        int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘의 요일 얻기(1~7)
    }
}