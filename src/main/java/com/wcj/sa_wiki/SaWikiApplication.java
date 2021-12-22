package com.wcj.sa_wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SaWikiApplication {
    private static final Logger log = LoggerFactory.getLogger(SaWikiApplication.class);

    public static void main(String[] args) {
        Environment env =SpringApplication.run(SaWikiApplication.class, args).getEnvironment();
        log.info("启动成功!");
        log.info("项目地址:\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
