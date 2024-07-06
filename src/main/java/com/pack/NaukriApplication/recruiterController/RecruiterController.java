package com.pack.NaukriApplication.recruiterController;


import com.pack.NaukriApplication.model.Recruiter;
import com.pack.NaukriApplication.recruiterservice.RecruiterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/naukri/recruiter")
public class RecruiterController {

    private RecruiterService recruiterService;

    public RecruiterController(RecruiterService recruiterService) {
        super();
        this.recruiterService=recruiterService;
    }

    @PostMapping("/add")
    public ResponseEntity<Recruiter> saveRecruiter(@RequestBody Recruiter recruiter) {
        Recruiter newRecruiter = recruiterService.saveRecruiter(recruiter);
        if (newRecruiter == null) {
            return ResponseEntity.unprocessableEntity().build();
        }
//        return  ResponseEntity.status(HttpStatus.CREATED).body(newRecruiter);
        return new ResponseEntity<Recruiter>(recruiterService.saveRecruiter(recruiter),HttpStatus.CREATED);

    }

    @GetMapping
    public List<Recruiter> getAllEmployees() {
        return recruiterService.getAllRecruiters();

    }

    //build get Recruiter by ID
    //localhost:8080/api/recruiter/1
    //dynamically we can change id
    @GetMapping("{Id}")
    public ResponseEntity<Recruiter> getRecruiterById(@PathVariable("Id") long Id) {
        return new ResponseEntity<Recruiter>(recruiterService.getRecruiterById(Id), HttpStatus.OK);
    }

    //build Update recruiter
    //localhost:8080/api/employees/1
    //@request body is used to get json body
    @PutMapping("{Id}")
    public ResponseEntity<Recruiter> updateRecruiter(@PathVariable("Id") long Id
            , @RequestBody Recruiter recruiter) {
        return new ResponseEntity<Recruiter>(recruiterService.updateRecruiter(recruiter, Id), HttpStatus.OK);
    }

    public void deleteRecruiter(@PathVariable long Id) {
        Recruiter recruiter = recruiterService.getRecruiterById(Id);
        recruiterService.deleteRecruiter(recruiter, Id);

    }
}


