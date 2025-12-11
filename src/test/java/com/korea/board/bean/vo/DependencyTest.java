package com.korea.board.bean.vo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class DependencyTest {
	
	@Autowired
	ClassRoom cr;
	
	@Test
	public void testDependency() {
		log.info("ClassRoom : " + cr);
		Desk myDesk = new Desk();
		myDesk.setName("Norway");
		myDesk.setMaterial("Iron");
		cr.setDesk1(myDesk);
		
		cr.getDesk2().setName("Sweden");
		cr.getDesk2().setMaterial("IKEA");
		log.info("ClassRoom : " + cr);
	}
	
}
