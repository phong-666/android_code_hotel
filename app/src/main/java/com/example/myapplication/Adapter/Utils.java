package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.myapplication.Domain.RoomDomain;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Utils {
    public static Bitmap convertToBitmapFromAssets(Context context, String nameImage){
        AssetManager assetManager= context.getAssets();

        try{
            InputStream inputStream=assetManager.open("images_room/"+nameImage);
            Bitmap bitmap= BitmapFactory.decodeStream(inputStream);
            return bitmap;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void loadData(ArrayList<RoomDomain> lstRoom){
        lstRoom=new ArrayList<>();
        lstRoom.add(new RoomDomain("1", "phong 1", "room_1.jpg"));
        lstRoom.add(new RoomDomain("2", "phong 2", "room_2.jpg"));
        lstRoom.add(new RoomDomain("3", "phong 3", "room_3.jpg"));
        lstRoom.add(new RoomDomain("4", "phong 4", "room_4.jpg"));
        lstRoom.add(new RoomDomain("5", "phong 5", "room_5.jpg"));
        lstRoom.add(new RoomDomain("6", "phong 6", "room_6.jpg"));
        lstRoom.add(new RoomDomain("7", "phong 7", "room_7.jpg"));
        lstRoom.add(new RoomDomain("8", "phong 8", "room_8.jpg"));
        lstRoom.add(new RoomDomain("9", "phong 9", "room_9.jpg"));
        lstRoom.add(new RoomDomain("10", "phong 10", "room_10.jpg"));

    }
}
