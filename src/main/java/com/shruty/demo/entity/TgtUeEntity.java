package com.shruty.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tgtUe")
public class TgtUeEntity {
	@Id
	@Column(name="tgtUeId")
	@GeneratedValue(strategy = GenerationType.UUID)
	private String tgtUeId;
	
	@OneToOne(mappedBy="tgtUe")
	@JsonIgnore

	private SubscriptionEntity subscription;

	@ElementCollection
	private List<String> supis;

	public List<String> getSupis() {
		return supis;
	}

	public void setSupis(List<String> supis) {
		this.supis = supis;
	}

	
	public String getTgtUeId() {
		return tgtUeId;
	}

	public void setTgtUeId(String tgtUeId) {
		this.tgtUeId = tgtUeId;
	}

	public SubscriptionEntity getSubscriptionId() {
		return subscription;
	}

	public void setSubscriptionId(SubscriptionEntity subscription) {
		this.subscription = subscription;
	}
	public TgtUeEntity() {
		
	}
	public TgtUeEntity(String tgtUeId, SubscriptionEntity subscription, List<String> supis) {
		super();
		this.tgtUeId = tgtUeId;
		this.subscription = subscription;
		this.supis = supis;
	}

	
	
	
}
