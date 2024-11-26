package src.java.school;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.temporal.*;
import java.util.Objects;

//Buradaki bazı attribute lar, belki de hepsi final yapılabilir
abstract public class Person{
	private String first_name;
	private String last_name;
	//public Calendar birth_date;
	private LocalDateTime birth_date;
	private String nationalId; //Buna bazi kontroller eklenmeli 

	public Person(){
	}
	
	//Bu set Fonksiyonalrı exception atmali?
	public Person(String fn, String ln, int year, int month, int day, String nationalId){
		setFirst_name(fn);
		setLast_name(ln);
		setBirth_date(year, month, day);
		setNationalId(nationalId);
	}

	public String getFirst_name(){
		return first_name;
	}

	public String getLast_name(){
		return last_name;
	}

	public String getBirth_date(){
		return this.birth_date.getYear() + "\\" + this.birth_date.getMonth() +
			"\\" + this.birth_date.getDayOfMonth();
	}

	public String getNationalId(){
		return nationalId;
	}
	
	public long getAge(){
		if(birth_date != null){
			return ChronoUnit.YEARS.between(birth_date, LocalDateTime.now());
		}
		else{
			System.out.println("birth_date is null. error at getAge()");
			return -1;
		}
	}
	

	public void setFirst_name(String s){
		if(s!=null && s.matches("[a-zA-Z]+")) first_name = s;
		else System.out.println("Gecersiz ilk_ad");
	}
	

	public void setLast_name(String s){
		if(s!=null && s.matches("[a-zA-Z]+")) last_name = s;
		else System.out.println("Gecersiz ilk_ad");
	}


	public void setBirth_date(int year, int month, int day){
		birth_date = LocalDateTime.of(year, month, day, 0, 0);
	}

	//Bunun gibi digerlerine de eklenmeli
	public void setNationalId(String s){
		if(!s.matches("[0-9]{5}")) throw new IllegalArgumentException("Not a valid nationalId"); 
		nationalId = s;
	}

	@Override
	public String toString(){
		return "First Name:" + this.first_name + "\n"
			+ "Last Name:" + this.last_name + "\n"
			+ "Birth Date:" + this.getBirth_date() + "\n";
	}

	@Override
	public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getNationalId().equals(person.getNationalId());
	}

	@Override
	public int hashCode(){
		return Objects.hash(this.getNationalId());
	}

}



