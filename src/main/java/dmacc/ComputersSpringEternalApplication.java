package dmacc;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.ComputerCase;
import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

// Austin Rathje

@SpringBootApplication
public class ComputersSpringEternalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputersSpringEternalApplication.class, args);
	}

	/**
	 
	@Autowired
	ComputerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		Computer computer1 = appContext.getBean("computer", Computer.class);
		computer1.setCpu("i5-5300 @ 3.60GHz");
		computer1.setOperatingSystem("Windows 7");
		computer1.setRam(8);
		repo.save(computer1);

		// Create a bean to use - not managed by Spring
		Computer computer2 = new Computer("Windows 10", "i9-9700 @ 3.60GHz", 1780.99, 32);
		ComputerCase newCase = new ComputerCase("Asus", 4);
		computer2.setComputerCase(newCase);
		repo.save(computer2);

		List<Computer> allMyComputers = repo.findAll();
		for (Computer computer : allMyComputers) {
			System.out.println(computer.toString());
		}

		// closes the ApplicationContext resource leak 
		((AbstractApplicationContext) appContext).close();
	}
	
	**/
}
