package Nari.Pool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Haicontroller {
	@GetMapping("/Hello")
	public String welcome()
	{
		return "Welcome to SpringBoot Web Developer";
	}

}
