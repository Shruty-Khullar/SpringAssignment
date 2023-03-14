package com.shruty.demo.controller.dto;

import java.time.LocalDateTime;

public class ExtraReportReqRequestDto {
	private String accuracy;
	private String startTs;
	private String endTs;
	private Integer maxSupiNbr;
	private Integer maxObjectNbr;
	private Integer sampRatio;
	private String timeAnaNeeded;
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getStartTs() {
		return startTs;
	}
	public void setStartTs(String startTs) {
		this.startTs = startTs;
	}
	public String getEndTs() {
		return endTs;
	}
	public void setEndTs(String endTs) {
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
	public String getTimeAnaNeeded() {
		return timeAnaNeeded;
	}
	public void setTimeAnaNeeded(String timeAnaNeeded) {
		this.timeAnaNeeded = timeAnaNeeded;
	}
	public ExtraReportReqRequestDto(){
	} 
	public ExtraReportReqRequestDto(String accuracy, String startTs, String endTs,
			Integer maxSupiNbr, Integer maxObjectNbr, Integer sampRatio, String timeAnaNeeded) {
		super();
		this.accuracy = accuracy;
		this.startTs = startTs;
		this.endTs = endTs;
		this.maxSupiNbr = maxSupiNbr;
		this.maxObjectNbr = maxObjectNbr;
		this.sampRatio = sampRatio;
		this.timeAnaNeeded = timeAnaNeeded;
	}

}
