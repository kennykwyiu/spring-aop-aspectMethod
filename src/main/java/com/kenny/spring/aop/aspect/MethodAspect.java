package com.kenny.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodAspect {
    public void printExecutionTime(JoinPoint joinPoint) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String now = simpleDateFormat.format(new Date());
        String className = joinPoint.getTarget().getClass().getName();// get the target class name
        String methodName = joinPoint.getSignature().getName(); // get the target method name
        System.out.println("---->" + now + ":" + className + "." + methodName);

    }
}
