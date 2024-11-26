package src.test;

import src.java.school.School;
import java.util.NoSuchElementException;


class schoolTest{
    public static void main(String[] args){
        System.out.println("Merhabalar schoolTest den.");

        School school = School.getInstanceOf();
        
        school.createClassRoom("a");
        school.createClassRoom("b");
        school.createClassRoom("c");

        school.printClassRoom('a');
        school.printClassRoom('b');
        
        try{
            school.addStudent("Ayse", "Kek", 2010, 7, 21, "16721", 'a');
            school.addStudent("Osman", "Kocak", 2010, 9, 2, "16723", 'b');
            school.addStudent("Kazim", "Kaska", 2010, 10, 12, "16724", 'd');
    		school.addStudent("Ali", "Veli", 2010, 5, 2, "86725", 'c');
            System.out.println("Ogrenciler eklendikten sonra");

            school.printClassRoom('a');
            school.printClassRoom('b');
            school.printClassRoom('c');

            school.printStudent("86725");

        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }

    }    
}

        // //Bu çalışmaz, cunku School constructor private
        // //School school = new School();
        // //Bu calısır
        // School school = School.getInstanceOf();
        // school.setName("Cenap Sehabettin");
        // School school2 = School.getInstanceOf();
        // System.out.println(school);
        // System.out.println(school2);

        // System.out.println(school.getName());
        // System.out.println(school2.getName());