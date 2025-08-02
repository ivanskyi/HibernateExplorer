package com.ivanskyi.controller;

import com.ivanskyi.model.Model;
import com.ivanskyi.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("models")
@RequiredArgsConstructor
public class ModelController {

    private final ModelService modelService;

    @GetMapping
    List<Model> getModels() {
        return modelService.getModels();
    }
}
