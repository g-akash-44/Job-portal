package com.first.Job.Portal.Jobs.Service;

import com.first.Job.Portal.Jobs.Entity.Jobs;

import java.util.List;
import java.util.Optional;

public interface JobService
{
    public String create(Jobs j);

    public List<Jobs> getall();

    public Optional<Jobs> searchbyid(Long id);

    public String changebyid(Long id);

    public String deletebyid(Long id);
}
