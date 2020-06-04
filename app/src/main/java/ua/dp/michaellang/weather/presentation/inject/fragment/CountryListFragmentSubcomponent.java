package ua.dp.michaellang.weather.presentation.inject.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ua.dp.michaellang.weather.presentation.ui.fragment.CountryListDialog;


@Subcomponent(modules = CountryListModule.class)
public interface CountryListFragmentSubcomponent extends AndroidInjector<CountryListDialog>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CountryListDialog> {
    }
}
