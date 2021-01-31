package com.hak;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
@MapperScan("com.hak.mysite.mapper")
@Slf4j
public class HaksiteApplication {

    public static void main(String[] args) {

       try {
             ConfigurableApplicationContext context = SpringApplication.run(HaksiteApplication.class, args);
             int length = context.getBeanDefinitionNames().length;
             log.debug("Spring boot initialized {} Beans", length);
         } catch (Exception e) {
             log.error("[SpringBootDemoLogbackApplication] startup exception:", e);
         }
    }

}
