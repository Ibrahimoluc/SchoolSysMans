package src.java.school;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

//Teacher ve Student bilgilerini o klaslarda tutmak yerine burada tuttum böylece java ArrayList in sunmus oldugu ozelliklerden yararlanabilecem.
//Mesela bir ogrencinin sınıfnın bulmak icin butun ogrencileri iterate etmem.
//Eger ogrencide sınıf bilgisini tutsaydim iterate etmek zorunda kalirdim.

public class Classroom{
    //final variablenin constructor da degerleri belirlenmeli ve bir daha degistirelemezler. Degistirmeye calisirsan compile da hatayi alirsin.
    private final char name;
    private Teacher teacher;
    private ArrayList<Student> students;   

    public Classroom(String str){
        if(!str.matches("[a-z]")) throw new InputMismatchException("Please input only one lower case");
        this.name = str.charAt(0); 
        students = new ArrayList<Student>();
    }  

    public char getName(){
        return name;
    }

    //Bu direkt ogretmeni dondurmeli mi, bu referansi kullanarak istenmeyen sekilde erisim saglanabilir mi?
    public Teacher getTeacher(){
        return teacher;
    }

    public ArrayList<Student> getStudents(){
        return new ArrayList<Student>(students);
    }

    //Java matcher ile Java API ları kullanarak yapılabilir belki, equal ı override etmeden.
    //Fakat nationalId kullanarak yapilacak
    //Kontrol yapıldı. Tek eksik nationalId formatı kontrol edilmiyor o eklenebilir
    //Farklı özellikler icin get yazılabilir, ayrı ayrı hepsini yazmak yerine, java tutorial lambda daki formata bak.
    public Student getStudentByNatId(String nationalId){ 
        for(Student s : students){
            if(s.getNationalId()==nationalId){
                System.out.println("Buldum");
                return s;
            }
        }

        return null;
    }

    
    public void setTeacher(Teacher teacher){
        if(this.teacher==null){
            this.teacher = teacher;
        }
        else{
            System.out.println("bu sinifin " + this.teacher.getFirst_name() + " " + this.teacher.getLast_name() + " ogretmenini " 
            + teacher.getFirst_name() +  " " + teacher.getLast_name() 
            + "degistirmek istediginize emin misiniz?(evet icin 'E' hayir icin herhangi baska bir dugmeye basin)");
            Scanner sc = new Scanner(System.in);
            char c;
            if(sc.hasNext("E")){
                c = sc.next().charAt(0);
                this.teacher = teacher;
            }    
        }
    }


    public void addStudent(Student s){
        //iceriye null verilebiliyor mu kontrol et?
        if(s == null) throw new IllegalArgumentException("Student 'null' olamaz.");
        if(!students.contains(s)){
            students.add(s);
        }
        else{
            System.out.println("Eklemeye calistigin Student zaten listede");
        }
    }

    public void printClassRoom(){
        System.out.println("Classroom name:" + this.getName());
        System.out.println("Teacher:" + this.getTeacher());  
        System.out.println("Students:" + this.getStudents());
    }

    
}

//name kontrolu cagirilan yerde kontrol edilirkenki constructor
    // public Classroom(char name){
    //     this.name = name;
    //     students = new ArrayList<Student>();
    // } 


//final bir deger oldugu icin name, sonradan set etme durumu olmayacak, o yuzden bu islemleri constructor da yapıcam.
    // public void setName(String str){
    //     if(!str.matches("[a-z]")) throw new InputMismatchException("Please input only one lower case");
    //     this.name = c; 
    // }