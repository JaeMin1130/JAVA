package array_list;

import java.util.ArrayList;

public class Student {
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		serialNum++;
		studentID = serialNum;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println(studentName + "님의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		System.out.println(studentName + "님의 " + "전과목 평균 점수는 " + total / subjectList.size() + "점 입니다.");
	}
}
