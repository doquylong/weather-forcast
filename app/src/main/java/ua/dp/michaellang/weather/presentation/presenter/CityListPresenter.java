package ua.dp.michaellang.weather.presentation.presenter;


public interface CityListPresenter extends BasePresenter {
    void loadCityList(String countryId);
    void loadCitiesWeather();

    void filterData(String query);
}
