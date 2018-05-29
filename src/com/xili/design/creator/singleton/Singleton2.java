package com.xili.design.creator.singleton;

/**
 * 方法二
 * 饱汉式，非线程安全
 * @author liangxin
 *
 */
public class Singleton2 {
	
	//定义私有构造方法（防止通过new Singleton2()去实例化
	private Singleton2() {}
	
	//定义一个Singleton类型的变量（不初始化，注意这里没有使用final关键字
	private static Singleton2 instance;
	
	//定义一个静态的方法（调用是在初始化Singleton，但是多线程访问时，可能造成重复初始化问题）
	public static Singleton2 getInstance() {
		if(instance == null)
			instance = new Singleton2();
		return instance;
	}
	
}
