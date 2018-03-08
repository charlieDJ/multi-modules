package com.multi.modules.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class Website {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 顾客id
     */
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 网址
     */
    private String website;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取顾客id
     *
     * @return customer_id - 顾客id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置顾客id
     *
     * @param customerId 顾客id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取网址
     *
     * @return website - 网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置网址
     *
     * @param website 网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }
}