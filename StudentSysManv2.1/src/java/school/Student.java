package src.java.school;

import src.java.school.Classroom;

import java.util.Objects;

public class Student extends Person{
	private static final String uniform_mark = null;
	private static int count=0; 
	private long studentId;

	public Student(String fn, String ln, int year, int month, int day, String nationalId){
		super(fn, ln, year, month, day, nationalId);
		count = count + 1;
		studentId = Student.getCount();  	
	}

	//public Student(){}

	public long getStudentId(){
		return studentId;
	}

	public static int getCount(){
		return count;
	}


	@Override
	public String toString(){
		return super.toString() + 
		       "studentId:" + studentId;
	}	

}
	


/*
	public int getGrade(){
		try{
			return Grades.getBy(this);
		}
		catch(NoSuchElementException e){
			System.out.println(e.getMessage());
			return -1;
		}
	}
	*/