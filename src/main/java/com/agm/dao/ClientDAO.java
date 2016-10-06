package com.agm.dao;

import java.util.List;

import com.agm.model.Client;

public interface ClientDAO {
	
	public void saveClient(Client client);
	public List<Client> getClients();
}
