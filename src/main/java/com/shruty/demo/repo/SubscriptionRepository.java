package com.shruty.demo.repo;

import java.util.Optional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruty.demo.entity.SubscriptionEntity;
@Repository
public interface SubscriptionRepository extends JpaRepository<SubscriptionEntity,String>{

	
	Optional<SubscriptionEntity> findBySubscriptionId(String subscriptionId);

}
