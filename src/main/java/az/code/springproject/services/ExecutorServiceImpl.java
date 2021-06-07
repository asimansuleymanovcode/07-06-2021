package az.code.springproject.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ExecutorServiceImpl implements ExecuteService{

    @Value("#{5 + 5}")
    int myName;
    int count = 0;
    Logger logger = LoggerFactory.getLogger(ExecutorServiceImpl.class);
    @Override
    public void execute() {
        count++;
        logger.info("execute on ExecutorServiceImpl, myName=" + myName);
    }

    @Override
    public int getCount() {
        return count;
    }
}
