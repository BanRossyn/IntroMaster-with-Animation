package com.ban.rossyn.intromaster.slide1;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.ban.rossyn.intromaster.R;



public class SliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;


    public SliderAdapter(Context context) {

        this.context = context;
    }

    // img Array
    public int[] image_slide ={
            R.drawable.eat_icon,
            R.drawable.group_11,
            R.drawable.group_12
    };

    // heading Array
    public String[] heading_slide ={
            "EAT",
            "SLEEP",
            "CODE"
    };

    // description Array
    public String[] description_slide ={
            "Splash Screen like professional\nwith Animation in Android Studio",
            "When I Wrote this Code,\nonly God and I Understood What i did. \nNow Only God Knows!",
            "if(brain!=empty){\n    KeepCoding();\n }\nelse{\n      ordeCoffee();\n}"
    };




    @Override
    public int getCount() {

        return heading_slide.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);
        container.addView(view);

        ImageView slide_imageView = view.findViewById(R.id.imageView1);
        TextView slideHeading = view.findViewById(R.id.tvHeading);
        TextView  slideDescription = view.findViewById(R.id.tvDescription);

        slide_imageView.setImageResource(image_slide[position]);
        slideHeading.setText(heading_slide[position]);
        slideDescription.setText(description_slide[position]);

        return view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }



}


