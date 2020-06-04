package ua.dp.michaellang.weather.presentation.inject.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ua.dp.michaellang.weather.presentation.ui.fragment.SearchByCountryFragment;


@Subcomponent
public interface SearchByCountryFragmentSubcomponent extends AndroidInjector<SearchByCountryFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchByCountryFragment> {
    }
}
