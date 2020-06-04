package ua.dp.michaellang.weather.presentation.inject.app;

import android.app.Application;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import ua.dp.michaellang.weather.WeatherApplication;

import javax.inject.Singleton;


@Singleton
@Component(modules = {
        AppModule.class,
        UtilsModule.class,
        NetModule.class,
        AndroidInjectionModule.class,
        ActivityBuilderModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(WeatherApplication app);

}
