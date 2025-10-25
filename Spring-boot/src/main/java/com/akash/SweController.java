package com.akash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Software-engineers!")
public class SweController {

    @GetMapping
    public List<Swe> getEnginner(){
        return List.of(
                new Swe(1,"akash","python,docker"),
                new Swe(2,"josh","js,node js, aws")
        );
    }

}
