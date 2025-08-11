package com.gopi.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCal myCalc = new JenkinsCal();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	// @Test
	// public void subtractTest() {
	// 	JenkinsCal myCalc = new JenkinsCal();
	// 	assertEquals(5, myCalc.subtractNumbers(10, 5));
	// }

}
