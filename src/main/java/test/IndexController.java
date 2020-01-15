package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/tryinsert")
	public String tohome() {
		
		StudentInsert stInsert = new StudentInsert();
		stInsert.insertStudent("dhruv", 1234,"comp");
		return "homepage";
	}
	
}
