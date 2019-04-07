package com.us.app.checkurity.controllers;

import com.us.app.checkurity.controllers.vo.HourlyForecastsVO;
import com.us.app.checkurity.controllers.vo.WeatherResponseVO;
import com.us.app.checkurity.services.WeatherService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherControllerTest {

    @Autowired
    private WeatherController weatherController;

    @MockBean
    private WeatherService weatherService;

    @Before
    public void setup(){
        WeatherResponseVO responseMock = mock(WeatherResponseVO.class);
        when(weatherService.getWeather("19406")).thenReturn(responseMock);
        when(responseMock.getCity()).thenReturn("Plano");
        when(responseMock.getDate()).thenReturn("04-07-2019");
        HourlyForecastsVO forecastMock = mock(HourlyForecastsVO.class);
        when(forecastMock.getTemperature()).thenReturn(Double.valueOf("34.6"));
        when(responseMock.getHourlyForecasts()).thenReturn(List.of(forecastMock));
        when(responseMock.getZipCode()).thenReturn("19406");
    }

    /**
     * Positive scenario
     */
    @Test
    public void getWeatherReportByZipCode() {
        WeatherResponseVO response = weatherController.getWeatherReportByZipCode("19406");

        Assert.isTrue(response!= null, "response should not null");
        Assert.isTrue(response.getCity().equals("Plano"), "City should be equals to Plano");
        Assert.isTrue(response.getDate().equals("04-07-2019"), "date check");
        Assert.isTrue(response.getZipCode().equals("19406"), "zip code check");
        Assert.isTrue(response.getHourlyForecasts()!= null, "response should not null");
        Assert.isTrue(response.getHourlyForecasts().get(0).getTemperature().equals(34.6), "temp check");
    }

    /**
     * Negative scenario
     */
    @Test
    public void getWeatherReportByZipCode_Negative() {
        WeatherResponseVO response = weatherController.getWeatherReportByZipCode("2344423");
        Assert.isTrue(response== null, "response should  be null");
    }
}