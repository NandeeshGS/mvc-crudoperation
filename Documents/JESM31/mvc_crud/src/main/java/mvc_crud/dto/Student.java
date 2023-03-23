package mvc_crud.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Student {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	long mobile;
	int standard;
	Date dob;
	int age;
	
	
}
