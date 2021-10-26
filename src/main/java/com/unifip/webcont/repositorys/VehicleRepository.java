package com.unifip.webcont.repositorys;

import java.util.HashMap;
import java.util.Map;

import com.unifip.webcont.model.VehicleModel;

public class VehicleRepository {
    public Map<Long, VehicleModel>  searchVehicle() {
        Map<Long, VehicleModel> vehiclesDB = new HashMap<>();
        VehicleModel vehicleModel = new VehicleModel(100L, "FIAT", "Uno");
        vehiclesDB.put(vehicleModel.getCode(), vehicleModel);
        return vehiclesDB;   
    }

    public Map<Long, VehicleModel>  create(VehicleModel vehicle) {
        Map<Long, VehicleModel> vehiclesDB = new HashMap<>();
        vehiclesDB.put(vehicle.getCode(), vehicle);
        return vehiclesDB;   
    }
}
