package com.bank.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_address")
public class BankAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "streetAddress")
    String streetAddress;

    @Column(name = "city")
    String city;

    @Column(name = "state")
    String state;

    @Column(name = "zipCode")
    int zipCode;
}
