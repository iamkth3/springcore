package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo demo =context.getBean("demo", Demo.class);
		
		System.out.println(demo);
		
//		 SpelExpressionParser temp = new SpelExpressionParser();
//		 org.springframework.expression.Expression expression  = temp.parseExpression("22+33");
//		 System.out.println(expression.getValue());
	}
}
