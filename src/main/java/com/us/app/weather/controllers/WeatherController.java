package com.us.app.weather.controllers;

import com.us.app.weather.controllers.vo.WeatherResponseVO;
import com.us.app.weather.services.WeatherService;
import com.us.app.weather.validation.ValidZipCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Udyan Shardhar
 * Weather controller to handle weather related service end points.
 */
@RestController
@RequestMapping("/weather")
@Validated
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     *
     * @param zipCode zip code of the location
     * @return WeatherResponseVO value object
     */
    @GetMapping("/check/{zipCode}")
    public WeatherResponseVO getWeatherReportByZipCode(@ValidZipCode @PathVariable String zipCode) {
        return weatherService.getWeather(zipCode);
    }
}
