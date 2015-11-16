package base;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import domain.PersonDomainModel;

public class Person_Test {

	private static PersonDomainModel person1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		person1 = new PersonDomainModel();
		LocalDate BirthDate = null;
		person1.setFirstName("Roy");
		person1.setLastName("Cheng");
		person1.setPostalCode(19711);
		person1.setStreet("54 Cleveland");
		person1.setCity("Newark");
		person1.setBirthday(BirthDate);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PersonDAL.addPerson(person1);
		PersonDAL.getPersons();
		person1.setFirstName("Idiot");
		PersonDAL.updatePerson(person1);
		PersonDAL.getPersons();
		PersonDAL.deletePerson(person1.getPersonID());
		PersonDAL.getPersons();
	}

}