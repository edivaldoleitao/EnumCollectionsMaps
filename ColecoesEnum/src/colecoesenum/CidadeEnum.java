
package colecoesenum;

public enum CidadeEnum {
    MACEIO("maceio"),SALVADOR("salvador"),FORTALEZA("fortaleza"),RECIFE("recife"),TERESEINA("teresina");
    
    public String capital;

    private CidadeEnum(String capital2) {
        capital = capital2;
    }
    
    public String getCapital() {
        return capital;
    }
}
