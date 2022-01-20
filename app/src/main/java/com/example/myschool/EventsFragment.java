package com.example.myschool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


public class EventsFragment extends Fragment {


    private VideoView videoView;
    private MediaController mc;
    private String path;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        videoView = view.findViewById(R.id.videoView);
        path = "android.resource://"+getActivity().getPackageName()+"/"+R.raw.ucad;
        videoView.setVideoPath(path);
        videoView.setMediaController(mc);
        videoView.start();
        return  view;
    }
}