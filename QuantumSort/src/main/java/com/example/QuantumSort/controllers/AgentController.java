package com.example.QuantumSort.controllers;

import com.example.QuantumSort.repos.AgentRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/agent")
public class AgentController {
@Autowired
    AgentRepository agentRepository;
@Autowired
private HttpServletRequest request;

}
