package ExternalProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PropertiesExternal {
	
	//From Property File
	@Value("${com.spring.basics.url}")
	private String url;
	
	public String returnServiceUrl() {
		
		return url;
	}
	
	

}
