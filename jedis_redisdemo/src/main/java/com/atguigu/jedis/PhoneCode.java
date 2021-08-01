package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

import java.util.Random;

public class PhoneCode {

    public static void main(String[] args) {

        //模拟验证码的发送

        getRedisCode("18736717827","896211");
    }

    //1.生成6位数字的验证码
    public static String getCode()
    {
        Random random=new Random();
        String code="";
        for(int i=0;i<6;i++)
        {
            int rand = random.nextInt(10);
            code+=rand;
        }
        return code;
    }
    //2.让每个手机每天只能发送三次，验证码放到redis中，设置过期时间120
    public static void verifyCode(String phone)
    {
        Jedis jedis=new Jedis("192.168.21.128",6379);
        //拼接key
        //1.手机发送的次数key
        String countKey="VerifyCode"+phone+":count";
        //2.验证码key
        String codeKey="VerifyCode"+phone+":code";
        //每个手机每天只能发送3次
        String count = jedis.get(countKey);
        if(count==null)
        {
            //没有发送次数，第一次发送
            //设置发送的次数为一
            jedis.setex(countKey,24*60*60,"1");

        }
        else if(Integer.parseInt(count)<=2)
        {
            //发送次数+1
            jedis.incr(countKey);
        }
        else if(Integer.parseInt(count)>2)
        {
            //发送三次，不能再发送
            System.out.println("今天发送次数已经超过三次");

        }
        jedis.close();
        //发送的验证码要放在redis中
        String vcode = getCode();
        jedis.setex(codeKey,120,vcode);
        jedis.close();
    }
    public static void getRedisCode(String phone,String code)
    {
        Jedis jedis=new Jedis("192.168.21.128",6379);
        String codeKey="VerifyCode"+phone+":code";
        String redisCode = jedis.get(codeKey);
        if(redisCode.equals(code))
        {
            System.out.println("成功");
        }
        else{
            System.out.println("失败");
        }
        jedis.close();
    }

}
