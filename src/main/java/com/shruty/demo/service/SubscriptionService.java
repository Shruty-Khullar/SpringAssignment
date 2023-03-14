package com.shruty.demo.service;

import com.shruty.demo.controller.dto.CreateSubscriptionRequestDto;
import com.shruty.demo.entity.SubscriptionEntity;

public interface SubscriptionService {
	SubscriptionEntity createSubscription(CreateSubscriptionRequestDto requestDto);
	SubscriptionEntity readSubscription(String subscriptionId);
	//SubscriptionEntity updateSubscription(String subscriptionId);
}
