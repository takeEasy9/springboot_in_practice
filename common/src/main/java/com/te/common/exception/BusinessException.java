package com.te.common.exception;

import com.te.common.enums.NameValueEnum;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 自定义业务异常
 * @createDate 2023/6/3 15:57
 * @since 1.0.0
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final String code;

    private final String msg;

    public BusinessException(String msg) {
        super(msg);
        this.code = null;
        this.msg = msg;

    }

    public BusinessException(NameValueEnum<String> errorCodeAndMsg) {
        super(errorCodeAndMsg.getName());
        this.code = errorCodeAndMsg.getValue();
        this.msg = errorCodeAndMsg.getName();

    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
