import java.util.*;
class Student{
	public Student(String name,double cgpa,int token){
		this.name = name;
		this.cgpa=cgpa;
		this.token = token;
	}
	public String getName(){
		return this.name;
	}
	public double getCgpa(){
		return this.cgpa;
	}
	public int getToken(){
		return this.token;
	}
	public boolean Greater(Student s){
		if(this.cgpa>s.getCgpa()){
			return true;
		}
		else if(this.cgpa<s.getCgpa()){
			return false;
		}
		if(this.name.compareTo(s.getName())<0){
			return true;
		}
		else if(this.name.compareTo(s.getName())>0){
			return false;
		}
		else{
			if(this.token<s.getToken())
				return true;
			else return false;
		}
		
	}
	//Fields
	private int token;
	private String name;
	private double cgpa;
	
}