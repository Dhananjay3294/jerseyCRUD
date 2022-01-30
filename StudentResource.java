package com.rest.JerseyDemo;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/StudRes")
public class StudentResource {
	
	StudentData data=new StudentData();
	
	@GET                             // retrive data 
	@Path("/getstudentdata")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() {
		
		return data.getAllStudent();
		
	}
	
	@POST                       // insert data
	@Path("/addstudentdata")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> addStudent(Student student) {
		return data.createStudent(student);
		
	}
	
	@DELETE                          // delete the records by id
	@Path("/removestudentdata/{id}")// return records in JSON format from server site
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> removeStudent(@PathParam("id") int StudentId) {
		
		return data.removeStudent(StudentId);
		
	}
	
	@PUT                          // update the records by id
	@Path("/updatestudentdata/{id}")// return records in JSON format from server site
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> updateStudent(@PathParam("id") int StudentId,Student student) {
		
		return data.updateStudent(StudentId,student.getStudentName());
		
	}

}
