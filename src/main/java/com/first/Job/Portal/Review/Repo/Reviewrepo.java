package com.first.Job.Portal.Review.Repo;

import com.first.Job.Portal.Review.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Reviewrepo extends JpaRepository<Review,Long>
{
    @Query(value="select * from review where cid=:cid",nativeQuery = true)
    public Review searchreviewbycid(@Param("cid") Integer cid);
}
