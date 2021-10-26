package com.unifip.webcont.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.unifip.webcont.model.VehicleModel;
import com.unifip.webcont.repositorys.VehicleRepository;

public class VehicleServices {
    
    private VehicleRepository vehicleRepository = new VehicleRepository();

    public List<VehicleModel> searchVehicle() {
        Map<Long, VehicleModel> vehiclesDB = vehicleRepository.searchVehicle();
        return vehiclesDB.values().stream().collect(Collectors.toList());
    }

    public List<VehicleModel> create(VehicleModel vehicle) {
        Map<Long, VehicleModel> vehiclesDB = vehicleRepository.create(vehicle);
        return vehiclesDB.values().stream().collect(Collectors.toList());
    }
    public List<VehicleModel> update(Long code, VehicleModel vehicle) {
        Map<Long, VehicleModel> vehiclesDB = vehicleRepository.update(code, vehicle);
        return vehiclesDB.values().stream().collect(Collectors.toList());
    }
}
