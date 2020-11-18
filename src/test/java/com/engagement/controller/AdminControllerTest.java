package com.engagement.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.engagement.model.Admin;
import com.engagement.service.AdminService;

@RunWith(SpringRunner.class)
@WebMvcTest(AdminController.class)
class AdminControllerTest {
	
	
	
//	@Autowired
//    private MockMvc mvc;
//	
//	
//	@MockBean
//	private AdminService as;
//	
//	private AdminController ac;
//	
//	
//	
//	private String mockAdminJson = "{'admin':[{'adminId':1 ,'email':'a@a.net','firstName':'admin',lastName':'adminson'}]}";
//
//	
//
//	@Test
//	void testCreateNewAdmin() {
//		
//		mvc.perform( MockMvcRequestBuilders.post("admin/new")
//			      .contentType(MediaType.APPLICATION_JSON).andExpect(MockMvcResultMatchers.status().isOk())
//		            .andExpect(content().json(mockAdminJson));
//
//	}
//
}
