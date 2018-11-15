package org.johnny.h2test.restcontroller;

import lombok.extern.slf4j.Slf4j;
import org.johnny.h2test.entity.Duese;
import org.johnny.h2test.repository.IDueseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Transactional
@Slf4j
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
    public Duese getDueseById(@PathVariable("dueseid") Long dueseId) {
        return dueseRepository.getOne(dueseId);
    }

    @PutMapping(path = "/{dueseid}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Duese update(@Valid @RequestBody Duese duese, @PathVariable("dueseid") Long id) {
        log.info("Updating Duese with id: " + id);
        log.info(duese.toString());
        return dueseRepository.save(duese);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Duese create(@Valid @RequestBody Duese duese) {
        log.info("Creating Duese: " + duese.toString());
        return dueseRepository.save(duese);
    }

    @DeleteMapping(path = "/{dueseid}")
    public @ResponseBody void delete(@PathVariable("dueseid") Long id) {
        dueseRepository.deleteById(id);
    }
}
