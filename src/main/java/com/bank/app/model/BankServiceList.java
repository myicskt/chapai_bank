package com.bank.app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "service_list")
public class BankServiceList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String serviceName;
}
