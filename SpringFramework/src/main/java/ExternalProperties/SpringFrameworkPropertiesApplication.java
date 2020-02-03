package ExternalProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import CDI.CdiBusinessExample;



@SpringBootApplication
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringFrameworkPropertiesApplication {

	public static void main(String[] args) {
		
		//What are the beans for the project to use binary search and beneath sorting algorithm.
		// what are the dependecies of beans if any
		// where to search for beans... Application context..
		
		
		ApplicationContext applicationContext = 
		SpringApplication.run(SpringFrameworkPropertiesApplication.class, args);
		
		
		//get the beans
		/*BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int number =  binarySearch.binarySearch(new int [] {12,4,6},3);
		System.out.println(binarySearch);
		System.out.println(number);
		*/
		CdiBusinessExample cdiBusiness = applicationContext.getBean(CdiBusinessExample.class);
		PropertiesExternal service = applicationContext.getBean(PropertiesExternal.class);

		
		System.out.println("CDIBusiness bean" + cdiBusiness);
		
		System.out.println("CDIBusiness bean" + service);

	}

}
