package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gildedrose.model.EverydayItem;
import com.gildedrose.model.Item;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new EverydayItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

}
