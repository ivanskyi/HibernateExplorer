package com.ivanskyi.service;

import com.ivanskyi.model.Dealer;
import com.ivanskyi.repository.DealerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DealerService {

    private final DealerRepository dealerRepository;

    public List<Dealer> getAll() {
        return dealerRepository.findAll();
    }
}
