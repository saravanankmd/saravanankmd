package hashmap;

	import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
 
	public class operationTest {

	
@Test
	public void testsum()
	{
	operation Operation=new operation();
		int a=10;
		int b=20;
		Assertions.assertEquals("The sum of two number is :30",Operation.sum(a, b));
	}
@Test
public void testsubraction()
{
operation Operation=new operation();
	int a=10;
	int b=20;
	Assertions.assertEquals("The subraction of two number is :-10",Operation.subraction(a, b));
}
@Test
public void testmultiplication()
{
operation Operation=new operation();
	int a=10;
	int b=20;
	Assertions.assertEquals("The multiplication of two number is :200",Operation.mutliplication(a, b));
}
@Test
public void testdivision()
{
operation Operation=new operation();
	int a=10;
	int b=20;
	Assertions.assertEquals("The Division of two number is :0",Operation.Division(a, b));
}
@Test
public void testmodulus()
{
operation Operation=new operation();
	int a=3;
	int b=2;
	Assertions.assertEquals("The Modulus of two number is :1",Operation.Modulus(a, b));
}
@Test
public void testfact()
{
operation Operation=new operation();
	int n=3;
	Assertions.assertEquals("The Factorial of Given number is :6",Operation.fact(n));
}
	}

	 

