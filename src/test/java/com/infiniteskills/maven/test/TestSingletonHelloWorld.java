package com.infiniteskills.maven.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.infiniteskills.maven.singleton.SingletonHelloWorld;

class TestSingletonHelloWorld {
	
	@Test
	void testSingleton() 
	{
		SingletonHelloWorld shw = SingletonHelloWorld.getInstance();
		assertEquals(shw.getInstance().hashCode(),shw.hashCode());
	}

}
