package com.us.app.checkurity.controllers;


import com.us.app.checkurity.controllers.vo.WeatherResponseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.validation.ConstraintViolationException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherApiIntTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private WeatherController weatherController;
	
	@Test
	public void getWeather() {
		WeatherResponseVO response = weatherController.getWeatherReportByZipCode("75025");
		if (response != null) {
				logger.info(response.getCity());
				logger.info(response.getDate());
				if(response.getCoolestTemperature() != null) {
					logger.info(response.getCoolestTemperature().toString());
				}
				logger.info(response.getZipCode());
			}
		}
}