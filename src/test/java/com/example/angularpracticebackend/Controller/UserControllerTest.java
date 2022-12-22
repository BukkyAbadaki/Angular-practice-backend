//package com.example.angularpracticebackend.Controller;
//
//import com.example.angularpracticebackend.Service.UserService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jdk.internal.jshell.tool.ConsoleIOContext;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = UserController.class)
//class UserControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @MockBean
//    private UserService UserService;
//
//    void whenValidInput_thenReturns200() throws Exception {
//        mockMvc.perform(post("/forums/42/register")
//                        .contentType("application/json"))
//                .andExpect(status().isOk());
//
//
//        @Test
//    void register() {
//
//    }
//
//    @Test
//    void login() {
//    }
//}