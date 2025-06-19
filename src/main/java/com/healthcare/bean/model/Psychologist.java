
package com.healthcare.bean.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Psychologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String fullName;
    private String category;
    private String specialization;
    private String email;
    private String phone;
    private String dob;
    private String language;
    private String gender;
    private String briefDescription;
    private String currentAddress;
    private String country;
    private String timeZone;

    @OneToMany(mappedBy = "psychologist", cascade = CascadeType.ALL)
    private List<Experience> experiences;



}
