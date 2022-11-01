package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>(); //boş bir liste
        programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(4, "Dart"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.getProgLangID() == id);
        System.out.println("Deleted");
//        for(ProgrammingLanguage programmingLanguage : programmingLanguages){
//            if(programmingLanguage.getProgLangID() == id){
//                programmingLanguages.remove(programmingLanguage);
//            }
//        }
    }

    @Override
    public void update(int index, ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage progLang : programmingLanguages) {
            if (progLang.getProgLangID() == programmingLanguage.getProgLangID()) {
                programmingLanguages.set(index, programmingLanguage);
                System.out.println("update:" + progLang.getProgLangNAME() + "programming language is update");
            }
        }
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int progLangID) {
        for (ProgrammingLanguage progLang : programmingLanguages) {
            if (progLang.getProgLangID() == progLangID) {
                System.out.println("getById: " + progLang.getProgLangNAME() + " programming language");
            }
        }
        return null;
    }
}
