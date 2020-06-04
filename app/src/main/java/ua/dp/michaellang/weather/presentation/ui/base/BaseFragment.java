package ua.dp.michaellang.weather.presentation.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;


public abstract class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadArgs();
        //inject();
    }

    protected abstract void loadArgs();

   /* protected AppComponent getApplicationComponent() {
        return ((WeatherApplication) getActivity().getApplication()).getApplicationComponent();
    }

    protected FragmentModule getFragmentModule() {
        return new FragmentModule(this);
    }

    protected abstract void inject() throws IllegalStateException;*/
}
