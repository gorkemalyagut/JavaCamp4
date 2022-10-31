package Kodlama.io.Devs.webApi.controllers;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.add(programmingLanguage);
    }
    @GetMapping("/delete")
    public void delete(int id){
        programmingLanguageService.delete(id);
    }
    @GetMapping("/update")
    public void update(int id, ProgrammingLanguage programmingLanguage){
        programmingLanguageService.update(id, programmingLanguage);
    }

}
