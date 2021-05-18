package com.example.naviagationd.ui.gallery;

import android.media.MediaPlayer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.naviagationd.R;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }



    public LiveData<String> getText() {
        return mText;
    }
}