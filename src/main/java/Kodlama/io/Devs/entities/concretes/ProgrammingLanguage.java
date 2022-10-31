package Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
    private int progLangID;
    private String progLangNAME;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int progLangID, String progLangNAME) {
        this.progLangID = progLangID;
        this.progLangNAME = progLangNAME;
    }

    public int getProgLangID() {
        return progLangID;
    }

    public void setProgLangID(int progLangID) {
        this.progLangID = progLangID;
    }

    public String getProgLangNAME() {
        return progLangNAME;
    }

    public void setProgLangNAME(String progLangNAME) {
        this.progLangNAME = progLangNAME;
    }
}
