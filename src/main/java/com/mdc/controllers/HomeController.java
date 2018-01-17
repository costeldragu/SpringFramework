package com.mdc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author : Costel DRAGU
 * @package : com.mdc.controllers
 * @copyright Copyright (c) 2018
 * @date : 17.01.2018 21:51
 */
@Controller
public class HomeController {

    @Value("${testVal}")
    private String test;

    @Value("${debug}")
    private String debug;

    public String getTest() {
        return test;
    }

    public String getDebug() {
        return debug;
    }
}
