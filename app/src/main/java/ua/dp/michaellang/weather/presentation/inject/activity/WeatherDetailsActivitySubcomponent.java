package ua.dp.michaellang.weather.presentation.inject.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ua.dp.michaellang.weather.presentation.ui.activity.WeatherDetailsActivity;


@Subcomponent(modules = {
        WeatherDetailsModule.class,
        ActivityModule.class
})
public interface WeatherDetailsActivitySubcomponent extends AndroidInjector<WeatherDetailsActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<WeatherDetailsActivity>{}
}
