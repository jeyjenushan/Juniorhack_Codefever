package com.crudoperation.Room;

public class RoomManagement {
    private String roomId;
    private String hostelId;
    private String roomNumber;
    private  int capacity;
    private int availableCapacity;

    public RoomManagement(String roomId, String hostelId, String roomNumber, int capacity, int availableCapacity) {
        this.roomId = roomId;
        this.hostelId = hostelId;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.availableCapacity = availableCapacity;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getHostelId() {
        return hostelId;
    }

    public void setHostelId(String hostelId) {
        this.hostelId = hostelId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

}
