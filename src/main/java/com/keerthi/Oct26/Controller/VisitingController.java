package com.keerthi.Oct26.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Oct26.Visiting;
import com.keerthi.Oct26.Service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {

	@Autowired
	private VisitingService visitingService;
	
	@PostMapping
	public void saveVisiting(@RequestBody Visiting visiting){
		visitingService.saveVisiting(visiting);
	}
	
	
	
	
}

