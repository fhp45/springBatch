package com.hefeng.springbatch.tasklet;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<Integer> {

	public void write(List<? extends Integer> items) throws Exception {
		System.out.println("writer excuted");
		
	}

}
