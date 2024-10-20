package com.example.fragmentsederhana;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private final MutableLiveData<Integer> imageId = new MutableLiveData<>();
    private final MutableLiveData<String> carName = new MutableLiveData<>();


    public void setCarData(int imageId, String carName) {
        this.imageId.setValue(imageId);
        this.carName.setValue(carName);

    }

    public LiveData<Integer> getImageId() {
        return imageId;
    }

    public LiveData<String> getCarName() {
        return carName;
    }


}
