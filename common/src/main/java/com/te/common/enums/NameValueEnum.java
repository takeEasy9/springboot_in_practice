package com.te.common.enums;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 带有枚举值以即枚举名称的枚举接口
 * @createDate 2023/5/31 22:43
 * @since 1.0.0
 */
public interface NameValueEnum<T> extends ValueEnum<T> {

    /**
     * 获取枚举名称
     * @return 枚举名称
     */
    String getName();
}
