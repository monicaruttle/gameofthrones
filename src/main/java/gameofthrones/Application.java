package gameofthrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CharacterRepository repository;

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
    }
    
    @Override
	public void run(String... args) throws Exception {

        System.out.println("-- Looking up Eddard Stark --");
        System.out.println(repository.findByCharacterName("Eddard Stark"));

        System.out.println("-- Looking up House Stark --");
        System.out.println(repository.findByHouseName("Stark"));

    }
}