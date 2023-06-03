package com.te.common.utils;

import com.te.common.exception.BusinessException;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 字符串工具类
 * @createDate 2023/5/31 23:19
 * @since 1.0.0
 */
public class StringUtil {

    private StringUtil() {
        // 防止被实例化
        throw new BusinessException("can't instantiate StringUtil");
    }

    /**
     * 判断字符串是否是空字符串
     * @param str String
     * @return True-是, False-否
     */
    public static boolean isEmpty(String str) {
        return null == str || str.isEmpty();
    }
}
