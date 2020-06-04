package ua.dp.michaellang.weather.presentation.view;

import ua.dp.michaellang.weather.data.entity.Location.Region;

import java.util.List;


public interface CountryListView extends BaseView {
    void onCountryListLoaded(List<Region> data);
}
