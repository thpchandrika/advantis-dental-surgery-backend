package cs489.apsd.dentalsurgeryapp;
import cs489.apsd.dentalsurgeryapp.domain.*;
import cs489.apsd.dentalsurgeryapp.repository.*;
import cs489.apsd.dentalsurgeryapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
public class DentalsurgeryappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentalsurgeryappApplication.class, args);
	}
}