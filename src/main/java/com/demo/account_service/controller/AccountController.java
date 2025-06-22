package com.demo.account_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RefreshScope
public class AccountController {

	@Value("${location.name}")
	private String locationName;

	@GetMapping
	public String displayMessage() {
		return "account-service called successfully !!!, Property fetch from - " + locationName;
	}
}
