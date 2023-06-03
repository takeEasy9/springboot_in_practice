package com.te.common.exception;

import com.te.common.enums.ValueEnum;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 错误编码
 * @createDate 2023/6/3 16:04
 * @since 1.0.0
 */
public enum ErrorCode implements ValueEnum<String> {

    /**
     * 系统运行成功
     */
    SYSTEM_SUCCESS("SYS0000"),
    /**
     * 系统运行失败
     */
    SYSTEM_FAILED("SYS0001"),
    ;

    private final String code;

    ErrorCode(String code) {
        this.code = code;
    }

    @Override
    public String getValue() {
        return this.code;
    }
}
