package com.hefeng.springbatch.tasklet;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, Integer> {

	public Integer process(String item) throws Exception {
		System.out.println(item);
		System.out.println("processor excuted");
		return 102908;
	}

}
