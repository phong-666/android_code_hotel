package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Domain.RoomDomain;
import com.example.myapplication.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder>{
    ArrayList<RoomDomain> lstRoom;
    Context context;

    public RoomAdapter(ArrayList<RoomDomain> lstUser) {
        this.lstRoom = lstUser;
    }

    @NonNull
    @Override
    // chiếu dữ liệu của item
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // nạp layout cho view phần tử
        View userView = inflater.inflate(R.layout.viewholder_room, parent, false);
        RoomViewHolder viewHolder = new RoomViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        //lấy từ item dữ liệu
        RoomDomain domain = lstRoom.get(position);
        //láy vào item dữ liệu của view
        holder.picRoom.setImageBitmap(Utils.convertToBitmapFromAssets(context, domain.getPicRoom()));
        holder.nameRoom.setText(domain.getNameRoom());    }

    @Override
    public int getItemCount() {
        return lstRoom.size();
    }

    // xác định mục tiêu cần ảnh xạ dữ liệu
    class RoomViewHolder extends RecyclerView.ViewHolder{
        TextView nameRoom;
        ImageView picRoom;
        public RoomViewHolder(@NonNull View itemView) {
            super(itemView);
            nameRoom=itemView.findViewById(R.id.nameRoom);
            picRoom=itemView.findViewById(R.id.picRoom);
        }
    }
}
