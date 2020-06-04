package ua.dp.michaellang.weather.presentation.ui.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(Context context, T data);
}
