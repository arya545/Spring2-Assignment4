/**
 * 
 */
package com.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SURYA
 *
 */
public class MainApp {

	/**
	 * 
	 */
	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor te=(TextEditor) context.getBean("texteditor");
		te.spellCheck();
	}

}
