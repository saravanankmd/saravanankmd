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
	@GetMapping("/fact/{n}")
	public String sum(@PathVariable(value="n") int n)
	{
		int a=n;
		int fact=1;
		while(a>=2)
		{
     
      fact=n*fact;
    		 n=n-1;
    		 a--;
	
		}
		return "The sum of two number is :"+fact;
	}

	}