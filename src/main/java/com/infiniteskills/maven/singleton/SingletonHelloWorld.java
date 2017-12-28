package com.infiniteskills.maven.singleton;

public class SingletonHelloWorld {

	private static volatile SingletonHelloWorld instance = null;
	private static final String HELLO_MESSAGE = "Hello W0rld!"; 
	
	private SingletonHelloWorld() {}
	
	public static SingletonHelloWorld getInstance() 
	{
		if (instance == null) 
		{
			synchronized (SingletonHelloWorld.class) 
			{
				if (instance == null) 
				{
					instance = new SingletonHelloWorld();
				}
			}
		}
        return instance;
	}
	
	public void sayHello()
	{
		System.out.println(HELLO_MESSAGE);
	}
}
