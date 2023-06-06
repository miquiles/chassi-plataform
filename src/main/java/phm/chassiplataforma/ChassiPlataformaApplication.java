package phm.chassiplataforma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import phm.chassiplataforma.external.CepExternal;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class ChassiPlataformaApplication {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		SpringApplication.run(ChassiPlataformaApplication.class, args);
	}

}
