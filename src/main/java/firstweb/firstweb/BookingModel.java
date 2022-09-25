package firstweb.firstweb;


import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.*;
import java.awt.geom.GeneralPath;

@Entity
@Table(name="booking")
public class BookingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int numOfNights;


    public BookingModel(String hotelName, double pricePerNight, int numOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numOfNights = numOfNights;
    }

    public BookingModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight * numOfNights;
    }
}
