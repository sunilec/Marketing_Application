package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketingapp.entities.Lead;

@Controller
public class LeadController {
	
	//localhost:8080/create
	
	@RequestMapping("/create")
	public String viewCreateLeadForm() {
		
		return "create_lead";
	}
	@RequestMapping("/saveReg")
	public String saveOneLead(Lead lead) {
		System.out.println(lead.getFirstName());
		System.out.println(lead.getLastName());
		System.out.println(lead.getEmail());
		System.out.println(lead.getMobile());
		
		return "";
	}
}
