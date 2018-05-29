package com.xili.design.creator.singleton;

/**
 * 方法三
 * 饱汉式的优化升级版，饱汉式，线程安全简单实现
 * @author liangxin
 *
 */
public class Singleton3 {
	//定义私有构造方法（防止通过new Singleton2()去实例化
	private Singleton3() {}
	
	//定义一个Singleton类型的变量（不初始化，注意这里没有使用final关键字）
	private static Singleton3 instance;
	
	//定义一个静态方法（调用时在初始化singleton，使用synchronized避免多线程访问时，可能造成重复初始化问题
	public static synchronized Singleton3 getInstance() {
		if(instance == null)
			instance = new Singleton3();
		return instance;
	}
}
