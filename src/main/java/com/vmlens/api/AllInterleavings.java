package com.vmlens.api;

public class AllInterleavings implements AutoCloseable {

	
	private final String name;
	
	public AllInterleavings(String name) {
		super();
		this.name = name;
	}




	public  boolean hasNext()
	{
		return hasNext(this,name);
	}

	
	public void close()  {
		close(this);
	}
	
	
	private static boolean hasNext(Object obj, String name)
	{
		return false;
	}
	
	
	private static void close(Object obj)
	{
		
	}
	
	
}
