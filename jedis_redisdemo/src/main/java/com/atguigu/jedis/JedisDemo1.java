package com.atguigu.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class JedisDemo1 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis=new Jedis("192.168.21.128",6379);
        //测试
        String value = jedis.ping();
        System.out.println(value);
        jedis.close();
    }
    //操作key
    @Test
    public void demo1()
    {
        Jedis jedis=new Jedis("192.168.21.128",6379);
        jedis.set("name","lucy");
        String name = jedis.get("name");
        System.out.println(name);

        jedis.mset("k1","v1","k2","v2");
        List<String> list = jedis.mget("k1", "k2");
        for (String s : list) {
            System.out.println(s);
        }

        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
