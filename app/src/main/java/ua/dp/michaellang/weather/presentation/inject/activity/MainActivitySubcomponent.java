package ua.dp.michaellang.weather.presentation.inject.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ua.dp.michaellang.weather.presentation.ui.activity.MainActivity;

@Subcomponent(modules = {
        MainActivityModule.class,
        ActivityModule.class,
        FragmentBuilderModule.class
})
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
