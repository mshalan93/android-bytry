package com.example.bytar.ui.order;

import android.content.Context;
import android.icu.text.UnicodeSetIterator;
import android.os.Bundle;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.example.bytar.R;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public  class MyStepperAdapter extends AbstractFragmentStepAdapter {

    private static final String CURRENT_STEP_POSITION_KEY = "CURRENT_STEP_POSITION_KEY" ;

    public MyStepperAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        final OrderFragment step = new OrderFragment();
        Bundle b = new Bundle();
        b.putInt(CURRENT_STEP_POSITION_KEY, position);
        step.setArguments(b);
        return step;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        StepViewModel.Builder builder = new StepViewModel.Builder(context)
                .setTitle(R.string.app_name)
                ;
        switch (position) {
            case 0:
                builder
                        .setEndButtonVisible(false)
                        .setBackButtonVisible(false)
                        .setNextButtonEndDrawableResId(R.drawable.background_circle1)
                        .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE);
                break;
            case 1:
                builder
                        .setEndButtonLabel("mmmm")
                        .setBackButtonLabel("Go to first")
                        .setBackButtonStartDrawableResId(R.drawable.background_circle);
                break;
            case 2:
                builder
                        .setBackButtonLabel("Go back")
                        .setEndButtonLabel("I'm done!");
                break;
            default:
                throw new IllegalArgumentException("Unsupported position: " + position);
        }
        return builder.create();
    }
}