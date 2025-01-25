package com.crudoperation.Hotels;

public class HotelManage {

     private String hotelId;
     private String hotelName;
     private String numberOfRooms;

    public HotelManage(String hotelId, String hotelName, String numberOfRooms) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.numberOfRooms = numberOfRooms;
    }
//    hbj

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
