package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Image;
@Repository
public interface ImageRepo extends CrudRepository<Image, String>{

}
