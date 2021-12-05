package retodos.retodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import retodos.interfaces.InterfaceUser;
import retodos.interfaces.InterfaceVegetarian;

@Component
@SpringBootApplication
public class RetodosApplication implements CommandLineRunner {
    @Autowired
    private InterfaceVegetarian interfaceVegetarian;
    @Autowired
    private InterfaceUser interfaceUser;

	public static void main(String[] args) {
		SpringApplication.run(RetodosApplication.class, args);
	}
        @Override
    public void run(String...arg) throws Exception {
        interfaceVegetarian.deleteAll();
        interfaceUser.deleteAll();
    }

}
