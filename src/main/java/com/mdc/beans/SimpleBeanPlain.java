package com.mdc.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : Costel DRAGU
 * date : 17.01.2018 19:52
 */
public class SimpleBeanPlain {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleBeanPlain.class);

    public SimpleBeanPlain() {
        LOGGER.info("SimpleBeanPlain.constructor()");
    }

    public void init() {
        LOGGER.info("SimpleBeanPlain.init()");
    }
    
    public void destroy() {
        LOGGER.info("SimpleBeanPlain.destroy()");
    }
}
