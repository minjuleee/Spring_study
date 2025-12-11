package com.korea.board.bean.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chair {
	private String name;
	private int numOfLegs;
	
	public Chair() {
		this.name = "Tom Sawyer";
		this.numOfLegs = 4;
		System.out.println("I Created a Chair");
	}
}
