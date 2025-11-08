package com.web.anil;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	@GetMapping("/welcome")
	public ResponseEntity<String> getMsg() {
		String s = "This web application was created by Anil Kumar";
		return ResponseEntity.ok(s);
	}

}