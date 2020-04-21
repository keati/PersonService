package abc.xyz.person.controller;

import java.util.List;

import abc.xyz.person.model.Person;

public interface PersonController {
	public List<Person> list();
	public Person create(Person person);
	public Person get(int id);
}
