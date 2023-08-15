package com.bank.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bank_list")
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    long id;
    @Column(name = "branchName")
    String branchName;

    @Column(name = "contactNo")
    long contactNo;
    @Column(name = "state")
    String email;


    @OneToOne
    @JoinColumn(name = "add_id", referencedColumnName = "id")
    BankAddress address ;

    //Every branch has many service so using many-to-many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "bankServiceList", joinColumns = {@JoinColumn(name = "service_di", referencedColumnName = "id"),
    },inverseJoinColumns = {@JoinColumn(name = "bank_id",referencedColumnName = "id")})
    List<BankServiceList> service;


    @OneToMany
    @JoinColumn(name = "bank_id",referencedColumnName = "id")
    List< BankEmployee> bankEmployee;


}
