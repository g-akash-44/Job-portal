package com.first.Job.Portal.Company.Serviceimpl;

import com.first.Job.Portal.Company.Entity.Company;
import com.first.Job.Portal.Company.Repo.Companyrepo;
import com.first.Job.Portal.Company.Service.Companyservice;
import com.first.Job.Portal.Jobs.Entity.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Companyserviceimpl implements Companyservice
{
    @Autowired
    private Companyrepo cr;

    @Override
    public String createCompany(Company c) {
        cr.save(c);
        return "Company got created";
    }

    @Override
    public List<Company> getallcmpy() {
        return cr.findAll();
    }

    @Override
    public Optional<Company> getcmpybyid(Integer cid) {
        return cr.findById(cid);
    }

    @Override
    public String updatecmpybyid(Integer cid) {
        Optional<Company> ot=cr.findById(cid);
        Jobs j=new Jobs();
        if(ot.isPresent())
        {
            Company c=ot.get();
            c.setName("PVR");
            cr.save(c);
        }
        return "Company got updated";
    }

    @Override
    public String deletecmpybyid(Integer cid) {
        Optional<Company> o =cr.findById(cid);
        if(o.isPresent())
        {
            Company c=o.get();
            cr.delete(c);
        }
        return "Company got deleted";
    }

    @Override
    public String putjobsincmpy(Integer cid,List<Jobs> j) {
        Optional<Company> ot =cr.findById(cid);
        if(ot.isPresent())
        {
            Company c=ot.get();
            c.setJobs(j);
        }
        return "Jobs added in company";
    }
}
