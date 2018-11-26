package com.gildedrose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gildedrose.model.Item;
import com.gildedrose.repository.ItemRepo;

import java.util.List;

@RestController()
public class GildedRoseController {

	@Autowired 
	ItemRepo itemRepo;

	@RequestMapping(value="/", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Item> index() {
		List<Item> items = itemRepo.findAll(); 
   		return items;
    }

}
