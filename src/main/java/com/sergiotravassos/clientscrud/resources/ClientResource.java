package com.sergiotravassos.clientscrud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiotravassos.clientscrud.entites.Client;
import com.sergiotravassos.clientscrud.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = clientService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
