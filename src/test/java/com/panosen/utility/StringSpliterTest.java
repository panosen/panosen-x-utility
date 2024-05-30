package com.panosen.utility;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringSpliterTest {

    @Test
    public void toIntList() {
        List<Integer> items = StringSpliter.toIntList("1,2,,3,");
        Assert.assertNotNull(items);
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("1", items.get(0) + "");
        Assert.assertEquals("2", items.get(1) + "");
        Assert.assertEquals("3", items.get(2) + "");
    }

    @Test
    public void toLongList() {
        List<Long> items = StringSpliter.toLongList("1,2,,3,");
        Assert.assertNotNull(items);
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("1", items.get(0) + "");
        Assert.assertEquals("2", items.get(1) + "");
        Assert.assertEquals("3", items.get(2) + "");
    }

    @Test
    public void testToIntList() {
        List<Integer> items = StringSpliter.toIntList("1.2.3.", "\\.");
        Assert.assertNotNull(items);
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("1", items.get(0) + "");
        Assert.assertEquals("2", items.get(1) + "");
        Assert.assertEquals("3", items.get(2) + "");
    }

    @Test
    public void testToLongList() {
        List<Long> items = StringSpliter.toLongList("1.2.3.", "\\.");
        Assert.assertNotNull(items);
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("1", items.get(0) + "");
        Assert.assertEquals("2", items.get(1) + "");
        Assert.assertEquals("3", items.get(2) + "");
    }
}