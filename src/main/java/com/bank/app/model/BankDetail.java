package com.bank.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bank_list")
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id")
    long id;
    @Column(name="branchName")
    String branchName;

    @Column(name="contactNo")
    long contactNo;
    @Column(name = "state")
    String state;

    @Column(name="city")
    String city;

    @Column(name="streetAddress")
    String streetAddress;

    @Column(name="zipCode")
    int zipCode;





}
