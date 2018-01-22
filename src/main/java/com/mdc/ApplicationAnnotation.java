package com.mdc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Costel DRAGU
   date : 17.01.2018 19:33
 */

public class ApplicationAnnotation {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationAnnotation.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationAnnotation.class);

    }


}
