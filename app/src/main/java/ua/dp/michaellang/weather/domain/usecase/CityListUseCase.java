package ua.dp.michaellang.weather.domain.usecase;

import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import io.reactivex.observers.DisposableObserver;
import ua.dp.michaellang.weather.data.entity.Forecast.HourlyForecast;
import ua.dp.michaellang.weather.data.entity.Location.City;

import java.util.List;


public interface CityListUseCase extends UseCase{
    void getCityList(DisposableObserver<List<City>> observer, @Nullable String countryId,
            @Nullable String language, @Nullable Boolean details);

    void getCurrentCitiesWeather(DisposableObserver<Pair<String, HourlyForecast>> weatherSubscriber,
            Iterable<String> it, String language, boolean b);
}
