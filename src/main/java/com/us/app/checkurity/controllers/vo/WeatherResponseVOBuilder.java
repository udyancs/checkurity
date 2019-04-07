package com.us.app.checkurity.controllers.vo;

import com.us.app.checkurity.dto.ApiError;
import com.us.app.checkurity.dto.Response;

import java.util.List;

public class WeatherResponseVOBuilder extends Response {

    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String date;
    private Double coolestTemperature;
    private List<HourlyForecastsVO> hourlyForecast;

    public WeatherResponseVOBuilder() {
        this.city = null;
        this.zipCode = null;
        this.date = null;
        this.coolestTemperature = null;
        this.hourlyForecast = null;
    }

    public WeatherResponseVOBuilder withCity(String city){
        this.city = city;
        return this;
    }
    public WeatherResponseVOBuilder withZipCode(String zipCode){
        this.zipCode = zipCode;
        return this;
    }
    public WeatherResponseVOBuilder withDate(String date){
        this.date = date;
        return this;
    }

    public WeatherResponseVOBuilder withState(String state){
        this.state = state;
        return this;
    }
    public WeatherResponseVOBuilder withCountry(String country){
        this.country = country;
        return this;
    }
    public WeatherResponseVOBuilder withCoolestTemperature(Double coolest){
        this.coolestTemperature = coolest;
        return this;
    }

    public WeatherResponseVOBuilder withError(ApiError error){
        this.error = error;
        return this;
    }

    public WeatherResponseVOBuilder withHourlyForecast(List<HourlyForecastsVO> hourlyForecast){
        this.hourlyForecast = hourlyForecast;
        return this;
    }

    public WeatherResponseVO build(){
        return new WeatherResponseVO(this);
    }

    String getCity() {
        return city;
    }

    String getZipCode() {
        return zipCode;
    }

    String getDate() {
        return date;
    }

    List<HourlyForecastsVO> getHourlyForecast() {
        return hourlyForecast;
    }

    Double getCoolestTemperature() {
        return coolestTemperature;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
