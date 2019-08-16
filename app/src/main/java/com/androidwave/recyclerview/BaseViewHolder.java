package com.androidwave.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

/**
 * Created on : Jan 26, 2019
 * Author     : AndroidWave
 * Email    : info@androidwave.com
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private int mCurrentPosition;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int position) {
        mCurrentPosition = position;
        clear();
    }

    public int getCurrentPosition() {
        return mCurrentPosition;
    }
}
