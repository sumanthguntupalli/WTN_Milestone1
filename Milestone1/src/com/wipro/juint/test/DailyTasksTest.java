package com.wipro.juint.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wipro.juint.task.DailyTasks;

public class DailyTasksTest {	
	@Test
	public void testdoStringConcat() {
		DailyTasks d= new DailyTasks();
		assertEquals(true, d.checkPresence("hello", "ell"));
	}
	
	
}
