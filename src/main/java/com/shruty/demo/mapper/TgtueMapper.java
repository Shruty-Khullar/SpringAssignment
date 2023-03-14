package com.shruty.demo.mapper;

import org.springframework.stereotype.Component;

import com.shruty.demo.controller.dto.TgtUeRequestDto;
import com.shruty.demo.entity.TgtUeEntity;

@Component
public class TgtueMapper {
     public TgtUeEntity toEntity(TgtUeRequestDto requestDto) {
    	 TgtUeEntity obj = new TgtUeEntity();
    	 obj.setSupis(requestDto.getSupis());
    	 return obj;
     }
}
