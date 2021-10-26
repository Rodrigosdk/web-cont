package com.unifip.webcont.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.unifip.webcont.model.VehicleModel;
import com.unifip.webcont.repositorys.VehicleRepository;

public class VehicleServices {
    
    public List<VehicleModel> searchVehicle() {
        VehicleRepository vehicleRepository = new VehicleRepository();
        Map<Long, VehicleModel> vehiclesDB = vehicleRepository.searchVehicle();
        return vehiclesDB.values().stream().collect(Collectors.toList());
    }
}
