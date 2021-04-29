package com.communityhub.springbootproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "hostel")
    private  String hostel;

    @Column(name = "room")
    private  String room;

    @Column(name = "mob")
    private  String mob;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;




}
