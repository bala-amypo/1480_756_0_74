package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;

public class LocationServiceImp implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return Locationrepo.save(le);
    }

}
