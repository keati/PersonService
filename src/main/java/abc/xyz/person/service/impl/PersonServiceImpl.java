package abc.xyz.person.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import abc.xyz.person.model.Person;
import abc.xyz.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();
	
	public PersonServiceImpl() {
		super();
		Person p1 = new Person(1, "Sam", "Klein", 18);
		Person p2 = new Person(2, "Pam", "Hearst", 19);
		Person p3 = new Person(3, "Kam", "Dunes", 17);
		Person p4 = new Person(4, "Lam", "Sonar", 16);
		personMap.put(1,p1);
		personMap.put(2,p2);
		personMap.put(3,p3);
		personMap.put(4,p4);
	}
	
	public PersonServiceImpl(HashMap<Integer, Person> personMap) {
		super();
		this.personMap = personMap;
	}

	@Override
	public List<Person> getPersons() {
		List<Person> values = new ArrayList<Person>(personMap.values());
		return values;
	}

	@Override
	public Person createPerson(Person person) {
		personMap.put(5, person);
		return person;
	}

	@Override
	public Person getPersonById(int id) {
		Person value = (Person) personMap.get(id);
		return value;
	}


}
