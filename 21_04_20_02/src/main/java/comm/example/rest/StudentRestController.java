package comm.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.entity.Student;
import comm.example.exception.StudentNotFoundException;
import comm.example.exception.StudentResponseEntity;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;

	// define @PostConstruct to load the student data ... only once!

	@PostConstruct
	public void loadData() {

		theStudents = new ArrayList<>();

		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}


	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) throws StudentNotFoundException {

		
		if ( (studentId >= theStudents.size()) || (studentId < 0) ) {			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		
		return theStudents.get(studentId);
	
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student theStudent)
	{
		theStudents.add(theStudent);
		return theStudent;
	}
	@ExceptionHandler
		public ResponseEntity<StudentResponseEntity> handleException(StudentNotFoundException snfe)
	{
	
			/*
			 * StringBuffer br=new StringBuffer(); br.append(HttpStatus.NOT_FOUND);
			 * br.append(snfe.getMessage()); br.append(System.currentTimeMillis()); return
			 * new ResponseEntity<Object>(br,HttpStatus.NOT_FOUND);
			 */
		return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.NOT_FOUND.value(), snfe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<StudentResponseEntity> handleNumberFormatException(NumberFormatException ipme)
	{
		return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}
	
}
