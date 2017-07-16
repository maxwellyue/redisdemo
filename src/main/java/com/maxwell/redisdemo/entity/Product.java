package com.maxwell.redisdemo.entity;

import java.io.Serializable;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月15日 --  下午4:57 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Product implements Serializable {

    private static final long serialVersionUID = -7342484540946359517L;

    private Integer id;
    private String name;
    private String price;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
