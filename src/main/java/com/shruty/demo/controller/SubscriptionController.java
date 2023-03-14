package com.shruty.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.shruty.demo.controller.dto.CreateSubscriptionRequestDto;
import com.shruty.demo.entity.SubscriptionEntity;
import com.shruty.demo.service.SubscriptionService;

@RestController
@RequestMapping("/v1/subscription") 
public class SubscriptionController {
	
	private SubscriptionService subscriptionService;
	
	public SubscriptionController(SubscriptionService subscriptionService) {
		this.subscriptionService=subscriptionService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<SubscriptionEntity> createSubscription(@RequestBody CreateSubscriptionRequestDto requestDto) {
	     return new ResponseEntity<>(subscriptionService.createSubscription(requestDto),HttpStatus.CREATED);
	     
	}
	
	@GetMapping("/read/{subscriptionId}")
	//@ResponseBody
	public ResponseEntity<SubscriptionEntity> readSubscription(@PathVariable("subscriptionId") String subscriptionId) {
		SubscriptionEntity entity = subscriptionService.readSubscription(subscriptionId);
		return new ResponseEntity<>(entity,HttpStatus.OK);
		
	}
	
	//@DeleteMapping("/delete/{subscriptionId}")
	//public void deleteSubscription()
	
	
	
	
	
	
	
}
