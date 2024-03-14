package com.last.project.Eceptions;

import com.last.project.Entity.BootCampers;

public class BootCamperNotFoundEception extends Exception{
    public BootCamperNotFoundEception() {
        super();
    }
    public BootCamperNotFoundEception(String message) {
        super(message);
    }
}
