package com.us.app.weather.controllers.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HourlyForecastsVO {
    private String day;
    private String time;
    private String date;
    private Double temperature;
    private String humidity;
    private String description;

    public HourlyForecastsVO(HourlyForecastsVOBuilder hourlyForecastsVOBuilder) {
        this.day = hourlyForecastsVOBuilder.getDay();
        this.time = hourlyForecastsVOBuilder.getTime();
        this.date = hourlyForecastsVOBuilder.getDate();
        this.temperature = hourlyForecastsVOBuilder.getTemperature();
        this.humidity = hourlyForecastsVOBuilder.getHumidity();
        this.description = hourlyForecastsVOBuilder.getDescription();
    }

    public HourlyForecastsVO() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
