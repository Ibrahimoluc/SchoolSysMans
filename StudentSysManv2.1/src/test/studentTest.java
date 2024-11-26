package src.test;

import src.java.school.Student;
import src.java.school.Person;

class studentTest{
	public static void main(String[] args){
		System.out.println("Hello from studentTest");

		Student s1 = new Student("Ali", "Veli", 2000, 9, 2, "86725");
		Student s2 = new Student("Kazim", "Kaska", 2000, 9, 2, "86725");
		if(s1.equals(s2)) System.out.println("Bu ogrenciler esit");

		System.out.println(s1.getStudentId());
		System.out.println(s2.getStudentId());

	}
}


	/* nationalId ile birlikte student.equals kontrolu farklı nationalId'li ogrenciler icin
		Student s1 = new Student("Ali", "Veli", 2007, 8, 2, "86725");
		Student s2 = new Student("Ali", "Veli", 2002, 10, 5, "12345");
		if(s1.equals(s2)) System.out.println("Bu ogrenciler esit");
		System.out.println("s1 hashCode:" + s1.hashCode());
		System.out.println("s2 hashCode:" + s2.hashCode());
		*/


/*
	Person p = new Student(); //Bu olur, cunku student constructorunda parent ı person u çağırıyor
	//Student s2 = new Person(); //Bu olmaz, "Person cant converted to Student"
*/

/*		Student s = new Student("Ali", "Cakir", 2008, 3, 30);
		Student s2 = new Student("Osman", "Salih", 1987, 4, 11);
		if(s.equals(s2)) System.out.println("1-Esittir" + s2.getStudentId());

		System.out.println("Ali".hashCode());
		System.out.println("Ali".hashCode());

		//ikisinin hashCode u fieldleri ayni olmasina ragmen farkli oluyor
		Student s3 = new Student("Ali", "Cakir", 2010, 2, 27);
		//System.out.println("s hashCode:" + s.hashCode());
		//System.out.println("s hashCode:" + s3.hashCode());
		//fakat ikisinin studentId si ayni mi olacak?
		System.out.println("s studentId:" + s.getStudentId());
		System.out.println("s3 studentId:" + s3.getStudentId());
		if(s.getStudentId()==s3.getStudentId()) System.out.println("StudentId ler esit");
		if(s.equals(s3)) System.out.println("Student ler esit");


		/* count denemesi
		System.out.println("Number of student:" + Student.getCount());

		Student s = new Student("Ali", "Cakir", 2010, 7, 12, 371);
		System.out.println(s);
		System.out.println("Number of student:" + Student.getCount());

		s = new Student("Ali", "Cakir", 2010, 7, 12, 371);
		System.out.println("Number of student:" + Student.getCount());
		*/
	
