package com.ivanskyi.service;

import com.ivanskyi.model.Model;
import com.ivanskyi.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {

    final ModelRepository modelRepository;

    public List<Model> getModels() {
        return this.modelRepository.findAll();
    }
}
