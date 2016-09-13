package com.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(value ="com.event.dao")
@ComponentScan(basePackages="com.event")
@AutoConfigurationPackage
@SpringBootApplication
public class EventApplication implements CommandLineRunner{
	
//	@Autowired
//	private UserDAO userDAO;

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*userDAO.deleteAll();
		
		System.out.println("Saving User");

		User user = new User();
		user.setUserName("anil");
		user.setFirstName("anil");
		user.setLastName("tako");
		user.setEmail("takoanil@gmail.com");
		user.setCreatedDate(new Date());
		
		userDAO.save(user);*/
	}
}
