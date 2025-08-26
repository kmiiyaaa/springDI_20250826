package com.kmii.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyCalculator myCalculator = new MyCalculator();
				//myCalculator.setA(10);
				//myCalculator.setB(5);
//				Calculator calculator = new Calculator();
//				Calculator calculator2 = new Calculator();
//				Calculator calculator3 = new Calculator();
				
				//myCalculator.setCalculator(calculator);
				
				//멤버변수(멤버객체)인 calculator 외부에서 객체를 생성하여 초기화->DI
				
				//myCalculator.addition();
				
				//MyCalculator myCalculator2 = new MyCalculator(calculator);
				//myCalculator2.divsion();
				
				String configLocation = "classpath:applicationCTX.xml";
				//스프링 컨테이너인 applicationCTX.xml을 로드하라
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
				//ctx 라는 이름으로 컨테이너 생성
				
				MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
				//스프링 컨테이너에서 객체를 가져온거->DI
				
				myCalculator.addition();
				
				System.out.println("==========================================");
				
//				StudentInfo studentInfo = new StudentInfo();
//				StudentDto studentDto1 = new StudentDto();
//				studentDto1.setName("홍길동");
//				studentDto1.setAge(17);
//				studentDto1.setGradeNum("4");
//				studentDto1.setClassNum("5");
//				
//				StudentDto studentDto2 = new StudentDto();
//				studentDto2.setName("이순신");
//				studentDto2.setAge(20);
//				studentDto2.setGradeNum("3");
//				studentDto2.setClassNum("7");
				
				//스프링 컨테이너에서 객체 주입받기(IoC)
				StudentInfo studentInfo1 = ctx.getBean("studentInfo1", StudentInfo.class);
				StudentInfo studentInfo2 = ctx.getBean("studentInfo2", StudentInfo.class);
				
				//studentInfo1.setStudentDto(studentDto1); //setter로 초기화		
				studentInfo1.printStudentIfno();
				
				//StudentInfo studentInfo2 = new StudentInfo(studentDto2); //생성자로 초기화
				studentInfo2.printStudentIfno();
				
				
	
	
	

	}

}
