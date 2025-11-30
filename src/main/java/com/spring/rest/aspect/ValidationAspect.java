package com.spring.rest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

  public static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

  @Around("execution(* com.spring.rest.service.JobService.getJob(..)) && args(postId)")
  public Object validateAndUpdate(ProceedingJoinPoint pjp, int postId) throws Throwable {
    if (postId < 0) {
      LOGGER.info("PostId is negative, updating it");
      postId = -postId;
      LOGGER.info("new Value " + postId);
    }
    Object obj = pjp.proceed(new Object[]{postId});
    return obj;
  }
}

