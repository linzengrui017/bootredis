package com.lzr.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by lzr on 2017/5/2.
 */
@SpringBootTest
public class RedisDaoTest {

    @Autowired
    private RedisDao redisDao;

    private static Logger logger = LoggerFactory.getLogger(RedisDaoTest.class);

    @Test
    public void testRedis(){
        redisDao.setKey("name", "alfred");
        redisDao.setKey("age", "20");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

}