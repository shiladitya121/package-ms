package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GetActivePackageResponse;
import com.example.demo.service.PackageService;

@RestController
@RequestMapping("/api/package/v1")
public class PackageController {

	@Autowired
	private PackageService packageService;
	
	@GetMapping(path = "/active", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetActivePackageResponse> getAllActivePackages(){
		GetActivePackageResponse response = packageService.getAllActivePackages();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
