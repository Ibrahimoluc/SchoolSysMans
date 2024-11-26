//Sınıfların hepsini tutacak
//diger 2 entity(ogretmen ve ogrenciler) de sınıf uzerinden ulasılanacak


package src.java.school;

import src.java.school.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class School{
    private static School school;
    private String name;
    //static olmasa da olur galiba, zaten sadece bir tane school olusturabilecem
    private ArrayList<Classroom> crList;
    
    public static School getInstanceOf(){
        if(School.school == null) school = new School();
        return School.school;
    }

    private School(){
        crList = new ArrayList<Classroom>();
    }

    public String getName(){
        return name;
    }

    // public void setName(String name){
    //     this.name = name;
    // }


    public void createClassRoom(String name){
        crList.add(new Classroom(name));
    }

    
    //Ben buradaki fonksiyonları main den cagırmayı planlıyorum ve main Classroom a erisimi olmıcak.
    //Yani buradan aldıgım Classroom u kullanamam. Ama yine de kalsın fakat private olsun. Main istese de ulasamasın
    //Buradaki diger fonksiyonlar icin yararli
    private Classroom getClassRoom(char c){
        for(Classroom cr : crList){
            if(cr.getName() == c){
                System.out.println("Sinif bulundu, from getClassroom");
                return cr;
            }
        }

         return null;
    }

    
    public void printClassRoom(char c){
        Classroom cl = getClassRoom(c);
        if(cl == null) System.out.println("Sinif " + c + " bulunamadi, from printClassroom");
        else cl.printClassRoom();
    }


    //Classroomdan addStudent cagıracaksak, bu metod classrooom u parametre olarak alması gerek gibi
    //Peki bu fonksiyon paremetre olarak Student ve Classroom alabilir mi?
    //Buradaki fonksiyonlar main den cagırılacak ve main Student gibi classları goremeyecek
    //O zaman cagırılamaz. Onun yerine alan bilgileri istenecek.
    public void addStudent(String fn, String ln, int year, int month, int day, String nationalId, char className){
        Classroom cl = getClassRoom(className);
        if(cl == null) throw new NoSuchElementException("Aradiginiz sinif school da bulunmuyor.");
        Student s = new Student(fn, ln, year, month, day, nationalId);
        cl.addStudent(s);
    }

    //Ogrenciyi almak icin bir fonksiyon natId ye gore
    //printStudent icinde kullanılacak
    //Classroom daki getStudentByNatId den farkı, birçok sınıf içinde arama yapması olacak
    //Eger Classroom.getStudentByNatId Exception atarsa ogrenci bulamadıgında sıkıntı yaratabilir burada.
    private Student getStudentByNatId(String nationalId){
        Student s = null;
        for(Classroom cl : crList){
            s = cl.getStudentByNatId(nationalId);
            if(s!=null){
                return s;
            }
        }
        
        return null;
    }


    public void printStudent(String nationalId){
        Student s = getStudentByNatId(nationalId);
        if(s==null){
            System.out.println("Aranilan ogrenci okulda bulunamadi, from school.getStudentBynAtId");
        }else System.out.println(s);
    }

    
    // private ArrayList<Student> getAllStudsOfClass(char className){

    // }
    
    
}


    //eger school degiskeni statik olmazsa ne olur?
    //bu metod da non-static olmalı. O zaman bu methoda dısarda hiç bir zaman ulasamayacaksın
    //cunku constructor ulasıp bir school instantiate edemiyeceksin, bu okulu cagırabilecegin
    // public School getInstanceOf(){
    //     if(school == null) school = new School();
    //     return School.school;
    // }