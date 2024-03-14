package com.last.project.Service;

import com.last.project.Eceptions.BootCamperNotFoundEception;
import com.last.project.Entity.BootCampers;
import com.last.project.Repository.BootCamperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;

@Service
public class BootCampersService implements BootCampersServiceI{
    @Autowired
    private BootCamperRepository bootCamperRepository;

    @Override
    public void deleteBootCamperById(Long empId) {
        bootCamperRepository.deleteById(empId);
    }

    @Override
    public BootCampers addBootCampers(BootCampers tmpBootCampers) {
        return bootCamperRepository.save(tmpBootCampers);

    }

    @Override
    public List<BootCampers> getBootCampers() {
        return bootCamperRepository.findAll();
    }

    @Override
    public BootCampers getBootCamperById(Long empId) throws BootCamperNotFoundEception {
        Optional<BootCampers> tmpBootCampers = bootCamperRepository.findById(empId);

        if(!tmpBootCampers.isPresent()) {
            throw new BootCamperNotFoundEception("not found Bootcamper With this ID");
        }

        return  tmpBootCampers.get();
    }

    @Override
    public BootCampers updateBootCamper(Long empId, BootCampers bootCampers) {
        return null;
    }


}



//    @Override
//    public BootCampers updateBootCamper(Long empId, BootCampers bootCampers)  {
//
//        BootCampers bootCamper = bootCamperRepository.findById(empId).get();
//
//        if(Objects.nonNull(bootCampers.getName()) &&
//                !"".equalsIgnoreCase(bootCampers.getName())) {
//            bootCamper.setName(bootCampers.getName());
//        }
//
//        if(Objects.nonNull(bootCampers.getEmail_Id()) &&
//                !"".equalsIgnoreCase(bootCampers.getEmail_Id())) {
//            bootCamper.setEmail_Id(bootCampers.getEmail_Id());
//        }
//
//        if (Objects.nonNull(bootCampers.getBatchNo())) {
//            bootCamper.setBatchNo(bootCampers.getBatchNo());
//        }
//
//        if(Objects.nonNull(bootCampers.getEmail_Id()) &&
//                !"".equalsIgnoreCase(bootCampers.getEmail_Id())) {
//            bootCamper.setEmail_Id(bootCampers.getEmail_Id());
//        }
//
//
//        return bootCamperRepository.save(bootCamper);
//    }

