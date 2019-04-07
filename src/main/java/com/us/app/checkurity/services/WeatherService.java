package com.us.app.checkurity.services;

import com.us.app.checkurity.clients.WeatherClient;
import com.us.app.checkurity.clients.dto.WeatherResponseDTO;
import com.us.app.checkurity.controllers.vo.WeatherResponseVO;
import com.us.app.checkurity.controllers.vo.WeatherResponseVOBuilder;
import com.us.app.checkurity.dto.ApiError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import static com.us.app.checkurity.utils.ServiceUtility.buildWeatherResponseVO;

/**
 * @author Udyan Shardhar
 */
@Service
public class WeatherService {

    @Value( "${weather.api.app.id}" )
    private String apiId;

    @Value( "${weather.api.app.code}" )
    private String apiCode;


    @Value( "${weather.api.country.code}" )
    private String countryCode;

    @Autowired
    private WeatherClient weatherClient;

    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    public WeatherResponseVO getWeather(String zipCode) {
        logger.info("Requesting current weather for zip code {} for country {}", zipCode, countryCode);
        WeatherResponseDTO weatherResponseDTO;
        WeatherResponseVOBuilder weatherResponseVOBuilder = new WeatherResponseVOBuilder();
        try {
            weatherResponseDTO  = weatherClient.getTomorrowWeather(zipCode, apiId, apiCode, countryCode);
            weatherResponseVOBuilder = buildWeatherResponseVO(weatherResponseDTO);
        } catch (RestClientException e) {
            weatherResponseVOBuilder.withError(new ApiError("Could not found zip code, please enter a valid Zip Code", "", ""));
            weatherResponseVOBuilder.withZipCode(zipCode);
        }

        return weatherResponseVOBuilder
                .withZipCode(zipCode)
                .build();
    }

}
