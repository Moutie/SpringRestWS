package com.codetutr.service;

import org.springframework.stereotype.Service;
import com.codetutr.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	PersonDB mydb = new PersonDB();
	
	public Person getRandom() {
		return mydb.getRandomPerson();
	}
	
	public Person getById(int id) {
		return mydb.getPersonByID(id);
	}
	
	public boolean personExist(int id) {
		return mydb.personExist(id);
	}
	
	public void save(Person person) {
		mydb.savePerson(person);
	}

}
