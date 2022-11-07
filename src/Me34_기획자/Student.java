package Me34_기획자;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private long studentID;
	private String major;
	private List<Subject> subjectList;
	void study() {};
	public Student(String name,int age, String address,long id, String major) {
		super(name,age,address);
		this.studentID=id;
		this.major=major;
		this.subjectList=new ArrayList();
		
	}
	void addSubject(Subject subject) {
		// subjectlist subject추가
		subjectList.add(subject);
		// subject에 student 추가
		subject.addStudent(this);
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID +"]";
	}
	
	
}
