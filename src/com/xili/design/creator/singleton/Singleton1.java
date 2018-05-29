package com.xili.design.creator.singleton;

/**
 * 单例模式实现方式一
 * 饿汉式，线程安全，效率低
 * @author liangxin
 *
 */
public class Singleton1 {
	
	//定义一个私有构造方法
	private Singleton1() {}
	
	//将自身低一个实例对象设置为一个属性，并加上static和final修饰符
	private static final Singleton1 instance = new Singleton1();
	
	//静态方法返回该类的实例
	public static Singleton1 getInstance() {
		return instance;
	}
}
