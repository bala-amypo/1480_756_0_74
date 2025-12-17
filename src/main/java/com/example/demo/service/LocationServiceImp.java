package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationServiceImp implements LocationService {
    @Autowired
    LocationRepository locationrepo;
    
    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationrepo.save(le);
    }
    
    @Override
    public List<LocationEntity> getalllocation() {
        return locationrepo.findAll(); // This should return all locations from the database
    }
}
