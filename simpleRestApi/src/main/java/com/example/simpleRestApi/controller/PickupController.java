package com.example.simpleRestApi.controller;

import com.example.simpleRestApi.PickupPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PickupController {

    @GetMapping("/pickuppoint")
    public PickupPoint getPickupPoint(@RequestParam(value = "name", defaultValue = "Haydon Library") String name){

        List<PickupPoint> allPoints = createAllPoints();

        for(int i=0;i<allPoints.size();i++){
            if(allPoints.get(i).getPlaceName().equals(name))
                return allPoints.get(i);
        }

        return new PickupPoint(100, 100, name);
    }

    @GetMapping("/points")
    public List<PickupPoint> getAllPickupPoints(){
        return createAllPoints();
    }



    public List<PickupPoint> createAllPoints(){

        List<PickupPoint> pickupPoints = new ArrayList<>();
        PickupPoint haydon = new PickupPoint(90, -100, "Haydon");
        PickupPoint lightrail = new PickupPoint(190, 1600, "lightrail");
        PickupPoint sdfc = new PickupPoint(9230, 3400, "SDFC");

        pickupPoints.add(haydon);
        pickupPoints.add(lightrail);
        pickupPoints.add(sdfc);

        return pickupPoints;
    }

}
