package com.atguigu.json;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    //1.javaBean和json的互转

    public void test1() {
        Person person = new Person(1, "啊啊啊");
        Gson gson = new Gson();
        //toJson的方法可以把java对象转换成json字符串
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);
        //fromJson把json字符串转换成java对象
        //第一个参数是json字符串
        //第二个参数是转换回去的json对象
        gson.fromJson(personJsonString, Person.class);
    }

    //2.List和JSON的互转
    public void test02() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "aa"));
        personList.add(new Person(2, "ab"));
        Gson gson = new Gson();
        //把list集合转化成json字符串
        String personListJsonString = gson.toJson(personList);
    }

    //3.map和json的互转
    public void test03()
    {
        Map<Integer,Person> personMap =new HashMap<>();
        personMap.put(1,new Person(1,"aa"));
        personMap.put(2,new Person(2,"ab"));

    }
}
