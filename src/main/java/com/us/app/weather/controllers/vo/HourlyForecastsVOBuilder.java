package com.us.app.weather.controllers.vo;

public class HourlyForecastsVOBuilder {
    private String day;
    private String time;
    private String date;
    private Double temperature;
    private String humidity;
    private String description;

    public HourlyForecastsVOBuilder withDay(String day){
        this.day = day;
        return this;
    }
    public HourlyForecastsVOBuilder withTime(String time){
        this.time = time;
        return this;
    }
    public HourlyForecastsVOBuilder withDate(String date){
        this.date = date;
        return this;
    }
    public HourlyForecastsVOBuilder withTemperature(Double temperature){
        this.temperature = temperature;
        return this;
    }
    public HourlyForecastsVOBuilder withHumidity(String humidity){
        this.humidity = humidity;
        return this;
    }
    public HourlyForecastsVOBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public HourlyForecastsVO build(){
        return new HourlyForecastsVO(this);
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }
}
