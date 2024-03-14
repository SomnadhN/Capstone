package com.last.project.Controller;

import com.last.project.Eceptions.BootCamperNotFoundEception;
import com.last.project.Entity.BootCampers;
import com.last.project.Repository.BootCamperRepository;
import com.last.project.Service.BootCampersServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BootCamperController {
    @Autowired
    private BootCampersServiceI bootCampersServiceI;

    @Autowired
    private BootCamperRepository bootCamperRepository;



    @PostMapping("/bootcampers")
    public BootCampers addBootCampers(@RequestBody BootCampers tmpBootCampers){
        return bootCampersServiceI.addBootCampers(tmpBootCampers);
    }


    @GetMapping(value = "/bootcampers")
    public List<BootCampers> getAllBootCampers(){
        return bootCampersServiceI.getBootCampers();
    }

    @GetMapping(value= "/bootcampers/{id}")
    public BootCampers getBootCamperById(@PathVariable("id") Long Emp_id)
    throws BootCamperNotFoundEception {
        return bootCampersServiceI.getBootCamperById(Emp_id);
    }

    @DeleteMapping("/bootcampers/{id}")
    public String deleteBootCamperById(@PathVariable("id") Long Emp_id) {
        bootCampersServiceI.deleteBootCamperById(Emp_id);
        return "Department deleted Successfully!!";
    }

    @PutMapping("/bootcampers/{id}")
    public BootCampers updateDepartment(@PathVariable("id") Long Emp_id,
                                       @RequestBody BootCampers tmpBootCampers)  {
        return bootCampersServiceI.updateBootCamper(Emp_id, tmpBootCampers);
    }


}
