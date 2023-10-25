package com.example.watchgallery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public @Configuration
	class LoadDatabase{
		private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

		@Bean
		CommandLineRunner initDatabase (WatchRepository repository){
			return args -> {
				log.info("Preloading "+ repository.save(new Watch("Kinetic", "Seiko")));
				log.info("Preloading "+ repository.save(new Watch("King", "Seiko")));

			};
		}

	}//end LoadDatabase
