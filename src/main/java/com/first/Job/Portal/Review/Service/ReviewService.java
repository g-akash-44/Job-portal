package com.first.Job.Portal.Review.Service;

import com.first.Job.Portal.Review.Entity.Review;

import java.util.List;

public interface ReviewService
{
    public String CreateReview(Review r);

    public String createreviewbycid(Integer cid,Long rid);

    public Review getreviewbycpyid(Integer cid);


    public String updatereviewofcmpbyid(Integer cid,Review r);

    public String deletereviewofcmpbyid(Integer cid);


}