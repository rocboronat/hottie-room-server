package com.fewlaps.hottieroom.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @RequestMapping("/remote")
    public double remote(@RequestParam(value = "temperature", required = false) String temperature) {
        if (temperature != null) {
            Application.repository.setDesiredTemperature(Double.valueOf(temperature));
        }
        return Application.repository.getActualTemperature();
    }
}
