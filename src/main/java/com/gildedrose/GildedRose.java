package com.gildedrose;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.gildedrose.model.Item;

@SpringBootApplication
@ComponentScan(basePackages="com.gildedrose.controller")
class GildedRose {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(GildedRose.class).profiles("dev").run();
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