package com.example.esraa.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.marcinmoskala.arcseekbar.ArcSeekBar;

public class MainAirConditionerActivity extends Fragment {
    ArcSeekBar arcSeekBar;
    ImageButton air,alarm,security,curtain,housekeeping,light,tv,vip,worldclock,room;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main_air_conditioner,container, false);


    }
}
