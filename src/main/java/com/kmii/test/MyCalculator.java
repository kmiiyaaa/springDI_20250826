package com.kmii.test;

public class MyCalculator {
	
	private int a ;
	private int b ;
	// Calculator calculator = new Calculator();  // 객체를 멤버변수로 선언 -> claculator 객체에게 의존하는 관계 성립  
	
	Calculator calculator ;
	
	

	public MyCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MyCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}


	public MyCalculator(int a, int b, Calculator calculator) {
		super();
		this.a = a;
		this.b = b;
		this.calculator = calculator;
	}

	public void addition() {
		calculator.add(this.a, this.b);
	}
		
	public void subtraction() {
		calculator.sub(this.a, this.b);
	}
		
	public void multiplication() {
		calculator.multi(this.a, this.b);
	}
			
	public void division() {
		calculator.dv(this.a, this.b);
	}

	
	// setter선언

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	

	
	
	}


