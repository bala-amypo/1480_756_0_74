package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

public class LocationServiceImp implements LocationService {
    @Autowired
    LocationRepository locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return locationrepo.save(le);
    }
    public List<LocationEntity> getall(){
        return locationrepo.findAll();
    }
    @Override
    public List<LocationEntity> getalllocation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getalllocation'");
    }
 
}
