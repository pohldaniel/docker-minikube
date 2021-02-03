package de.app.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


@RestController
@RequestMapping("/restAPI/test")
public class TestController {

	@RequestMapping(value = "/execute", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> execute() {
		
		ObjectMapper mapper = new ObjectMapper();	
					 			
		ObjectNode statusMap = mapper.createObjectNode();
		statusMap.put("message", "Hello From Test-App");
		statusMap.put("status", "200");
			
		return ResponseEntity.ok(statusMap);		
	}
}
