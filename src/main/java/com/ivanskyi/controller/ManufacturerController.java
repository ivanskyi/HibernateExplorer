package com.ivanskyi.controller;

import com.ivanskyi.model.Manufacturer;
import com.ivanskyi.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("manufacturers")
@RequiredArgsConstructor
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> getAllManufacturers() {
        return this.manufacturerService.getAll();
    }
}
