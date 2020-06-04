package ua.dp.michaellang.weather.presentation.presenter;


public interface WeatherDetailsPresenter extends BasePresenter {
    void loadWeather(String cityCode);

    void addToFavorite(String cityCode);

    void checkIsFavorite(String cityCode);

    void removeFromFavorite(String cityCode);
}
