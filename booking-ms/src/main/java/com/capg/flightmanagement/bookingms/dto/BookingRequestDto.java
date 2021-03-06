package com.capg.flightmanagement.bookingms.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/***
 * @author Shivam Amravanshi
 *
 * This class is use to transfer the booking details
 */
public class BookingRequestDto {
    //booking & passenger Detail
    private BigInteger userId;

    private List<PassengerDetailsDto> passengerList;
    private double ticketCost;
    private BigInteger flightNumber;
    private int numberOfPassengers;
    private String billingAddress;

    //source & destination
    private String bookingDate;
    private String source;
    private String destination;

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String  getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String  bookingDate) {
        this.bookingDate = bookingDate;
    }

    public List<PassengerDetailsDto> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<PassengerDetailsDto> passengerList) {
        this.passengerList = passengerList;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public BigInteger getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(BigInteger flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
