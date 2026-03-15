package com.first.Job.Portal.Review.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.first.Job.Portal.Company.Entity.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;
    private String title;
    private String description;
    private double rating;

    @JsonIgnore
    @ManyToOne
    private Company company;

}
