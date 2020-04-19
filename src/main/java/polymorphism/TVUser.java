package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. ���� ���� �ε��Ͽ� �����̳� ���� 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)
		TV tv = (TV)factory.getBean("tv"); 
		tv.powerOn(); 
		tv.volumeUp(); 
		tv.volumeDown();
		tv.powerOff();
		
		//3. �����̳� ���� 
		factory.close(); 
	}
}
