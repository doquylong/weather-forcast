package ua.dp.michaellang.weather.presentation.view;

import android.support.v4.util.Pair;
import ua.dp.michaellang.weather.data.entity.Forecast.HourlyForecast;
import ua.dp.michaellang.weather.data.entity.Location.City;

import java.util.List;


public interface CityListView extends BaseView {
    void onCityListLoaded(List<City> data);

    void onCityWeatherLoaded(Pair<String, HourlyForecast> data);

    void onCityListFiltered(List<City> cities);
}
