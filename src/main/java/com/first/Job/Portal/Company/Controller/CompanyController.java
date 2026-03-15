package com.first.Job.Portal.Company.Controller;

import com.first.Job.Portal.Company.Entity.Company;
import com.first.Job.Portal.Company.Service.Companyservice;
import com.first.Job.Portal.Jobs.Entity.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController
{
    @Autowired
    private Companyservice cs;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody Company c)
    {
        return new ResponseEntity<String>(cs.createCompany(c), HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Company>> getall()
    {
        return new ResponseEntity<List<Company>>(cs.getallcmpy(),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updatebyid(@PathVariable Integer id)
    {
        return new ResponseEntity<String>(cs.updatecmpybyid(id),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletebyid(@PathVariable Integer id)
    {
        return new ResponseEntity<String>(cs.deletecmpybyid(id),HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Company>> getbyid(@RequestParam Integer id)
    {
        return new ResponseEntity<Optional<Company>>(cs.getcmpybyid(id),HttpStatus.CREATED);
    }

    @PutMapping("/putjobs/{cid}")
    public ResponseEntity<String> putjobsincmp(@PathVariable Integer cid, @RequestBody List<Jobs> j)
    {
        return new ResponseEntity<String>(cs.putjobsincmpy(cid,j), HttpStatus.ACCEPTED);
    }
}
