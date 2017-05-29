package org.sonatype.mavenbook.weather;

import java.io.InputStream;

public class WeatherService {

    public WeatherService() {}

    public String retrieveForecast( String zip ) throws Exception {
	// Retrieve Data
//	InputStream dataIn = new YahooRetriever().retrieve( zip );
        
        InputStream dataIn = getClass().getClassLoader().getResourceAsStream("ny-weather.xml");

	
	// Parse Data
	Weather weather = new YahooParser().parse( dataIn );
	
	// Format (Print) Data
	return new WeatherFormatter().format( weather );
    }	
}
