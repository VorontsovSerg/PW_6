package com.example.pw6;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FirstFragment extends Fragment {

    public FirstFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Надуваем макет для этого фрагмента
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.linear_layout_first);
        addImageViews(linearLayout);

        return view;
    }

    private void addImageViews(LinearLayout linearLayout) {
        for (int i = 1; i <= 8; i++) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageResource(getResources().getIdentifier("almir" + i, "drawable", getActivity().getPackageName()));

            // Устанавливаем маргины с отрицательными значениями для создания минимального интервала
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(0, -2, 0, -2);
            layoutParams.gravity = Gravity.CENTER_HORIZONTAL;

            linearLayout.addView(imageView, layoutParams);
        }
    }
}