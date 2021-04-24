package com.cg.login.controller;

import javax.validation.Valid;

//import org.hibernate.annotations.common.util.impl.Log_.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.cg.entity.Asset;

@RestController
@RequestMapping("/admin")

public class AdminController {
@Autowired
private RestTemplate rest;
 

	@GetMapping(value = "/findallasset")
	public ResponseEntity<String> findAllAsset() {
		//logger.info("get all Respondent from admin controller");
		//String Respondent = rest.getForObject("http://localhost:1243/admin/viewallrespondent", String.class);
		String Respondent = rest.getForObject("http://localhost:1300/admin/findAllAsset", String.class);
		return ResponseEntity.ok(Respondent);
	}
	

}
