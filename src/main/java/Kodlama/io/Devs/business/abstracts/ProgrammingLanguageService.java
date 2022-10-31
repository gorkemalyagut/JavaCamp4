package Kodlama.io.Devs.business.abstracts;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(int id, ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int progLangID);
}