package com.shruty.demo.mapper;

import java.time.Instant;

import org.springframework.stereotype.Component;

import com.shruty.demo.controller.dto.ExtraReportReqRequestDto;
import com.shruty.demo.entity.ExtraReportReqEntity;

@Component
public class ExtraReportReqMapper {
	public ExtraReportReqEntity toEntity(ExtraReportReqRequestDto requestDto) {
		ExtraReportReqEntity obj = new ExtraReportReqEntity();
		obj.setAccuracy(requestDto.getAccuracy());
		obj.setEndTs(Instant.parse(requestDto.getEndTs()));
		obj.setMaxObjectNbr(requestDto.getMaxObjectNbr());
		obj.setMaxSupiNbr(requestDto.getMaxSupiNbr());
		obj.setSampRatio(requestDto.getSampRatio());
		obj.setStartTs(Instant.parse(requestDto.getStartTs()));
		obj.setTimeAnaNeeded(Instant.parse(requestDto.getTimeAnaNeeded()));
		return obj;		
		
	}

}
