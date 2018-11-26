package com.gildedrose.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public void updateQuality() {
		throw new Error("Do not use base class to update Quality, use subclass method for that or implement new subclass for your Item type");	
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}
	

}
