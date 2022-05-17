package casestudy.models;

import java.time.LocalTime;

public class Booking {
    private int codeBooking;
    private LocalTime startDay;
    private LocalTime endDay;
    private int customerCode;
    private String serviceName;
    private String serviceType;

    public Booking(int codeBooking, LocalTime startDay, LocalTime endDay, int customerCode, String serviceName, String serviceType) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;

    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int code) {
        this.codeBooking = codeBooking;
    }

    public LocalTime getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalTime startDay) {
        this.startDay = startDay;
    }

    public LocalTime getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalTime endDay) {
        this.endDay = endDay;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
