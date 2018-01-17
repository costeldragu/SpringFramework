package com.mdc;

import com.mdc.controllers.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : Costel DRAGU
 * @package : com.mdc
 * @copyright Copyright (c) 2018
 * @date : 17.01.2018 19:33
 */
@ComponentScan(basePackages = "com.mdc")
public class ApplicationAnnotation {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationAnnotation.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationAnnotation.class);

        HomeController h = context.getBean("homeController",HomeController.class);
        LOGGER.info(h.getTest());
        LOGGER.info(h.getDebug());


    }


}
