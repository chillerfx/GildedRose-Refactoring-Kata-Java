package com.gildedrose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketItem extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	public TicketItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		
	}

}
