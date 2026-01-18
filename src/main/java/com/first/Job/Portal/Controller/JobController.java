package com.first.Job.Portal.Controller;

import com.first.Job.Portal.Entity.Jobs;
import com.first.Job.Portal.ServicesImpl.JobServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobController
{
    @Autowired
    private JobServiceimpl js;

    @PostMapping("/create")
    public ResponseEntity<String> createJobs(@RequestBody Jobs j)
    {
        return new ResponseEntity<String>(js.create(j),HttpStatus.CREATED);
    }

    @GetMapping("/fetchall")
    public ResponseEntity<List<Jobs>> getall()
    {
        return new ResponseEntity<List<Jobs>>(js.getall(),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<Optional<Jobs>> searchbyid(@RequestParam Long id)
    {
        return new ResponseEntity<Optional<Jobs>>(js.searchbyid(id),HttpStatus.ACCEPTED);
    }

    @PatchMapping("/update")
    public ResponseEntity<String> updatebyid(@RequestParam Long id)
    {
        return new ResponseEntity<String>(js.changebyid(id),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletebyid(@RequestParam Long id)
    {
        return new ResponseEntity<String>(js.deletebyid(id),HttpStatus.ACCEPTED);
    }

}
