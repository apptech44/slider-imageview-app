package com.example.myimagesliderapp.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.myimagesliderapp.R;

public class SliderAdapter extends PagerAdapter {

    private Context context;
    private Integer[] sliderImages = new Integer[]{R.drawable.animal1, R.drawable.animal2, R.drawable.animal4,
            R.drawable.animal7, R.drawable.animal8};

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImages[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public int getCount() {
        return sliderImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
