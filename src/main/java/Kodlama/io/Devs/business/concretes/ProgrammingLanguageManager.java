package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        for (ProgrammingLanguage progLang : programmingLanguageRepository.getAll()) {
            if (programmingLanguage.getProgLangNAME().equals(progLang.getProgLangNAME())) {
                throw new Exception("Programlama dili mevcut");
            } else if (programmingLanguage.getProgLangNAME().isEmpty()) {
                throw new Exception("Programlama dili boş geçilemez");
            } else {
                programmingLanguageRepository.add(programmingLanguage);
            }
        }

    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(int index, ProgrammingLanguage programmingLanguage) throws Exception {
        for (ProgrammingLanguage progLang : programmingLanguageRepository.getAll()) {
            if (programmingLanguage.getProgLangNAME().equals(progLang.getProgLangNAME())) {
                throw new Exception("Programlama dili mevcut");
            } else if (programmingLanguage.getProgLangNAME().isEmpty()) {
                throw new Exception("Programlama dili boş geçilemez");
            } else {
                programmingLanguageRepository.update(index, programmingLanguage);
            }
        }

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int progLangID) {
        return programmingLanguageRepository.getById(progLangID);
    }
}
