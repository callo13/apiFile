package com.example.ApiFile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
public class DocController {
	@Autowired
	private DocRepository docRepository;
	
	@RequestMapping(value="/addDocs", method=RequestMethod.POST)
	public Documents adduser(@RequestBody MultipartFile file){
		return docRepository.saveFile(file);
	}
	@RequestMapping(value="/getDocs", method=RequestMethod.GET)
	public List<Documents> getdocs(){
		return docRepository.findAll();
	}
	@RequestMapping(value="/getDocs/{id}", method=RequestMethod.GET)
	public Optional<Documents> getdocbyid(@PathVariable Integer id){
		return docRepository.findById(id);
	}
	@RequestMapping(value="/getDoc/{name}", method=RequestMethod.GET)
	public Documents getdocbyname(@PathVariable String name){
		return docRepository.findBydocName(name);
	}
	

}
