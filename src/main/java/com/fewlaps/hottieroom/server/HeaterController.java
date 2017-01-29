package com.fewlaps.hottieroom.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaterController {

    @RequestMapping("/heater")
    public double heater(@RequestParam(value = "temperature") String temperature) {
        Application.repository.setActualTemperature(Double.valueOf(temperature));
        return Application.repository.getDesiredTemperature();
    }
}
