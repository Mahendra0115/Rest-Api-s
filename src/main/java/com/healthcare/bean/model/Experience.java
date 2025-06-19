package com.healthcare.bean.model;

import com.healthcare.bean.model.Psychologist;
import jakarta.persistence.*;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int serialNo;
    private String designation;
    private String startingDate;
    private String endingDate;
    private String certification;

    @ManyToOne
    @JoinColumn(name = "psychologist_id")
    private Psychologist psychologist;
}
