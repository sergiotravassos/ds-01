package com.sergiotravassos.clientscrud.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiotravassos.clientscrud.entites.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Silva", "54483722107", 6500.0, Instant.now(), 2));
		list.add(new Client(2L, "João Grey", "31923900501", 4200.0, Instant.now(), 1));
		return ResponseEntity.ok().body(list);
	}
}
