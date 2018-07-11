package com.hefeng.springbatch.tasklet;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.hefeng.springbatch.constant.Constant;


public class Reader implements ItemReader<String> {
	
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		Constant.decrement();
		System.out.println("reader excuted :"+ Constant.get());
		if(Constant.get() < 0) {
			return null;
		}
		return "next is processor";
	}

}
