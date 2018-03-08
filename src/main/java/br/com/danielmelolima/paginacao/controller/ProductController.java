package br.com.danielmelolima.paginacao.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.danielmelolima.paginacao.repository.ProductRepository;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> list(Pageable pageable){
		return new ResponseEntity<>(repository.findAll(pageable), HttpStatus.OK);
	}
	
	@RequestMapping(value= "/all", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listAll(){
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}

}
