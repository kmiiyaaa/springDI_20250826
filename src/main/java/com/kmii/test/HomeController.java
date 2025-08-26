package com.kmii.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")   // 루트요청 -> 대문 페이지 매핑
	public String home() {		
		
		return "home";
	}
	
	@RequestMapping(value = "/hello")
	public String hello() {		  // 보통 메서드이름과 요청 이름 같이 한다
		
		return "hello";
	}
	
}

