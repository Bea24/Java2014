package counter;

import junit.framework.TestCase;

public class TestCounter extends TestCase {
	
	// counter is inizialized to 0
	public void testInit(){
		
		Counter c= new Counter();
		
		int result= c.getValue();
		
		assertEquals("Wrong initialization", 0, result); //0 expected //result actual
	}
	
	//counter and value incremented
	public void testIncrement(){
		
		Counter c = new Counter();
		
		c.increment();
		
		int result = c.getValue();
		
		assertEquals("Wrong increment",1,result);
	}
	
	//counter incremented several times
	public void testMultiIncrement(){
		
		Counter c = new Counter();
		
		for (int i=0; i<50; ++i){
			c.increment();
		}
		
		int result = c.getValue();
		
		assertEquals("Wrong increment",50,result);
	}

	//counter decremented 
	public void testDecrement(){
		
		Counter c = new Counter();
		
		c.decrement();		
		
		int result = c.getValue();
		
		assertEquals("Wrong increment",-1,result);
	}	
	
	//YAGNI 
}
