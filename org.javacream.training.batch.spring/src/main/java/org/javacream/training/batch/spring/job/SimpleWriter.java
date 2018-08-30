package org.javacream.training.batch.spring.job;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class SimpleWriter implements ItemWriter<Integer>{

	@Override
	public void write(List<? extends Integer> items) throws Exception {
		System.out.println("Items: " + items);
	}
	

}