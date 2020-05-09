package fr.tarik.erp.services;

import fr.tarik.erp.entities.Client;
import fr.tarik.erp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	public Client save(Client client){
		return clientRepository.save(client);
	}
}
