package com.gildedrose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class AgingItem extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	public AgingItem(String name, @PositiveOrZero(message = "Sell in should be a positive number") int sellIn,
			@Min(value = 79, message = "Aging item quality should not be less than 0") @Max(value = 150, message = "Aging item quality should not be more than 50") int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (this.sellIn <= 0 && this.quality >= 0) {
			this.quality = this.quality++;
		} else if (this.quality <= 50) {
			this.sellIn--;
			this.quality++;
		}
	}

}
