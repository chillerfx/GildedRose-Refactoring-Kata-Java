package com.gildedrose.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;
import javax.persistence.Entity;

@Entity
public class ConjuredItem extends Item {

	public ConjuredItem(String name, @PositiveOrZero(message = "Sell in Should be a positive number") int sellIn,
			@Min(value = 0, message = "Conjured item quality should not be less than 0") @Max(value = 50, message = "Conjured item quality should not be more than 50") int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (this.sellIn <= 0 && this.quality >= 0) {
			this.quality = this.quality - 4;
		} else if (this.sellIn > 0) {
			this.sellIn--;
			this.quality = this.quality - 2;
		}
		if (this.quality < 0) {
			this.quality = 0;
		}
	}
}
