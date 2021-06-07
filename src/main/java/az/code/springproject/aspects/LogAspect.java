package az.code.springproject.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Before("execution(public * *(..))")
    public void executeAspect(){
        logger.info("inside aspect");
    }
}
