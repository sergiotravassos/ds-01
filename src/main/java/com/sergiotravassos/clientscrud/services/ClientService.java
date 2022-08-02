package com.sergiotravassos.clientscrud.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiotravassos.clientscrud.dto.ClientDTO;
import com.sergiotravassos.clientscrud.entites.Client;
import com.sergiotravassos.clientscrud.repositories.ClientRepository;
import com.sergiotravassos.clientscrud.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = clientRepository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity nor found"));
		return new ClientDTO(entity);
	}
}
