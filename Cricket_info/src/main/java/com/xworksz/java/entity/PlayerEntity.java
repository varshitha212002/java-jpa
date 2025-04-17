package com.xworksz.java.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="player_info")
public class PlayerEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
private int id;
    @Column(name="location")
private String location;
    @Column(name="jerserynum")
private int jerserynum;
    @Column(name="country")
private String country;
    @Column(name="iplteam")
private String iplteam;
    @Column(name="score")
private int score;
    @Column(name="age")
private int age;
    @Column(name="year")
private int year;
    @Column(name="dob")
private String dob;




}
