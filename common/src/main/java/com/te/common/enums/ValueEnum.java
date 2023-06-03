package com.te.common.enums;

import javax.annotation.Resource;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 最简单的枚举类, 即只包含value的枚举
 * @createDate 2023/5/31 22:37
 * @since 1.0.0
 */
@Resource
public interface ValueEnum<T> {

    /**
     * 获取枚举值
     *
     * @return 枚举值
     */
    T getValue();
}
