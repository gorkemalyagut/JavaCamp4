package Kodlama.io.Devs.webApi.controllers;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/programming-language")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/get-all")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/get-by-id")
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageService.getById(id);
    }
    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }
    @DeleteMapping("/delete")
    public void delete(int id){
        programmingLanguageService.delete(id);
    }
    @PutMapping("/update")
    public void update(int index, ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.update(index, programmingLanguage);
    }

}
