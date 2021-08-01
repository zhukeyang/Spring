package com.node.domain;

import org.springframework.stereotype.Component;

@Component
public class Shops {
    private Integer ID;
    private String name;
    private Integer goods_id;

    public Shops() {
    }

    public Shops(Integer ID, String name, Integer goods_id) {
        this.ID = ID;
        this.name = name;
        this.goods_id = goods_id;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", goods_id=" + goods_id +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }
}
