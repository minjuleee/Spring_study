package com.korea.board.bean.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component		// 나 객체로 만든다음 니가 관리해
@Slf4j
@Data
public class ClassRoom {
	private int no;
	
	@Autowired
	private Desk desk1;
	
	@Autowired
	private Desk desk2;
	
	@Autowired
	private Chair chair1;
	
	@Autowired
	private Chair chair2;
	
	public ClassRoom() {
		log.info("New ClassRoom is opened");
	}
	
	public String toString() {
		return "나 호출하지마 혼난다";
	}
}
