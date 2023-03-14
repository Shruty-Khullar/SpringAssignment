package com.shruty.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruty.demo.controller.dto.CreateSubscriptionRequestDto;
import com.shruty.demo.entity.SubscriptionEntity;
import com.shruty.demo.mapper.SubscriptionMapper;
import com.shruty.demo.repo.SubscriptionRepository;
import com.shruty.demo.service.SubscriptionService;
@Service
public class SubscriptionServiceImpl implements SubscriptionService{
    @Autowired
	private SubscriptionMapper subscriptionMapper;
    
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    
	@Override
	public SubscriptionEntity createSubscription(CreateSubscriptionRequestDto requestDto) {
		SubscriptionEntity entity = subscriptionMapper.toEntity(requestDto);
		return subscriptionRepository.save(entity);
		
	}
	
	@Override
	public SubscriptionEntity readSubscription(String subscriptionId) {
		SubscriptionEntity entity = subscriptionRepository.findBySubscriptionId(subscriptionId).
				                    orElseThrow(() -> new RuntimeException("No Subscription with id"+subscriptionId));
		return entity;
		
	}
	
	 
	 
}
