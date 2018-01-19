package dcsi.test.main;

import org.apache.camel.CamelContext;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dcsi.test.router.MyRouter;

public class MyMain {
	private static ApplicationContext springCtx;
	public static final Logger logger = Logger.getLogger(MyMain.class);

	public static void main(String[] args) throws Exception{
		
		BasicConfigurator.configure();
		
		springCtx = new ClassPathXmlApplicationContext("camel-config.xml");
		CamelContext context = springCtx.getBean("cmlCtx", CamelContext.class);
		
		context.start();
		try {
            Thread.sleep(5 * 60 * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.stop();
	}

}