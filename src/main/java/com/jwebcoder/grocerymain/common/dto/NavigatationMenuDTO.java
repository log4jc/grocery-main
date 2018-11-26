package com.jwebcoder.grocerymain.common.dto;


import javax.persistence.*;
import java.io.Serializable;

public class NavigatationMenuDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAVIGATATION_MENU.MENU_ITEM_NAME
     *
     * @mbggenerated
     */
    private String menuItemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAVIGATATION_MENU.INTERLINKAGE
     *
     * @mbggenerated
     */
    private String interlinkage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAVIGATATION_MENU.ORDER_NUMBER
     *
     * @mbggenerated
     */
    @Column(name = "ORDER_NUMBER")
    private Integer orderNumber;

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getInterlinkage() {
        return interlinkage;
    }

    public void setInterlinkage(String interlinkage) {
        this.interlinkage = interlinkage;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
}