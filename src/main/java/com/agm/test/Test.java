package com.agm.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agm.dao.ClientDAO;
import com.agm.model.Client;

public class Test {

	public static void main(String[] args) {

		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		final ClientDAO clientDAO = context.getBean(ClientDAO.class);
		
//		Client person = new Client();
//		person.setName("Pankaj"); person.setCountry("India");
//		
//		personDAO.save(person);
//		
//		System.out.println("Person::"+person);
		
		final List<Client> list = clientDAO.getClients();
		
		for(Client p : list){
			System.out.println("Client List - " + p.getName());
		}
		//close resources
		context.close();	
	}

}
