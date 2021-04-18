package com.ujianweb.juaracoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ujianweb.juaracoding.services.ModelLaporan;


@Controller
public class HomePage {
	
	@Autowired
	ModelLaporan modelLaporan;
	
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String viewLoginPage() {
			return "login";
	}
	@GetMapping("/dashboard")
	public String viewDashboardPage(Model model) {
		model.addAttribute("active",0);
		model.addAttribute("count",modelLaporan.count());
//		model.addAttribute("countApprove",modelLaporan.countLaporanApprove());
		
		return "dashboard";
	}
	
}