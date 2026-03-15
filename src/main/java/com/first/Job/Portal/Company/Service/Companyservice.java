package com.first.Job.Portal.Company.Service;

import com.first.Job.Portal.Company.Entity.Company;
import com.first.Job.Portal.Jobs.Entity.Jobs;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface Companyservice
{
    public String createCompany(Company c);

    public List<Company> getallcmpy();

    public Optional<Company> getcmpybyid(Integer cid);

    public String updatecmpybyid(Integer cid);

    public String deletecmpybyid(Integer cid);

    public String putjobsincmpy(Integer cid, List<Jobs> j);
}
