package ua.dp.michaellang.weather.presentation.inject.app;

import dagger.Module;
import dagger.Provides;
import ua.dp.michaellang.weather.presentation.utils.AssetsUtils;


@Module
public class UtilsModule {
    @Provides
    AssetsUtils provideAssertsUtils() {
        return new AssetsUtils();
    }
}
