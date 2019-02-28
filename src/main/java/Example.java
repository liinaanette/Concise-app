import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.flywaydb.core.Flyway;


@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
		Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/postgres", "postgres", "docker").load();
        flyway.migrate();
	}

}