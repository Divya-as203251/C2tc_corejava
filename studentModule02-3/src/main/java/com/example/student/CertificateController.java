package com.example.student;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CertificateController {
	@Autowired
	private CertificateService service;
	@GetMapping("/certificate")
	public List<Certificate>list()
	{
		return service.listAll();
	}
	@GetMapping("/certificate/{id}")
	public ResponseEntity<Certificate>get(@PathVariable Integer id)
	{
		try {
			Certificate certi=service.get(id);
			return new ResponseEntity<Certificate>(certi,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
		@PostMapping("/certificate")
		public void add(@RequestBody Certificate certi)
		{
			service.save(certi);
		}
		//Updating the value
		@PutMapping("/certificate/{id}")
		public ResponseEntity<?> update(@RequestBody Certificate certi,@PathVariable Integer id)
		{
			try {
				@SuppressWarnings("unused")
				Certificate existCertificate=service.get(id);
				service.save(certi);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		@DeleteMapping("/certificate/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}

}
