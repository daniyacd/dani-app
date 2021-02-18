package com.example.daniapp;

import java.util.ArrayList;
import java.util.List;

public class PhotoLoader {

    private static  final List<Integer> photoIds = new ArrayList<>();

    private PhotoLoader(){

    }

    public static List<Integer> getPhotoIds(){

        if (photoIds.isEmpty()){
            photoIds.add(R.drawable.apict2);
            photoIds.add(R.drawable.apict3);
            photoIds.add(R.drawable.apict4);
            photoIds.add(R.drawable.formyapp);
        }

        return photoIds;
    }
}
