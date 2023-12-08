package com.vtech.contentcalendar;

import com.vtech.contentcalendar.config.ContentCalendarProperties;
import com.vtech.contentcalendar.model.Content;
import com.vtech.contentcalendar.model.Type;
import com.vtech.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

import static com.vtech.contentcalendar.model.Status.IDEA;


@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}



}
