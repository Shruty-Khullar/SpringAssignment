package com.shruty.demo.controller.dto;

import java.time.LocalDateTime;

public class ReportingInfoRequestDto {
	private Boolean immRep;
	private String notifMethod;
	private Integer repPeriod;
	private String monDur;
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

	public String getMonDur() {
		return monDur;
	}

	public void setMonDur(String monDur) {
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
    public ReportingInfoRequestDto() {
    	
    }
	public ReportingInfoRequestDto(Boolean immRep, String notifMethod, Integer repPeriod, String monDur,
			Integer sampratio, Integer grpRepTime) {
		super();
		this.immRep = immRep;
		this.notifMethod = notifMethod;
		this.repPeriod = repPeriod;
		this.monDur = monDur;
		this.sampratio = sampratio;
		this.grpRepTime = grpRepTime;
	}

}
