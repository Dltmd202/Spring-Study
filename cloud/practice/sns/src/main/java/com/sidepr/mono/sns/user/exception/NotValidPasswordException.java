package com.sidepr.mono.sns.user.exception;


import com.sidepr.mono.sns.global.error.ErrorCode;
import com.sidepr.mono.sns.global.error.exception.BusinessException;

public class NotValidPasswordException extends BusinessException {

    public NotValidPasswordException(ErrorCode errorCode) {
        super(errorCode);
    }
}
