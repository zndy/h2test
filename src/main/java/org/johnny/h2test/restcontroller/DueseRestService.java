package org.johnny.h2test.restcontroller;

import org.johnny.h2test.entity.Duese;
import org.johnny.h2test.repository.IDueseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/duese")
public class DueseRestService {
    @Autowired
    private IDueseRepository dueseRepository;

    @GetMapping("/dueses")
    public List<Duese> getDueses() {
        return dueseRepository.findAll();
    }

    @GetMapping("/{dueseid}")
    public Duese getDueseById(@PathVariable long dueseid) {
        return dueseRepository.getOne(dueseid);
    }

}
