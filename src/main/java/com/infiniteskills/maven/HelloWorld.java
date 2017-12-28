package com.infiniteskills.maven;

import com.infiniteskills.maven.singleton.SingletonHelloWorld;

public class HelloWorld {

	public static void main(String[] args) 
	{
		
		SingletonHelloWorld shw = SingletonHelloWorld.getInstance();
		
		shw.sayHello();
	}
}
