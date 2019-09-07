package souvik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Car c=(Car) context.getBean(Car.class);
		c.show();
		
	}

}
