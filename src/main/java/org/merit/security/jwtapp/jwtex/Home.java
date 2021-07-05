package org.merit.security.jwtapp.jwtex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping("/home")
	public String homePage() {
		return "<h1> Public Home Page</h1><button> Home Click</button>";
		
	}

	
	@GetMapping("/user")
	public String userPage() {
		return "<h1> Public User Page</h1><button> User Click</button>";
		
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "<h1> Public Admin Page</h1><button> Admin Click</button>";
		
	}
}
