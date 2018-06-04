package com.personal.utils.config;

import org.springframework.context.annotation.Bean;
import redis.clients.jedis.JedisPool;


public class RedisConfig {

    //address of your redis server
    private static final String redisHost = "localhost";
    private static final Integer redisPort = 6379;

    //the jedis connection pool..
    private static JedisPool pool = null;

    public RedisConfig() {
        //configure our pool connection
        pool = new JedisPool(redisHost, redisPort);

    }



}
