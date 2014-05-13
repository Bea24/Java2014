import junit.framework.TestCase;


public class TestSum extends TestCase {

	public void testNumberOne(){
		
		int a=1;
		int b=2;
		
		int result=Example.sum(a, b);
		
		assertTrue("We expect 3. We got " + result, result==3);
	}
	
	public void testNumberTwo(){
		
		int a=5;
		int b=0;
		
		int result=Example.sum(a, b);
		
		assertTrue("We expect 5. We got " + result, result==5);
	}
	
}
