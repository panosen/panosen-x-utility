package com.panosen.utility;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringJoinerTest {

    @Test
    public void join1() {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(100);
        items.add(1000);
        String actual = StringJoiner.join("-", items);
        Assert.assertEquals("1-100-1000", actual);
    }

    @Test
    public void join2() {
        List<String> items = new ArrayList<>();
        items.add("1");
        items.add("100");
        items.add("1000");
        String actual = StringJoiner.join("-", items);
        Assert.assertEquals("1-100-1000", actual);
    }
}