package com.example.core.beans;

public class DAOFactory {

	private Person person;
	
	private static DAOFactory daoFactory;

	public static DAOFactory getInstance(){
		return daoFactory;
	}	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public DAOFactory getDaoFactory() {
		return daoFactory;
	}
	
	public void setDaoFactory(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
}
