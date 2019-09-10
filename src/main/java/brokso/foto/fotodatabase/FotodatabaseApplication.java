package brokso.foto.fotodatabase;

import brokso.foto.fotodatabase.database.Image;
import brokso.foto.fotodatabase.database.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FotodatabaseApplication implements CommandLineRunner {

	@Autowired
	ImageRepository imageRepository;

	public static void main(String[] args) {
		SpringApplication.run(FotodatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Image image = new Image();
		image.setChecksum("ælkj2lkj23lkjl35jlj5l4j6");
		image.setSti("/hej/hje/hej/hej");

		imageRepository.save(image);


		image =new Image();
		image.setChecksum("dfgsdfgsdgfsgfsdfg");
		image.setSti("/fg/fg/fg/fg");
		imageRepository.save(image);


		image =new Image();
		image.setChecksum("rtrtrtrtrtrt");
		image.setSti("/rt/rrt/rt/rt");
		imageRepository.save(image);


		System.out.println(imageRepository.findAll());






	}
}
