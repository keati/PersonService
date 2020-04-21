package abc.xyz.person.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import abc.xyz.person.controller.PersonController;
import abc.xyz.person.model.Person;
import abc.xyz.person.service.PersonService;

@RestController
@RequestMapping("api/v1/")
public class PersonControllerImpl implements PersonController{
	
	@Autowired
	private PersonService personService;
	
	
	public PersonControllerImpl() {}
	

	@RequestMapping(value = "persons", method = RequestMethod.GET) 
	public List<Person> list() {
		return personService.getPersons();
	}
	
	//Create operation
	@RequestMapping(value = "persons", method = RequestMethod.POST) 
	public Person create(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
	@RequestMapping(value = "persons/{id}", method = RequestMethod.GET) 
	public Person get(@PathVariable int id) {
		return personService.getPersonById(id);
	}
	
	
}
