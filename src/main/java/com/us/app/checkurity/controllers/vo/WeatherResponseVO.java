package com.us.app.checkurity.controllers.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.us.app.checkurity.dto.Response;
import com.us.app.checkurity.validation.ValidZipCode;

import java.util.List;

/**
 * @author Udyan Shardhar
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherResponseVO extends Response {

    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String date;
    private Double coolestTemperature;
    private List<HourlyForecastsVO> hourlyForecasts;

    public WeatherResponseVO() {
    }

    public WeatherResponseVO(WeatherResponseVOBuilder weatherResponseVOBuilder) {
        this.city = weatherResponseVOBuilder.getCity();
        this.state = weatherResponseVOBuilder.getState();
        this.country = weatherResponseVOBuilder.getCountry();
        this.zipCode = weatherResponseVOBuilder.getZipCode();
        this.coolestTemperature = weatherResponseVOBuilder.getCoolestTemperature();
        this.date = weatherResponseVOBuilder.getDate();
        this.error = weatherResponseVOBuilder.getError();
        this.hourlyForecasts = weatherResponseVOBuilder.getHourlyForecast();
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getDate() {
        return date;
    }

    public List<HourlyForecastsVO> getHourlyForecasts() {
        return hourlyForecasts;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Double getCoolestTemperature() {
        return coolestTemperature;
    }
}
