package comm.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define endpoint for "/students" - return list of students
	List<Student> theStudents=null;
	@PostConstruct
	public void init()
	{
		theStudents = new ArrayList<Student>();
		
		theStudents.add(new Student(0,"Poornima", "Patel"));
		theStudents.add(new Student(1,"Mario", "Rossi"));
		theStudents.add(new Student(2,"Mary", "Smith"));		
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {

		
		return theStudents;
	}
	
	@GetMapping("/students/{studentID}")
	public Student getStudentByID(@PathVariable int studentID)
	{
		return theStudents.get(studentID);
	}
	
	
}
