package io.belajar.apiburung.burung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BurungController {

    @Autowired
    private BurungService burungService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello word";
    }

    @RequestMapping("/burungs")
    public List<BurungInterface> getAllBurung() {
        return burungService.getBurungs();
    }

    @RequestMapping("/burungs/{id}")
    public BurungInterface getBurung(@PathVariable String id) {
        return burungService.getBurung(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/burungs")
    public void addBurung(@RequestBody BurungInterface burung) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/burungs/{id}")
    public void updateBurung(@RequestBody BurungInterface burung, @PathVariable String id) {
        burungService.updateBurung(id, burung);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/burungs/{id}")
    public void deleteBurung(@PathVariable String id) {
        burungService.deleteBurung(id);
    }


}
