package com.panosen.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串分隔工具
 */
public final class StringSpliter {

    /**
     * 将指定字符串分割成由若干个数字组成的数组
     *
     * @param ids 需要分割的字符串
     * @return 分割成的数组
     */
    public static List<Integer> toIntList(String ids) {
        return toIntList(ids, ",");
    }

    /**
     * 将指定字符串分割成由若干个数字组成的数组
     *
     * @param ids 需要分割的字符串
     * @return 分割成的数组
     */
    public static List<Long> toLongList(String ids) {
        return toLongList(ids, ",");
    }

    /**
     * 将用逗号分隔的数字转换为int数组
     *
     * @param ids
     * @return
     */
    public static List<Integer> toIntList(String ids, String regex) {
        if (ids == null || ids.isEmpty()) {
            return null;
        }

        String[] items = ids.split(regex);

        List<Integer> integers = new ArrayList<>();
        for (String item : items) {
            if (item == null || item.isEmpty()) {
                continue;
            }
            integers.add(Integer.valueOf(item));
        }

        return integers;
    }

    /**
     * 将用逗号分隔的数字转换为int数组
     *
     * @param ids
     * @return
     */
    public static List<Long> toLongList(String ids, String regex) {
        if (ids == null || ids.isEmpty()) {
            return new ArrayList<>();
        }

        String[] items = ids.split(regex);

        List<Long> integers = new ArrayList<>();
        for (String item : items) {
            if (item == null || item.isEmpty()) {
                continue;
            }
            integers.add(Long.valueOf(item));
        }

        return integers;
    }
}
