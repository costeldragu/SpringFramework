package com.mdc.config;

import com.mdc.beans.SimpleBeanPlain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Costel DRAGU
 * date : 17.01.2018 20:19
 */
@Configuration
public class BeanConfig {

    @Bean( initMethod = "init",destroyMethod = "destroy")
    SimpleBeanPlain getSimpleBeanPlain() {
        return new SimpleBeanPlain();
    }

}
