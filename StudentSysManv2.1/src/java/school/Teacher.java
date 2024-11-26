package src.java.school;


public class Teacher extends Person{
	
	public Teacher(String fn, String ln, int year, int month, int day, String nationalId){
		super(fn, ln, year, month, day, nationalId);
	}

}




//Bu bir disardan protected bir seye ulasabilirler mi
//Evet bu sekilde bu pakette olmayan bir class Teacher uzerinden Grades deki protected degere ulasabilir
//public static int t_not = Grades.not; 