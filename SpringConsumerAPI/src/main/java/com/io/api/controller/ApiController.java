package com.io.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.io.api.model.Api;
import com.io.api.service.ApiService;

@RestController
public class ApiController {
	
	
	@Autowired
	private ApiService apiservice;
	
	@RequestMapping("/titulo")
	public List<Api> mostrar(){		
		return apiservice.res();
	}
	
	@RequestMapping(value="/titulo/{id}", method=RequestMethod.GET)
	public List<Api> excluir(@PathVariable int id){
		return apiservice.listaID(id);
	}
	
	
	
	
	

}
