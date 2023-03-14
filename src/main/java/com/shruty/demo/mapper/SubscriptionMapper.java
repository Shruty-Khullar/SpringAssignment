package com.shruty.demo.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shruty.demo.controller.dto.CreateSubscriptionRequestDto;
import com.shruty.demo.entity.SubscriptionEntity;
import com.shruty.demo.entity.TgtUeEntity;

@Component
public class SubscriptionMapper {
	@Autowired
	private ExtraReportReqMapper extraReportReqMapper;
	
	@Autowired
	private ReportingInfoMapper reportingInfoMapper;
	
	@Autowired
	private TgtueMapper tgtueMapper;
	
    public SubscriptionEntity toEntity(CreateSubscriptionRequestDto requestDto) {
    	 SubscriptionEntity obj = new SubscriptionEntity();
    	 obj.setEvent(requestDto.getEvent());
    	 obj.setNotificationMethod(requestDto.getNotificationMethod());
    	 obj.setRepetitionPeriod(requestDto.getRepetitionPeriod());
    	 obj.setExtraReportReq(extraReportReqMapper.toEntity(requestDto.getExtraReportReq()));
    	 obj.setReportingInfo(reportingInfoMapper.toEntity(requestDto.getReportingInfo()));
    	 obj.setTgtUe(tgtueMapper.toEntity(requestDto.getTgtUe()));
    	 return obj;
     }
}