package com.mdc.beans;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : Costel DRAGU
 * @package : com.mdc.beans
 * @copyright Copyright (c) 2018
 * @date : 17.01.2018 19:52
 */
@Component
public class SimpleBean implements InitializingBean {
    private static final  Logger LOGGER = LoggerFactory.getLogger(SimpleBean.class);

    SimpleBean() {
        LOGGER.info("SimpleBean.constructor()");

    }

    @PostConstruct
    public void init() {
        LOGGER.info("SimpleBean.init()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("SimpleBean.afterPropertiesSet()");
    }

    @PreDestroy
    public void destroy() {
        LOGGER.info("SimpleBean.destroy()");
    }
}
