package com.ecommerce.Checkoutmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Shipment {

    @Id
    private String shipId;
    private int charges;
    private String time;
    @OneToOne
    private Orders orderId;

    public Shipment(){

    }


    public Shipment(String shipId, int charges, String time, Orders orderId) {
        this.shipId = shipId;
        this.charges = charges;
        this.time = time;
        this.orderId = orderId;
    }


    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }


    public int getCharges() {

        return charges;
    }



    public void setCharges(int charges) {

        this.charges = charges;
    }

    public String getTime() {

        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }


}
