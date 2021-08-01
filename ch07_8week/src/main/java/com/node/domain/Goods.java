package com.node.domain;

import org.springframework.stereotype.Component;

@Component
public class Goods {
    private Integer Id;
    private String name;
    private String area;

    public Goods() {
    }

    public Goods(Integer id, String name, String area) {
        Id = id;
        this.name = name;
        this.area = area;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
