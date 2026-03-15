package com.first.Job.Portal.Company.Entity;

import com.first.Job.Portal.Jobs.Entity.Jobs;
import com.first.Job.Portal.Review.Entity.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Jobs> jobs;

    @OneToMany(mappedBy = "company")
    private Review reviews;

}
