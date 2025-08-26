package com.kmii.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
	
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";  // 실제 실행될 서버에 있는 jsp파일의 이름 (확장자(.jsp)없음)
		
	}
	
	
	@RequestMapping(value = "/boardList")
	public String boardList() {
		
		return "boardList";  // 실제 실행될 서버에 있는 jsp파일의 이름 (확장자(.jsp)없음)
		
	}
	
	@RequestMapping(value = "/join")   // 밑에 그냥 return "joinMember"한경우 value="/member/join" 
	public String join() {
		
		return "member/joinMember";  // 실제 실행될 서버에 있는 jsp파일의 이름 (확장자(.jsp)없음)
		// 실제 실행될 서버에 있는 폴더이름/jsp파일이름 으로 반환하여야함
	}
	

}
