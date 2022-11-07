package Me34_기획자;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	long subjectID;
	String subjectName;
	List<Student> studentList;
	
	public Subject(long subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.studentList = new ArrayList();
	}
	
	void addStudent(Student student) {
		studentList.add(student);
		
		
	}

	@Override
	public String toString() {
		StringBuffer buff=new StringBuffer();
		for(Student std : studentList) {
			buff.append(std.toString());
		}
		return "Subject [subjectID=" + subjectID + ", subjectName=" + subjectName + ", 수강주인 학생 : " + buff
				+ "]";
	}
	
	
}
