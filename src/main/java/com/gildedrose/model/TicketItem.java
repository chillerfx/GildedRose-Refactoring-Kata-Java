package com.gildedrose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class TicketItem extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	public TicketItem(String name, @PositiveOrZero(message = "Sell-in should be a positive number") int sellIn,
			@Min(value = 0, message = "Ticket item quality should not be less than 0") @Max(value = 50, message = "Ticket item quality should not be more than 50") int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		int maxQuality = 50;
		if (this.sellIn <= 0 && this.quality >= 0) {
			this.quality = 0;
		} else if (this.quality <= maxQuality) {
			if (this.sellIn <= 10 && this.sellIn > 5) {
				this.sellIn--;
				this.quality = this.quality + 2;
			} else {
				this.sellIn--;
				this.quality = this.quality + 3;
			}
			if (this.quality >= maxQuality) {
				this.quality =  maxQuality;
			}
		}
	}
}
