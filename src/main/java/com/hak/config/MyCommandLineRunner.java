package com.hak.config;

import com.hak.HaksiteApplication;
import com.hak.config.redis.RedisObjectOperation;
import com.hak.config.redis.RedisOperation;
import com.hak.mysite.mapper.TCodeMapper;
import com.hak.mysite.model.TCode;
import com.hak.mysite.model.TCodeExample;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TCodeMapper tCodeMapper;

    @Autowired
    private RedisOperation redisOperation;

    @Override
    public void run(String... args) throws Exception {

        logger.info(">>>>>>>>>>>>>>>服务启动执行，正在加载码表<<<<<<<<<<<<<");



        logger.info(">>>>>>>>>>>>>>>码表加载完成<<<<<<<<<<<<<");

        logger.info("http://localhost:8088/swagger-ui.html#/");



    }
}
