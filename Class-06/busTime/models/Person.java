package models;

//Import the Date package
import java.util.Date;

public class Person{	
	
	//Attributes
	private String name;
	private String familyName;
	private Date birthday;
	
	
	//Constructors
	//Empty Constructor
	public Person(){}
	
	//Constructor with arguments	
	public Person(String name, String familyName){		
		this.name = name;
		this.familyName = familyName;
	}

	
	//Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;			
	}
	
	public String getFamilyName(){
		return familyName;
	}
	
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	public Date getBirthday(){
		return birthday;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	//custom methods
	
	public String fullHungarianName(){
		return familyName+" "+name;
	}
	
	@Override
	public String toString(){
		return "Name "+name+ "\nfamilyName "+familyName ;
		
		
	}	
	
}