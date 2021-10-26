package com.unifip.webcont.repositorys;

import java.util.HashMap;
import java.util.Map;

import com.unifip.webcont.model.VehicleModel;

public class VehicleRepository {
    private Map<Long, VehicleModel> vehiclesDB = new HashMap<>();

    public Map<Long, VehicleModel> searchVehicle() {
        return vehiclesDB;
    }

    public Map<Long, VehicleModel>  create(VehicleModel vehicle) {
        vehiclesDB.put(vehicle.getCode(), vehicle);
        return vehiclesDB;   
    }

    public Map<Long, VehicleModel>  update(Long code, VehicleModel vehicle) {
        vehiclesDB.put(code, vehicle);
        return vehiclesDB;   
    }
    
}
