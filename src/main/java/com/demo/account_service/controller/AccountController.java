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

	@Value("${server.port}")
	private String port;

	@Value("${config.message}")
	private String message;


	@GetMapping("/config")
	public String displayConfigMessage() {
		return "account-service called successfully !!!, Property fetch from - " + message;
	}

	@GetMapping("/resttemplate")
	public String displayMessage() {
		return "Account-Service called successfully By Rest Template !!! Port -" + port;

	}

	@GetMapping("/feign")
	public String displayFeignClientMessage() {
		return "Account-Service called successfully By Feign Client !!! Port -" + port;

	}
}
