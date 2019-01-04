package com.company.app2driveTest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(PaymentsPK.class)
public class Payments {
    private Integer customerNumber;
    private String checkNumber;
    private Date paymentDate;
    private BigDecimal amount;
    private Customers customersByCustomerNumber;

    @Id
    @Column(name = "customerNumber", nullable = false)
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Id
    @Column(name = "checkNumber", nullable = false, length = 50)
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Basic
    @Column(name = "paymentDate", nullable = false)
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payments payments = (Payments) o;
        return Objects.equals(customerNumber, payments.customerNumber) &&
                Objects.equals(checkNumber, payments.checkNumber) &&
                Objects.equals(paymentDate, payments.paymentDate) &&
                Objects.equals(amount, payments.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerNumber, checkNumber, paymentDate, amount);
    }

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "customerNumber", referencedColumnName = "customerNumber", nullable = false, insertable = false, updatable = false)
    public Customers getCustomersByCustomerNumber() {
        return customersByCustomerNumber;
    }

    public void setCustomersByCustomerNumber(Customers customersByCustomerNumber) {
        this.customersByCustomerNumber = customersByCustomerNumber;
    }
}
