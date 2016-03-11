/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator.action.beverage;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Decorator extends Beverage {
    private Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}