package com.sergiotravassos.clientscrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergiotravassos.clientscrud.entites.Client;
import com.sergiotravassos.clientscrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
}
