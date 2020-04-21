package abc.xyz.person.service;

import java.util.List;

import abc.xyz.person.model.Person;

public interface PersonService {
	
	List<Person> getPersons();
	Person createPerson(Person person);
	Person getPersonById(int id);

}
