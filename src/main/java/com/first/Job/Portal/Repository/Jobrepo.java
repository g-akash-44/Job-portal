package com.first.Job.Portal.Repository;

import com.first.Job.Portal.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jobrepo extends JpaRepository<Jobs, Long>
{

}
