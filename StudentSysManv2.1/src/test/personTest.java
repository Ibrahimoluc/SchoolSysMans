package src.test;

import src.java.school.Person;
import src.java.school.Student;


public class personTest{
	public static void main(String[] args){
		//compiler person gormesi icin Person.java diye ayri bir dosya olmasi yeter. 
		//compilera ayri sekilde Person.java vermene de gerek yok
		System.out.println("Hello from PersonTest!!!");
		Person p = new Student("Ali", "Selim", 1998, 7, 15, "13872");
		Person p2 = new Student("Osman", "Kasik", 2000, 12, 3, "23762");
		if(p.equals(p2)) System.out.println("Bunlar esit personlar");

		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		if(p.hashCode() == p2.hashCode()) System.out.println("HashCode lar esit");


	}
}

//equal ve hashCode methodlarının denenmesi
		// Person p = new Person("Ali", "Selim", 1998, 7, 15, "13872");
		// Person p2 = new Person("Osman", "Kasik", 2000, 12, 3, "23762");
		// if(p.equals(p2)) System.out.println("Bunlar esit personlar");

		// System.out.println(p.hashCode());
		// System.out.println(p2.hashCode());
		// if(p.hashCode() == p2.hashCode()) System.out.println("HashCode lar esit");