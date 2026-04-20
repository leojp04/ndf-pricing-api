package com.leojp04.ndfpricing.controller;

import com.leojp04.ndfpricing.dto.NDFRequestDTO;
import com.leojp04.ndfpricing.dto.NDFResponseDTO;
import com.leojp04.ndfpricing.service.NDFService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ndf")
public class NDFController {

    private final NDFService ndfService;
    public NDFController(NDFService ndfService) {
        this.ndfService = ndfService;
    }

    @PostMapping("/price")
    public NDFResponseDTO price(@RequestBody NDFRequestDTO requestDTO){
        return ndfService.calculate(requestDTO);
    }

}
