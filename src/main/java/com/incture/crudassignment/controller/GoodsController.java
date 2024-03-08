package com.incture.crudassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incture.crudassignment.entity.Goods;
import com.incture.crudassignment.service.GoodsService;


@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@PostMapping("/addGood")
	public Goods addGood(@RequestBody Goods good) {
		return goodsService.saveGood(good);
	}
	
	@PostMapping("/addAllGoods")
	public List<Goods> addAllGoods(@RequestBody List<Goods> goods) {
		return goodsService.saveGoods(goods);
	}
	
	@GetMapping("/getGoodById/{id}")
	public Goods getGoodById(@PathVariable int id) {
		return goodsService.getGoodById(id);
	}
	
	@GetMapping("/getGoodByName/{name}")
	public List<Goods> getGoodByName(@PathVariable String name) {
		return goodsService.getGoodsByName(name);
	}
	
	@GetMapping("/getAllGoods")
	public List<Goods> getAllGoods() {
		return goodsService.getAllGoods();
	}
	
	@DeleteMapping("/deleteGood/{id}")
	public void deleteGoodById(@PathVariable int id) {
		goodsService.deleteGood(id);
	}
	
	@PutMapping("/updateGood")
	public Goods updateGood(@RequestBody Goods good) {
		return goodsService.updateGoods(good);
	}
}
