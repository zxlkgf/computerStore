package com.zxl.store.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zxl
 * @description 操作计时AOP
 * @date 2022/11/10
 */
@Aspect
@Component
public class TimerAspect {
    /*
    * execution(* com.zxl.store.service.Impl.*.*(..))
    *  *表示public protect private default
    *  com.zxl.store.service.Impl.*.* 表示com.zxl.store.service.Impl.所有类，所有方法，不论什么参数
    * */
    @Around("execution(* com.zxl.store.service.Impl.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        // 记录起始时间
        long start = System.currentTimeMillis();
        // 执行连接点方法，即切面所在位置对应的方法。本项目中表示执行注册或执行登录等
        Object result = pjp.proceed();
        // 记录结束时间
        long end = System.currentTimeMillis();
        // 计算耗时
        System.err.println("耗时：" + (end - start) + "ms.");
        // 返回连接点方法的返回值
        return result;
    }
}
