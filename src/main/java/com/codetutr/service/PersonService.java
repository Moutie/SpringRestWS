package com.codetutr.service;

import com.codetutr.domain.Person;

public interface PersonService {
	public Person getRandom();
	public Person getById(int id);
	public boolean personExist(int id);
	public void save(Person person);
}
