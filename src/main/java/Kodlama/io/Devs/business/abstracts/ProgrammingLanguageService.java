package Kodlama.io.Devs.business.abstracts;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int id);
    void update(int index, ProgrammingLanguage programmingLanguage) throws Exception;
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int progLangID);
}
