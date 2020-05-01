package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.Item;
@Repository
@EnableTransactionManagement
public interface ItemRepository extends CrudRepository<Item,Integer>{

}
