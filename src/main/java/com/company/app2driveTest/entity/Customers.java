package com.company.app2driveTest.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Customers {
    private Integer customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private BigDecimal creditLimit;
    private Collection<Payments> paymentsByCustomerNumber;

    @Id
    @Column(name = "customerNumber", nullable = false)
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Basic
    @Column(name = "customerName", nullable = false, length = 50)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "contactLastName", nullable = false, length = 50)
    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    @Basic
    @Column(name = "contactFirstName", nullable = false, length = 50)
    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "addressLine1", nullable = false, length = 50)
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Basic
    @Column(name = "addressLine2", nullable = true, length = 50)
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 50)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "postalCode", nullable = true, length = 15)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "creditLimit", nullable = true, precision = 2)
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return Objects.equals(customerNumber, customers.customerNumber) &&
                Objects.equals(customerName, customers.customerName) &&
                Objects.equals(contactLastName, customers.contactLastName) &&
                Objects.equals(contactFirstName, customers.contactFirstName) &&
                Objects.equals(phone, customers.phone) &&
                Objects.equals(addressLine1, customers.addressLine1) &&
                Objects.equals(addressLine2, customers.addressLine2) &&
                Objects.equals(city, customers.city) &&
                Objects.equals(state, customers.state) &&
                Objects.equals(postalCode, customers.postalCode) &&
                Objects.equals(country, customers.country) &&
                Objects.equals(creditLimit, customers.creditLimit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, creditLimit);
    }

    @OneToMany(mappedBy = "customersByCustomerNumber")
    public Collection<Payments> getPaymentsByCustomerNumber() {
        return paymentsByCustomerNumber;
    }

    public void setPaymentsByCustomerNumber(Collection<Payments> paymentsByCustomerNumber) {
        this.paymentsByCustomerNumber = paymentsByCustomerNumber;
    }
}
