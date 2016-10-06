package com.agm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.agm.dao.ClientDAO;
import com.agm.model.Client;

public class ClientDAOImpl implements ClientDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveClient(Client client) {
		final Session session = this.sessionFactory.openSession();
		final Transaction tx = session.beginTransaction();
		session.persist(client);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Client> getClients() {
		final Session session = this.sessionFactory.openSession();
		final List<Client> clientList = (List<Client>)session.createQuery("from Client").list();
		session.close();
		return clientList;
	}

}
