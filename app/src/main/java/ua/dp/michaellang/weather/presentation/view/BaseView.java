package ua.dp.michaellang.weather.presentation.view;

import android.support.annotation.StringRes;


public interface BaseView {
    void onError(@StringRes int stringResId);
}
