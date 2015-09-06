/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.simplefactory.action.operation;

/**
 * Client
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public class Client {
	public static void main(String[] args) {
//		Operation oper = new OperationFactory().createOperation("+");
		Operation oper = new OperationFactory().createOperation("-");
		oper.setX(21);
		oper.setY(53);
		double result = oper.getResult();
		System.out.println(result);
	}
}