package edu.usmp.impuestoRenta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("edu.usmp.impuestoRenta.repository")
public class ImpuestoRentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImpuestoRentaApplication.class, args);
	}
}
