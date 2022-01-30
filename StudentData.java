package com.rest.JerseyDemo;

import java.util.*;
import java.util.stream.Collectors;

public class StudentData {
	List<Student> Studentdata;
	
	public StudentData() {
		Studentdata=new ArrayList<>();
		 
		Student student1=new Student(101,"Mumbai");
		Student student2=new Student(102,"Pune");
		Student student3=new Student(103,"Aurangabad");
		
		Studentdata.addAll(Arrays.asList(student1,student2,student3));
		}
	
	public List<Student> getAllStudent(){
		return Studentdata; 
	}
		

		public List<Student> createStudent(Student student){
			 Studentdata.add(student);
			 return Studentdata;
	}
		
		public List<Student> removeStudent(int id){
			Studentdata.removeIf(x->x.getStudentId()== id);// record is deleted by id
			return Studentdata; 
		}
		
		public List<Student> updateStudent(int id,String StudentName){
			 Studentdata.stream().filter(x->x.getStudentId() == id)
			 .collect(Collectors.toList()).get(0).setStudentName(StudentName);
			 return Studentdata; 
	}
			

}
