package com.wipro.juint.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.juint.task.DailyTasks;

public class test2 {
	@Test
	public void testsortValues() {
		DailyTasks d1= new DailyTasks();
		int in[]= {3,2,1};
		int out[]= {1,2,3};
		assertArrayEquals( out, d1.sortValues(in) );
	}
}
