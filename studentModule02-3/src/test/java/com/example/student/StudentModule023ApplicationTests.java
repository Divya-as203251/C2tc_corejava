package com.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
@DataJpaTest
@AutoConfigureTestDatabase

public class StudentModule023ApplicationTests {
	@Autowired
	private StudentRepository srepo;

	@Test
public void testSavestudentService() {
		Student st=new Student();
		st.setId(112);
		st.setName("Divya");
		st.setCollege("Madras Christian College");
		st.setRoll(20);
		st.setQualification("Under Graduate");
		st.setCourse("BCA");
		st.setYear(2023);
		st.setCertificate("Graduation");
		st.setHallticketnum(210172106);
		
		Student savedStudent=srepo.save(st);
		assertNotNull(savedStudent.getId());
		
		Assertions.assertThat(savedStudent.getId()).isGreaterThan(100);
		assertEquals(101,savedStudent.getId());
		assertEquals("Divya",savedStudent.getName());
		assertEquals("Madras Christian College",savedStudent.getCollege());
		assertEquals(06,savedStudent.getRoll());
		assertEquals("Under Graduate",savedStudent.getQualification());
		assertEquals("BCA",savedStudent.getCourse());
		assertEquals(2024,savedStudent.getYear());
		assertEquals("Graduate",savedStudent.getCertificate());
		assertEquals(2101721020,savedStudent.getHallticketnum());
		
	}
	@Test
	public void testDeleteStudent()
	{
		Student st=new Student();
		st.setId(101);
		st.setName("Divya");
		st.setCollege("Madras Christian College");
		st.setRoll(06);
		st.setQualification("Under Graduate");
		st.setCourse("BCA");
		st.setYear(2024);
		st.setCertificate("Graduation");
		st.setHallticketnum(210172106);
		Student saved=srepo.save(st);
		int studid=saved.getId();
		srepo.deleteById(studid);
		assertFalse(srepo.findById(studid).isPresent());
	}

}
