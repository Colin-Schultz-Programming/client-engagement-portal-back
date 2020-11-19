package com.engagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.engagement.model.Client;
import com.engagement.service.ClientService;

/**
 * Controller that handles requests pertaining to clients
 * @author Tucker Fritz
 */
@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService cs;
	
	/**
	 * Returns a list of all clients in the database
	 * @return List of all clients
	 */
	@GetMapping
	@ResponseBody
	public List<Client> findAll() {
		return cs.findAll();
	}
	
	/**
	 * Saves a client to the database
	 * @param c A client to be saved to the database
	 * @return Client that was saved. May be null if client is yet to be persisted to database.
	 */
	@PostMapping
	@ResponseBody
	public Client save(@RequestBody Client c) {
		return cs.save(c);
	}
	
	/**
	 * Find a client by email
	 * @param email An email pertaining to a client in the database
	 * @return Client associated with id w/ default values if client is non-existant
	 */
	@GetMapping("/email/{email}")
	@ResponseBody
	public Client findByEmail(@PathVariable String email) {
		return cs.findByEmail(email);
	}
}