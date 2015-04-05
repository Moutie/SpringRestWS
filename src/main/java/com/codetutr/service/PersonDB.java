package com.codetutr.service;

import java.util.Random;
import java.util.Vector;

import com.codetutr.domain.Person;

public class PersonDB {

	String[] names = {"Nikolaus Otto", "Robert Ford", "Gottlieb Daimler", "Lt. General Masaharu Homma"};
	private Vector<Person> db = new Vector<Person>();
	
	public PersonDB(){
		
		for(int i=0; i<names.length; i++)
		{
			Person person = new Person();
			person.setName(names[i]);
			person.setAge(randomAge());;
			db.add(person);
		}
	}
	
	public Person getRandomPerson(){
		Random random = new Random();
		int index = random.nextInt(db.size());
		return db.get(index);
	}
	
	public Person getPersonByID(int index){
		return db.get(index);
	}
	
	public void savePerson(Person person){
		db.add(person);
	}
	
	public boolean personExist(int index){
		if(index >= 0 && index < db.size())
			return true;
		else
			return false;
	}
	
	//---Private-------------
	
	private Integer randomAge() {
		Random random = new Random();
		return 10 + random.nextInt(100);
	}
	
}
