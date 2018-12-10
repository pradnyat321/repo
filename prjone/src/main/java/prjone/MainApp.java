package prjone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new AnnotationConfigApplicationContext(AppConfig.class)  ;
		DataModelService dms = appCon.getBean(DataModelService.class);
		String str = dms.printString("Hello World");
		System.out.println("Printed:"+ str );

	}

}
