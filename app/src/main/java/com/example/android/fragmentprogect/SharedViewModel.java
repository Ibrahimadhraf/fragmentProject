package com.example.android.fragmentprogect;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.widget.ListView;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<CharSequence> text=new MutableLiveData<>();
    public void setText(CharSequence input){
        //update the data in Ui thread
        text.setValue(input);
    }
    public LiveData<CharSequence> getText(){
     return text;
    }
}
