package com.gildedrose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class LegendaryItem extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	public LegendaryItem(String name, int sellIn,   @Min(value = 79, message = "Legendary item quality should not be less than 79")
    @Max(value = 150, message = "Legendary item quality should not be more than 81") int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {

	}

}
