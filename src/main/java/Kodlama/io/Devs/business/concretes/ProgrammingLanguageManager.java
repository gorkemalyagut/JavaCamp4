package Kodlama.io.Devs.business.concretes;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage progLang : programmingLanguageRepository.getAll()) {
            if (Objects.equals(programmingLanguage.getProgLangNAME(), progLang.getProgLangNAME())) {
                System.out.println("Programlama dili mevcut");
            } else if (programmingLanguage.getProgLangNAME() == null) {
                System.out.println("Programlama dili boş geçilemez");
            }

        }

    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage progLang : programmingLanguageRepository.getAll()) {
            if (programmingLanguage.getProgLangNAME().equals(progLang.getProgLangNAME())) {
                System.out.println("Programlama dili mevcut");
            } else if (programmingLanguage.getProgLangNAME() == null) {
                System.out.println("Programlama dili boş geçilemez");
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
