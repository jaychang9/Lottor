package com.blueskykong.tm.core.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author keets
 */
@FunctionalInterface
public interface AspectTransactionService {

    /**
     * 切面方法调用
     *
     * @param transactionGroupId 事务组id
     * @param point              切点
     * @return Object
     * @throws Throwable 异常信息
     */
    Object invoke(String transactionGroupId, ProceedingJoinPoint point) throws Throwable;
}