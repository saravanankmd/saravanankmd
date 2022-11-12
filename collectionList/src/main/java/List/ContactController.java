package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import List.Contact;
@RestController
public class ContactController {
	List <Contact> contacts= new ArrayList<>();

	@GetMapping("/getcontact/{id}")
	public Contact getcontact(@PathVariable(value="id") int id)
	{
Contact contact1=new Contact();
		Iterator <Contact> itr=contacts.iterator();
		while(itr.hasNext())
		{
			contact1= itr.next();
		if(contact1.getId()==id)
		{
			return contact1;
		}
		
		
		}
	return null;
	}
	@GetMapping("/")
	public List <Contact> getallcontacts()
	{
		return new ArrayList<Contact>(contacts);
	}
	@PostMapping("/contact")
	public String addcontact(@RequestBody Contact contact)
	{
	contacts.add(contact);
		return "updated Successfully";
	}
	@DeleteMapping("/Remove/{id}")
	public void Removecontact(@PathVariable(value="id") String id)
	{
	contacts.remove(id.indexOf(id));
	}
	@PutMapping("/update/{id}")
	public Contact updatecontact(@PathVariable(value="id") int id,@RequestBody Contact contact)
	{
		Contact contact1=new Contact();
		Iterator <Contact> itr=contacts.iterator();
		while(itr.hasNext())
		{
			contact1= itr.next();
		if(contact1.getId()==id)
		{
			int a=contacts.indexOf(contact1);
			contacts.set(a, contact);
			return contact;
		}
			
		}
		

		return null;
	}

}
