package raisetech.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;

//	private String name = "Tomari Daigoro";
//	private String age = "50";

	//課題5
//	private Map<String, String> student = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/student")
	public String getStudent(@RequestParam String name) {
		Student student = repository.searchByName(name);
		return student.getName() + " " + student.getAge() + "歳";
	}

//課題5
//	@GetMapping("/studentMap")
//	public String getStudentMap() {
//		return student.toString();
//	}

	@PostMapping("/student")
	public void registerStudent(String name, int age) {
		repository.registerStudent(name, age);
	}

	@PatchMapping("/student")
	public void updateStudent(String name, int age){
		repository.updateStudent(name, age);
	}

	@DeleteMapping("/student")
	public void deleteStudent(String name) {
		repository.deleteStudent(name);
	}


}
//課題5
//	@PostMapping("/studentMap")
//	public  void setStudentMap(String name, String age) {
//		student.put(name, age);
//	}
