package com.us.app.weather.clients.dto;

public class HourlyForcasts {
    private ForecastLocation forecastLocation;

    public ForecastLocation getForecastLocation() {
        return forecastLocation;
    }

    public void setForecastLocation(ForecastLocation forecastLocation) {
        this.forecastLocation = forecastLocation;
    }
}
