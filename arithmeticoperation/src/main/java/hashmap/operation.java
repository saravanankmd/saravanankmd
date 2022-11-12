package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class operation {
	ConcurrentMap<String, arithmetic> contacts= new ConcurrentHashMap<>();
	@GetMapping("/sum/{a},{b}")
	public String sum(@PathVariable(value="a") int a,@PathVariable(value="b")int b)
	{
	int c= a+b;
		return "The sum of two number is :"+c;
	}
	@GetMapping("/multiplication/{a},{b}")
	public String mutliplication(@PathVariable(value="a") int a,@PathVariable(value="b")int b)
	{
	int c= a*b;
		return "The multiplication of two number is :"+c;
	}
	@GetMapping("/subraction/{a},{b}")
	public String subraction(@PathVariable(value="a") int a,@PathVariable(value="b")int b)
	{
	int c= a-b;
		return "The subraction of two number is :"+c;
	}
	@GetMapping("/Division/{a},{b}")
	public String Division(@PathVariable(value="a") int a,@PathVariable(value="b")int b)
	{
	int c= a/b;
		return "The Division of two number is :"+c;
	}
	@GetMapping("/Modulus/{a},{b}")
	public String Modulus(@PathVariable(value="a") int a,@PathVariable(value="b")int b)
	{
	int c= a%b;
		return "The Modulus of two number is :"+c;
	}
	
	@GetMapping("/fact/{n}")
	public String fact(@PathVariable(value="n") int n)
	{
		int a=n;
		int fact=1;
		while(a>=2)
		{
     
      fact=n*fact;
    		 n=n-1;
    		 a--;
	
		}
		return "The Factorial of Given number is :"+fact;
	}

	}