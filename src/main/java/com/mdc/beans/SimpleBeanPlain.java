package com.mdc.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : Costel DRAGU
 * @package : com.mdc.beans
 * @copyright Copyright (c) 2018
 * @date : 17.01.2018 19:52
 */

public class SimpleBeanPlain {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleBeanPlain.class);

    SimpleBeanPlain() {
        LOGGER.info("SimpleBeanPlain.constructor()");
    }

    public void init() {
        LOGGER.info("SimpleBeanPlain.init()");
    }

    public void afterPropertiesSet() throws Exception {
        LOGGER.info("SimpleBeanPlain.afterPropertiesSet()");
    }

    public void destroy() {
        LOGGER.info("SimpleBeanPlain.destroy()");
    }
}
