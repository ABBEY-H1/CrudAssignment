package com.incture.crudassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.crudassignment.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Integer>{

	List<Goods> findByName(String name);

}
