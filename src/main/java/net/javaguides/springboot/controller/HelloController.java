package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class HelloController {
//
//	@GetMapping({"/", "/hello"})
//	public String hello(@RequestParam(value = "name", defaultValue = "World",
//	required = true) String name, Model model) {
//		model.addAttribute("name", name);
//		return "hello";
//	}

	@GetMapping({"/api"})
	public List<String> hello() {
		List<String> userDetails = new ArrayList<>();
		userDetails.add("kumar, 30, kumar@example.com");
		userDetails.add("Janie, 25, janie@example.com");
		userDetails.add("Alice Johnson, 35, alice.johnson@example.com");
		userDetails.add("Bob Brown, 40, bob.brown@example.com");
		userDetails.add("Emily Davis, 28, emily.davis@example.com");
		userDetails.add("Michael Wilson, 45, michael.wilson@example.com");
		userDetails.add("Sarah Miller, 33, sarah.miller@example.com");
		userDetails.add("David Martinez, 37, david.martinez@example.com");
		userDetails.add("Lisa Jones, 29, lisa.jones@example.com");
		userDetails.add("Kevin Anderson, 32, kevin.anderson@example.com");
		userDetails.add("Michelle Lee, 31, michelle.lee@example.com");
		userDetails.add("Steven Garcia, 36, steven.garcia@example.com");
		userDetails.add("Amanda Hernandez, 27, amanda.hernandez@example.com");
		userDetails.add("Daniel Nguyen, 34, daniel.nguyen@example.com");
		userDetails.add("Rachel Thompson, 39, rachel.thompson@example.com");
		userDetails.add("James Moore, 26, james.moore@example.com");
		userDetails.add("Jessica Clark, 38, jessica.clark@example.com");
		userDetails.add("Andrew Rodriguez, 41, andrew.rodriguez@example.com");
		userDetails.add("Melissa Lewis, 42, melissa.lewis@example.com");
		userDetails.add("Ryan Walker, 43, ryan.walker@example.com");
		userDetails.add("Kimberly Perez, 44, kimberly.perez@example.com");
		userDetails.add("Matthew Hall, 46, matthew.hall@example.com");
		userDetails.add("Laura Young, 47, laura.young@example.com");
		userDetails.add("Justin King, 48, justin.king@example.com");
		userDetails.add("Hannah Wright, 49, hannah.wright@example.com");
		userDetails.add("Brandon Scott, 50, brandon.scott@example.com");
		userDetails.add("Nicole Green, 51, nicole.green@example.com");
		userDetails.add("Tyler Adams, 52, tyler.adams@example.com");
		userDetails.add("Samantha Baker, 53, samantha.baker@example.com");
		return userDetails;
	}
}
