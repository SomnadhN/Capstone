package com.last.project.Service;

import com.last.project.Eceptions.BootCamperNotFoundEception;
import com.last.project.Entity.BootCampers;

import java.util.List;
import java.util.Map;

public interface BootCampersServiceI {


    public default void deleteBootCamperById(Long empId) {
    }

    public BootCampers addBootCampers(BootCampers bootCampers);

    public List<BootCampers> getBootCampers();

    public BootCampers getBootCamperById(Long empId) throws BootCamperNotFoundEception;

    public BootCampers updateBootCamper(Long empId,BootCampers bootCampers) ;
}
