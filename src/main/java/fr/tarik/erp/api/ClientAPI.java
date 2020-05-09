package fr.tarik.erp.api;

import fr.tarik.erp.entities.Client;
import fr.tarik.erp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClientAPI {

	@Autowired
	ClientService clientService;

	@GetMapping("/")
	public List<Client> getClients(){
		return clientService.findAll();
	}

	@PostMapping("saveclient")
	public Client save(@RequestParam("id") String id,@RequestParam("last") String lastname,@RequestParam("first") String firstname,@RequestParam("code") String codeClient){
		return clientService.save(new Client(Integer.parseInt(id),lastname,firstname,codeClient));
	}
}
