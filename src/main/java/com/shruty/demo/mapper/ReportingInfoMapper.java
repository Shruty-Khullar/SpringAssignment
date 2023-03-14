package com.shruty.demo.mapper;

import java.time.Instant;

import org.springframework.stereotype.Component;

import com.shruty.demo.controller.dto.ReportingInfoRequestDto;
import com.shruty.demo.entity.ReportingInfoEntity;

@Component
public class ReportingInfoMapper {
     public ReportingInfoEntity toEntity(ReportingInfoRequestDto requestDto) {
    	 ReportingInfoEntity obj = new ReportingInfoEntity();
    	 obj.setGrpRepTime(requestDto.getGrpRepTime());
    	 obj.setImmRep(requestDto.getImmRep());
    	 obj.setMonDur(Instant.parse(requestDto.getMonDur()));
    	 obj.setNotifMethod(requestDto.getNotifMethod());
    	 obj.setRepPeriod(requestDto.getRepPeriod());
    	 obj.setSampratio(requestDto.getSampratio());
    	 return obj;
     }
}
