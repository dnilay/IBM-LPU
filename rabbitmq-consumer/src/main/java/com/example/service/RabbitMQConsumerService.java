package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Item;
import com.example.repo.ItemRepository;

@Service
public class RabbitMQConsumerService {
	private static final String QUEUE = "items-queue";
	private ItemRepository itemRepository;
	private List<Item> items=new ArrayList<Item>();
	@Autowired
	public RabbitMQConsumerService(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}


	@RabbitListener(queues = QUEUE)
	@Transactional
	public void receiveMessage(Item item) {

		items.add(item);
		System.out.println("Received Message from Items Queue >>" + item);
		if(!items.isEmpty())
		{
			for(Item i:items)
			{
				itemRepository.save(i);
			}
		}
		
	}
}
