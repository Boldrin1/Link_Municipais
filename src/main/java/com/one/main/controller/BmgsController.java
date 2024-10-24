package com.one.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.main.service.BmgsService;

@Controller
@RequestMapping("/Bmgs")
public class BmgsController {

	private BmgsService bmgService;
	
	@GetMapping
	public String PaginaInicial(Long id) {
		bmgService.findBmgById(id);
		return "Principal";
	}
}
