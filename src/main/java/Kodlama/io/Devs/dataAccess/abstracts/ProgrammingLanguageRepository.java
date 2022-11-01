package Kodlama.io.Devs.dataAccess.abstracts;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(int index, ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int progLangID);
}
