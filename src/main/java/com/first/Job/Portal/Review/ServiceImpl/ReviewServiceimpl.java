package com.first.Job.Portal.Review.ServiceImpl;

import com.first.Job.Portal.Company.Entity.Company;
import com.first.Job.Portal.Company.Repo.Companyrepo;
import com.first.Job.Portal.Company.Service.Companyservice;
import com.first.Job.Portal.Review.Entity.Review;
import com.first.Job.Portal.Review.Repo.Reviewrepo;
import com.first.Job.Portal.Review.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ReviewServiceimpl implements ReviewService
{
    @Autowired
    private Reviewrepo rr;

    @Autowired
    private Companyrepo cr;

    @Autowired
    private Companyservice cs;

    public String CreateReview(Review r)
    {
        rr.save(r);
        return "Review Just got created";
    }

    @Override
    public String createreviewbycid(Integer cid, Long rid) {
        Review r=rr.findById(rid).get();
        Company c=cs.getcmpybyid(cid).get();
        c.setReviews(r);
        cr.save(c);
        return "Review got created";
    }

    @Override
    public Review getreviewbycpyid(Integer cid) {
        Company c=cs.getcmpybyid(cid).get();
        return c.getReviews();
    }

    @Override
    public String updatereviewofcmpbyid(Integer cid,Review r) {
        Company c=cs.getcmpybyid(cid).get();
        c.setReviews(r);
        cr.save(c);
        return "Review Got Updated";
    }

    @Override
    public String deletereviewofcmpbyid(Integer cid) {
        Review r=cs.getcmpybyid(cid).get().getReviews();
        rr.delete(r);
        return "Review got deleted";
    }
}
