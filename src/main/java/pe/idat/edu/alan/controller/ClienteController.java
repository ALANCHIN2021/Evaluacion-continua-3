package pe.idat.edu.alan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.alan.model.Cliente;
import pe.idat.edu.alan.service.ClienteService;

@Controller
@RequestMapping(path = "/cliente/v1")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Cliente>> listar(){
		return new ResponseEntity<List<Cliente>>(service.listarCliente(), HttpStatus.OK);
	}

}
