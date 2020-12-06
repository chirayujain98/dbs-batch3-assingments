package concatination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Target t1 = (Target)ctx.getBean("target");
		t1.doConcat("chirayu", "jain");
	}

}
