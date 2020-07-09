package com.wipro.juint.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.juint.task.DailyTasks;

public class test3 {
	@Test
	public void testcon()
	{
		DailyTasks d12= new DailyTasks();
		assertEquals("hi bye",d12.doStringConcat("hi", "bye"));
	}
}
