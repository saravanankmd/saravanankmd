package student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentservice {
	public  List<student> getstudents()
	{

		return List.of(new student(10L,
				"saran",
				"saran@gmail.com",
				35,
				LocalDate.of(2000,9,5)
				));
	} 

}
