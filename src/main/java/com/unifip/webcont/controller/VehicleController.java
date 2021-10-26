package com.unifip.webcont.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.unifip.webcont.model.VehicleModel;
import com.unifip.webcont.services.VehicleServices;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {
    private VehicleServices vehicleServices = new VehicleServices();
    
    @RequestMapping(value = "/")
    public List<VehicleModel> searchVehicle() {
        
        return vehicleServices.searchVehicle();
    }

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public void createVehicle(VehicleModel vehicleModel) {
        vehicleServices.create(vehicleModel)
    }
}

