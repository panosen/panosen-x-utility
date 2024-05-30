package com.panosen.utility;

import java.util.List;

/**
 * 合成字符串工具
 *
 */
public final class StringJoiner {

    /**
     * 用指定字符串作为分隔符合成数组中的内容
     *
     * @param separator
     * @param values
     * @return
     */
    public static <T> String join(String separator, List<T> values) {

        StringBuilder builder = new StringBuilder();

        if (values != null && values.size() > 0) {

            int size = values.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    builder.append(separator);
                }
                builder.append(values.get(i));
            }
        }

        return builder.toString();
    }
}
