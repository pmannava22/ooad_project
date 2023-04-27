package com.cab.exceptions;

public class TripBookingException extends RuntimeException{

    public TripBookingException() {
    }

    public TripBookingException(String message) {
        super(message);
    }
}
