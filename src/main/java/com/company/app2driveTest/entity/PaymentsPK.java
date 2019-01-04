package com.company.app2driveTest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PaymentsPK implements Serializable {
    private Integer customerNumber;
    private String checkNumber;

    @Column(name = "customerNumber", nullable = false)
    @Id
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Column(name = "checkNumber", nullable = false, length = 50)
    @Id
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentsPK that = (PaymentsPK) o;
        return Objects.equals(customerNumber, that.customerNumber) &&
                Objects.equals(checkNumber, that.checkNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerNumber, checkNumber);
    }
}
