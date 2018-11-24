package com.gildedrose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LegendaryItem extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	public LegendaryItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		
	}

}
