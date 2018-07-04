package com.example.core.modules;

import com.example.core.beans.DAOFactory;
import com.example.core.beans.Person;
import com.example.core.interfaces.modules.Modulo;

public class M1 implements Modulo {

	@Override
	public boolean evalua() {
		
		Person person = DAOFactory.getInstance().getPerson();
		
		System.out.println(person.toString());
		
		person.setLastname("test");
		
		System.out.println(person.toString());
		
		return false;
	}
}
