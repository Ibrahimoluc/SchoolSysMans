package src.test;

import src.java.school.Classroom;
import src.java.school.Teacher;
import src.java.school.Student;


import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.ArrayList;



public class classroomTest{
    
    public static void main(String[] args){
        System.out.println("Merhabalar classroomTest den");

        Scanner sc = new Scanner(System.in);
        char c=0;

        try{
            String str = sc.next();
            Classroom cr = new Classroom(str);
            System.out.println("Class:" + c + " created.");

            //addStudent kontrolü
            //Null da exception atıyor mu
            //cr.addStudent(null);
            System.out.println(cr.getStudents());
            //normal bir ogrenciyi ekliyor mu
            Student s = new Student("Ali", "Cavus", 2000, 11, 3, "14352");
            cr.addStudent(s);
            System.out.println(cr.getStudents());     

            //ikinci farkli ogrenciyi ekleyecek mi?
            Student s2 = new Student("Osman", "Cavus", 1998, 4, 15, "24351");
            cr.addStudent(s2);
            System.out.println(cr.getStudents());

            //Ayni ogrenciyi tekrar ekleyince red ediyor mu  
            cr.addStudent(s2);
            System.out.println(cr.getStudents());   

            //getStudentByNatId kontrolü
            s = cr.getStudentByNatId("24351");
            System.out.println(s);


        }
        catch(InputMismatchException eIn){
            System.out.println(eIn.getMessage());
        }
        catch(NoSuchElementException eNs){
            System.out.println(eNs.getMessage());
        }
        catch(IllegalArgumentException eIa){
            System.out.println(eIa.getMessage());
        }

    }
}



//classroom name icin kontrol
            // System.out.println("Pls give the name of the class");
            // if(!sc.hasNext("[a-z]")) throw new InputMismatchException("Please input only one lower case");
            // c= sc.next().charAt(0); //bu da exception gibi yazilabilir, bu blok farklı exceptionlar içermeli gibi
            // Classroom cr = new Classroom(c);
            // System.out.println("Class:" + c + " created.");




//Bu hasNext girdinin sadece bir harf olmasini duzgun kontrol ediyor
        //hasNext bufferı temizlemiyor, next() temizliyor. Mantikli veri kaybi olmuyor boylece
        //if(sc.hasNext("[a-z]")) System.out.println("bir seyler var"); 


/*
if(sc.hasNext("[a-z]")){
            c= sc.next().charAt(0); //bu da exception gibi yazilabilir, bu blok farklı exceptionlar içermeli gibi
            Classroom cr = new Classroom(c);
            System.out.println("Class:" + c + " created.");

            Teacher t = cr.getTeacher();
            System.out.println("Teacher of the class is:" + t);

        }
        else{
            System.out.println("Please input only one lower case");
        }
*/


/*
            //cr.setTeacher(null); exceptiona takilir get de
            //hicbirsey set etmezsen yine exceptiona takilir
            cr.setTeacher(new Teacher("Ali", "Cakir", 2000, 5, 13));
            Teacher t = cr.getTeacher();        
            System.out.println("Teacher of the class is:" + t);

            //getTeacher eger direkt return this.Teacher yaparsa ben Teacher'ın setTeacher fonksiyonu kullanmadan set edebilir miyim?
            //Hayir
            t = new Teacher("Polat", "Alemdar", 1980, 5, 15);
            System.out.println("Teacher of the class is:" + cr.getTeacher());

            //peki bu teacher uzerinde islem yapabilir miyim? Teacher fonksiyonlarinin izin verdigi kadar
            t = cr.getTeacher();
            t.setFirst_name("Namik");
            System.out.println("Teacher of the class is:" + cr.getTeacher());

            //peki ogrenci listesini dondurmeli miyim. O zaman da classroom un dısından icindeki ogrenciler kontrol edilebilir.
            ArrayList<Student> ar = cr.getStudents();
            System.out.println("Students of the class are:" + ar);
            //Classroom un haberi olmadan ogrenci listesini degistiricem. Encapsulation ilkesi bozuluyor
            //fakat classroom students referans yerine kopya dondururse sikinti kalmaz
            ar.add(new Student("Osman", "Aga", 2017, 6, 13, 371));
            System.out.println("Students of the class are:" + cr.getStudents());

            //setTeacher degistirme icin kullanildiginda dogru davraniyor mu?
            cr.setTeacher(new Teacher("Mahmut", "Orhan", 1967, 2, 3));
            System.out.println("Teacher of the class is:" + cr.getTeacher());
*/