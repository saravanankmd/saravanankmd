package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressbookResource {
	ConcurrentMap<String, contact> contacts= new ConcurrentHashMap<>();
	@GetMapping("/getcontact/{id}")
	public contact getcontact(@PathVariable(value="id") String id)
	{
	
		return contacts.get(id);
	}
	@GetMapping("/")
	public List <contact> getallcontacts()
	{
		return new ArrayList<contact>(contacts.values());
	}
	@PostMapping("/contact")
	public contact addcontact(@RequestBody contact Contact)
	{
	Contact=contacts.put(Contact.getId(), Contact);
		return Contact;
	}
	@DeleteMapping("/Remove/{id}")
	public void Removecontact(@PathVariable(value="id") String id)
	{
	contacts.remove(id);
	}
	@PutMapping("/updatecontact/{id}")
	public contact updatecontact(@PathVariable(value="id") String id,contact Contact)
	{
	
		return contacts.replace(id,Contact);
	}
	
}