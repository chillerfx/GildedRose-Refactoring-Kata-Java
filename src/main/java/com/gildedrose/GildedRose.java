package com.gildedrose;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.gildedrose.model.Item;

@SpringBootApplication
class GildedRose {

	public void main(String[] args) {
	   SpringApplicationBuilder application = new SpringApplicationBuilder(GildedRose.class);
	   application.run(args);
    }

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			item.updateQuality();
		}
	}
}