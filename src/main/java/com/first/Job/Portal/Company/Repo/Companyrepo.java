package com.first.Job.Portal.Company.Repo;

import com.first.Job.Portal.Company.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Companyrepo extends JpaRepository<Company, Integer>
{

}
