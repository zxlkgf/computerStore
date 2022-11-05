package com.zxl.store.service.ex;

/**
 * @author zxl
 * @description 验证码错误异常
 * @date 2022/10/30
 */
public class ValidCodeNotMatchException extends ServiceException {
    public ValidCodeNotMatchException() {
        super();
    }

    public ValidCodeNotMatchException(String message) {
        super(message);
    }

    public ValidCodeNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidCodeNotMatchException(Throwable cause) {
        super(cause);
    }

    protected ValidCodeNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
