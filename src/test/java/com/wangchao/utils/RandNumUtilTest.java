package com.wangchao.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testRandom() {
		int i = RandNumUtil.random(1, 120);
		System.out.println(i);
		
	}

}
