package com.mayukh.movie.models;

public class SeatBooking {

    private long id;
    private long holdId;
    private int venueId;
    private int numberOfSeats;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHoldId() {
        return holdId;
    }

    public void setHoldId(long holdId) {
        this.holdId = holdId;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}
