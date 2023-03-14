package com.shruty.demo.controller.dto;

import java.util.List;

import jakarta.persistence.ElementCollection;

public class TgtUeRequestDto {
	@ElementCollection
	private List<String> supis;
	
    public TgtUeRequestDto() {
    	
    }
	public TgtUeRequestDto(List<String> supis) {
		super();
		this.supis = supis;
	}

	public List<String> getSupis() {
		return supis;
	}

	public void setSupis(List<String> supis) {
		this.supis = supis;
	}
}
