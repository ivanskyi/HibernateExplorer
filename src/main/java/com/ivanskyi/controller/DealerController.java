package com.ivanskyi.controller;

import com.ivanskyi.model.Dealer;
import com.ivanskyi.service.DealerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("dealers")
public class DealerController {
    private final DealerService dealerService;

    @GetMapping
    public List<Dealer> getAll() {
        return dealerService.getAll();
    }
}
