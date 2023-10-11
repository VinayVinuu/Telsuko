package com.vinay.Telsuko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
  
	
	public static void main( String[] args )
    {
    	//BeanFactory (small )
    	//ApplicationContext (enterprise level)
      // Car car=new Car();
     
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	
    	Car obj=(Car)context.getBean("car");
    	obj.drive();
    	
    	//tyre t=(tyre) context.getBean("tyre");
    	//System.out.println(t);
    	
    }
}
