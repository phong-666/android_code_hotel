package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.RoomAdapter;
import com.example.myapplication.Domain.RoomDomain;
import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvListC;
    ArrayList<RoomDomain> lstRoom;
    RoomAdapter roomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListC=findViewById(R.id.rvListRoom);
        //dán dữ liệu vô lớp room
        loadData();
        //gán dữ liệu để hiển thị
        roomAdapter=new RoomAdapter(lstRoom);
        // tạo danh sách hiển thị
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        //đưa dữ liệu vào danh sách
        rvListC.setAdapter(roomAdapter);
        rvListC.setLayoutManager(linearLayoutManager);
    }
    public void loadData(){
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