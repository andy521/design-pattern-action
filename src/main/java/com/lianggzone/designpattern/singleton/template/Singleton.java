package com.lianggzone.designpattern.singleton.template;

/**
 * 单例模式【饿汉式 线程安全】
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年8月31日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton {
	
	private Singleton(){}
	
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance(){
		return singleton;
	}
}
