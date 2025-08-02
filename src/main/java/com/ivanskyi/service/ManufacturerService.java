package com.ivanskyi.service;

import com.ivanskyi.model.Manufacturer;
import com.ivanskyi.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> getAll() {
        return manufacturerRepository.findAll();
    }
}
