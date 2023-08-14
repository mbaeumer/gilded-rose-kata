package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void updateQuality() {
        Item[] items = new Item[5];
        Item brie = new Item("Aged Brie", 15, 50);
        items[0] = brie;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Item actualItem = items[0];
        assertTrue("Aged brie".equals(actualItem.name));
        assertEquals(actualItem.sellIn, 13);
        assertEquals(actualItem.quality, 49);
    }
}