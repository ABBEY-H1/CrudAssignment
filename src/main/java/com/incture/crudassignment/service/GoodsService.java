package com.incture.crudassignment.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.crudassignment.entity.Goods;
import com.incture.crudassignment.repository.GoodsRepository;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsRepository goodsRepository;
	
	public Goods saveGood(Goods good) {
		return goodsRepository.save(good);
	}
	
	public  List<Goods> saveGoods(List<Goods> goods) {
		return goodsRepository.saveAll(goods);
	}
	
	public Goods getGoodById(int id) {
		return goodsRepository.findById(id).orElse(null);
	}
	
	public List<Goods> getAllGoods() {
		return goodsRepository.findAll();
	}
	
	public List<Goods> getGoodsByName(String name) {
		return goodsRepository.findByName(name);
	}
	
	public Goods updateGoods(Goods good) {
	    Goods prevGoods = goodsRepository.findById(good.getId()).orElse(null);
	        prevGoods.setName(good.getName());
	        prevGoods.setPrice(good.getPrice());
	        prevGoods.setStock(good.getStock());
	        return goodsRepository.save(prevGoods);
	}
	
	public void deleteGood(int id) {
		goodsRepository.deleteById(id);
	}

		


}
