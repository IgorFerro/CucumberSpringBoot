package com.go.spring.springselenium.flights;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("language/en.properties")
public class FlightAppDetails {
	
		
		@Value("${flight.app.url}")
		private String url;
		
		@Value("${flight.app.lables}")
		private List<String> lables;
		
		public String getUrl() {
			return url;
		}

		public List<String> getLables() {
			return lables;
		}
		
	}


