package com.kodilla.patterns3.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns3.facade.api.OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns3.facade.api.OrderFacade.processOrder(..))" + "&& target(object)")
    public void catchEvent(Object object) {
        LOGGER.info("Method " + object.getClass().getName() + " is beeing run");
    }
}
