package com.first.Job.Portal.Review.Controller;

import com.first.Job.Portal.Review.Entity.Review;
import com.first.Job.Portal.Review.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company/{cid}")
public class ReviewController
{
    @Autowired
    private ReviewService rs;

    @PostMapping("/createReview")
    public ResponseEntity<String> create(@RequestBody Review r)
    {
        return new ResponseEntity<String>(rs.CreateReview(r),HttpStatus.CREATED);
    }

    @PostMapping("/review/create")
    public ResponseEntity<String> createReviewbyid(@PathVariable Integer cid, @PathVariable Long rid)
    {
        return new ResponseEntity<String>(rs.createreviewbycid(cid,rid), HttpStatus.CREATED);
    }

    @GetMapping("/get/review")
    public ResponseEntity<Review> getreviewbycid(@PathVariable Integer cid)
    {
        return new ResponseEntity<Review>(rs.getreviewbycpyid(cid),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updatereviewbycid(@PathVariable Integer cid, @RequestBody Review r)
    {
        return new ResponseEntity<String>(rs.updatereviewofcmpbyid(cid,r),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletereview(@PathVariable Integer cid)
    {
        return new ResponseEntity<String>(rs.deletereviewofcmpbyid(cid),HttpStatus.ACCEPTED);
    }
 }
