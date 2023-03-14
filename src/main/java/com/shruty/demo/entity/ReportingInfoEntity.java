package com.shruty.demo.entity;

import java.security.Timestamp;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="reportinginfo")
public class ReportingInfoEntity {
	@Id
	@Column(name = "reportingInfoId")
	@GeneratedValue(strategy = GenerationType.UUID)
	private String reportingInfoId;

	@OneToOne(mappedBy="reportingInfo")
	@JsonIgnore

	private SubscriptionEntity subscription;

	private Boolean immRep;
	private String notifMethod;
	private Integer repPeriod;
	private Instant monDur;
	private Integer sampratio;
	private Integer grpRepTime;
	public Boolean getImmRep() {
		return immRep;
	}
	public void setImmRep(Boolean immRep) {
		this.immRep = immRep;
	}
	public String getNotifMethod() {
		return notifMethod;
	}
	public void setNotifMethod(String notifMethod) {
		this.notifMethod = notifMethod;
	}
	public Integer getRepPeriod() {
		return repPeriod;
	}
	public void setRepPeriod(Integer repPeriod) {
		this.repPeriod = repPeriod;
	}
	public Instant getMonDur() {
		return monDur;
	}
	public void setMonDur(Instant monDur) {
		this.monDur = monDur;
	}
	public Integer getSampratio() {
		return sampratio;
	}
	public void setSampratio(Integer sampratio) {
		this.sampratio = sampratio;
	}
	public Integer getGrpRepTime() {
		return grpRepTime;
	}
	public void setGrpRepTime(Integer grpRepTime) {
		this.grpRepTime = grpRepTime;
	}
	
	public String getReportingInfoId() {
		return reportingInfoId;
	}
	public void setReportingInfoId(String reportingInfoId) {
		this.reportingInfoId = reportingInfoId;
	}
	
	public SubscriptionEntity getSubscription() {
		return subscription;
	}
	public void setSubscription(SubscriptionEntity subscription) {
		this.subscription = subscription;
	}
	public ReportingInfoEntity() {
		
	}
	public ReportingInfoEntity(String reportingInfoId, SubscriptionEntity subscription, Boolean immRep, String notifMethod,
			Integer repPeriod, Instant monDur, Integer sampratio, Integer grpRepTime) {
		super();
		this.reportingInfoId = reportingInfoId;
		this.subscription = subscription;
		this.immRep = immRep;
		this.notifMethod = notifMethod;
		this.repPeriod = repPeriod;
		this.monDur = monDur;
		this.sampratio = sampratio;
		this.grpRepTime = grpRepTime;
	}
	

}
