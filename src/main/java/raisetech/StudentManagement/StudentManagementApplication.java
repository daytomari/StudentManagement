package raisetech.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	private String name = "Tomari Daigoro";
	private String age = "50";

	//課題5
//	private Map<String, String> student = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/studentInfo")
	public String getStudentInfo() {
		return name + " " + age + "歳";
	}

	//課題5
//	@GetMapping("/studentMap")
//	public String getStudentMap() {
//		return student.toString();
//	}

	@PostMapping("/studentInfo")
	public void setStudentInfo(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@PostMapping("/studentName")
	public void setStudentName(String name){
		this.name = name;
	}

	//課題5
//	@PostMapping("/studentMap")
//	public  void setStudentMap(String name, String age) {
//		student.put(name, age);
//	}
}
