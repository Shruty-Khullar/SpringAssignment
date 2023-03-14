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
@Table(name="extrareportreq")
public class ExtraReportReqEntity {
	@Id
	@Column(name="extraReportReqId")
	@GeneratedValue(strategy = GenerationType.UUID)
	private String extraReportReqId;
	
	@OneToOne(mappedBy="extraReportReq")
	@JsonIgnore

	private SubscriptionEntity subscription;
	private String accuracy;
	private Instant startTs;
	private Instant endTs;
	private Integer maxSupiNbr;
	private Integer maxObjectNbr;
	private Integer sampRatio;
	private Instant timeAnaNeeded;
	public String getExtraReportReqId() {
		return extraReportReqId;
	}
	public void setExtraReportReqId(String extraReportReqId) {
		this.extraReportReqId = extraReportReqId;
	}
	
	
	public SubscriptionEntity getSubscription() {
		return subscription;
	}
	public void setSubscription(SubscriptionEntity subscription) {
		this.subscription = subscription;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public Instant getStartTs() {
		return startTs;
	}
	public void setStartTs(Instant startTs) {
		this.startTs = startTs;
	}
	public Instant getEndTs() {
		return endTs;
	}
	public void setEndTs(Instant endTs) {
		this.endTs = endTs;
	}
	public Integer getMaxSupiNbr() {
		return maxSupiNbr;
	}
	public void setMaxSupiNbr(Integer maxSupiNbr) {
		this.maxSupiNbr = maxSupiNbr;
	}
	public Integer getMaxObjectNbr() {
		return maxObjectNbr;
	}
	public void setMaxObjectNbr(Integer maxObjectNbr) {
		this.maxObjectNbr = maxObjectNbr;
	}
	public Integer getSampRatio() {
		return sampRatio;
	}
	public void setSampRatio(Integer sampRatio) {
		this.sampRatio = sampRatio;
	}
	public Instant getTimeAnaNeeded() {
		return timeAnaNeeded;
	}
	public void setTimeAnaNeeded(Instant timeAnaNeeded) {
		this.timeAnaNeeded = timeAnaNeeded;
	}
	public ExtraReportReqEntity() {
		
	}
	public ExtraReportReqEntity(String extraReportReqId, SubscriptionEntity subscription, String accuracy, Instant startTs,
			Instant endTs, Integer maxSupiNbr, Integer maxObjectNbr, Integer sampRatio,
			Instant timeAnaNeeded) {
		super();
		this.extraReportReqId = extraReportReqId;
		this.subscription = subscription;
		this.accuracy = accuracy;
		this.startTs = startTs;
		this.endTs = endTs;
		this.maxSupiNbr = maxSupiNbr;
		this.maxObjectNbr = maxObjectNbr;
		this.sampRatio = sampRatio;
		this.timeAnaNeeded = timeAnaNeeded;
	}
	
	
	
}

