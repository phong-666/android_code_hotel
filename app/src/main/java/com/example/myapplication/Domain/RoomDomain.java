package com.example.myapplication.Domain;

public class RoomDomain {
    private String ID;
    private String nameRoom;
    private String picRoom;

    public RoomDomain() {
    }

    public RoomDomain(String ID, String nameRoom, String picRoom) {
        this.ID = ID;
        this.nameRoom = nameRoom;
        this.picRoom = picRoom;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getPicRoom() {
        return picRoom;
    }

    public void setPicRoom(String picRoom) {
        this.picRoom = picRoom;
    }
}
