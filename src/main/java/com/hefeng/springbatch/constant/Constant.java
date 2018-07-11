package com.hefeng.springbatch.constant;

import java.util.concurrent.atomic.AtomicInteger;

public class Constant {
	
	
	private static AtomicInteger flag =  new AtomicInteger(10);
	
	public static void decrement() {
		flag.decrementAndGet();
	}
	 
	public static int get() {
		return flag.get();
	}
}
