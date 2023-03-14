package com.shruty.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subscription")
public class SubscriptionEntity {
	@Id
	@Column(name="subscriptionId")
	@GeneratedValue(strategy=GenerationType.UUID)
	 private String subscriptionId;
     private String event;
     private String notificationMethod;
     private Integer repetitionPeriod;
     
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "extraReportReqId", referencedColumnName = "extraReportReqId")
     private ExtraReportReqEntity extraReportReq;
     
     
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "tgtUeId", referencedColumnName = "tgtUeId")
     private TgtUeEntity tgtUe;
     
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "reportingInfoId", referencedColumnName = "reportingInfoId")
     private ReportingInfoEntity reportingInfo;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getNotificationMethod() {
		return notificationMethod;
	}

	public void setNotificationMethod(String notificationMethod) {
		this.notificationMethod = notificationMethod;
	}

	public Integer getRepetitionPeriod() {
		return repetitionPeriod;
	}

	public void setRepetitionPeriod(Integer repetitionPeriod) {
		this.repetitionPeriod = repetitionPeriod;
	}

	public ExtraReportReqEntity getExtraReportReq() {
		return extraReportReq;
	}

	public void setExtraReportReq(ExtraReportReqEntity extraReportReq) {
		this.extraReportReq = extraReportReq;
	}

	public TgtUeEntity getTgtUe() {
		return tgtUe;
	}

	public void setTgtUe(TgtUeEntity tgtUe) {
		this.tgtUe = tgtUe;
	}

	public ReportingInfoEntity getReportingInfo() {
		return reportingInfo;
	}

	public void setReportingInfo(ReportingInfoEntity reportingInfo) {
		this.reportingInfo = reportingInfo;
	}
	public SubscriptionEntity()
	{
		
	}
	public SubscriptionEntity(String subscriptionId, String event, String notificationMethod, Integer repetitionPeriod,
			ExtraReportReqEntity extraReportReq, TgtUeEntity tgtUe, ReportingInfoEntity reportingInfo) {
		super();
		this.subscriptionId = subscriptionId;
		this.event = event;
		this.notificationMethod = notificationMethod;
		this.repetitionPeriod = repetitionPeriod;
		this.extraReportReq = extraReportReq;
		this.tgtUe = tgtUe;
		this.reportingInfo = reportingInfo;
	}
     
     
     
}
