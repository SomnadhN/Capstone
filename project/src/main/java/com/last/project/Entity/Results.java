package com.last.project.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="results")
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BcId;
    private String subject;
    private int marks;
    private int performance;

    @ManyToOne
    private BootCampers bootCampers;


}
