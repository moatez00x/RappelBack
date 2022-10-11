package Rappel.Back.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Rappel.Back.repository.AccountRepository;
import Rappel.Back.service.AccountService;

@CrossOrigin(origins = "*")
@RequestMapping("/clients")
@RestController
public class ClientController {
		
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountService clientService;
}
