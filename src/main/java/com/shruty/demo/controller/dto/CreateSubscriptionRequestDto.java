package com.shruty.demo.controller.dto;

import com.shruty.demo.entity.ExtraReportReqEntity;
import com.shruty.demo.entity.ReportingInfoEntity;
import com.shruty.demo.entity.TgtUeEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CreateSubscriptionRequestDto {
	
     private String event;
     private String notificationMethod;
     private Integer repetitionPeriod;
     
     private ExtraReportReqRequestDto extraReportReq;
     
     private TgtUeRequestDto tgtUe;
    
     private ReportingInfoRequestDto reportingInfo;

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

	


	public ExtraReportReqRequestDto getExtraReportReq() {
		return extraReportReq;
	}

	public void setExtraReportReq(ExtraReportReqRequestDto extraReportReq) {
		this.extraReportReq = extraReportReq;
	}

	public TgtUeRequestDto getTgtUe() {
		return tgtUe;
	}

	public void setTgtUe(TgtUeRequestDto tgtUe) {
		this.tgtUe = tgtUe;
	}

	public ReportingInfoRequestDto getReportingInfo() {
		return reportingInfo;
	}

	public void setReportingInfo(ReportingInfoRequestDto reportingInfo) {
		this.reportingInfo = reportingInfo;
	}
	public CreateSubscriptionRequestDto() {
		
	}
	public CreateSubscriptionRequestDto(String event, String notificationMethod, Integer repetitionPeriod,
			ExtraReportReqRequestDto extraReportReq, TgtUeRequestDto tgtUe, ReportingInfoRequestDto reportingInfo) {
		super();
		this.event = event;
		this.notificationMethod = notificationMethod;
		this.repetitionPeriod = repetitionPeriod;
		this.extraReportReq = extraReportReq;
		this.tgtUe = tgtUe;
		this.reportingInfo = reportingInfo;
	}

	
     
}
