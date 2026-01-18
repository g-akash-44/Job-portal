package com.first.Job.Portal.ServicesImpl;

import com.first.Job.Portal.Entity.Jobs;
import com.first.Job.Portal.Repository.Jobrepo;
import com.first.Job.Portal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceimpl implements JobService
{
    @Autowired
    private Jobrepo jr;
    private Long id=1L;

    public String create(Jobs jobs)
    {
        jobs.setId(id++);
        jr.save(jobs);
        return "Jobs got created";
    }

    public List<Jobs> getall()
    {
        return jr.findAll();
    }

    public Optional<Jobs> searchbyid(Long id)
    {
        return jr.findById(id);
    }

    public String changebyid(Long id)
    {
        Optional<Jobs> op=jr.findById(id);
        if(!op.isEmpty())
        {
           Jobs j=op.get();
           j.setMaxSalary("12,00,000");
           jr.save(j);
        }
        return "Data got changed";
    }

    public String deletebyid(Long id)
    {
        Optional<Jobs> jo=jr.findById(id);
        if(jo.isPresent())
        {
            Jobs j=jo.get();
            jr.delete(j);
        }
        return "Data got deleted";
    }

}
