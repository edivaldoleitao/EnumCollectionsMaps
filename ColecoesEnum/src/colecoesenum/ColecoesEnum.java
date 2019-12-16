
package colecoesenum;

import java.time.LocalDateTime;
import java.time.Month;


public class ColecoesEnum {


    public static void main(String[] args) {
        
        Evento e1 = new Evento("a", CidadeEnum.MACEIO, LocalDateTime.now());
        Evento e2 = new Evento("b", CidadeEnum.RECIFE, LocalDateTime.now());
        Evento e3 = new Evento("c", CidadeEnum.FORTALEZA, LocalDateTime.now());
        Evento e4 = new Evento("d", CidadeEnum.TERESEINA, LocalDateTime.of(1200, Month.MARCH, 19, 0, 0));
        Evento e5 = new Evento("e", CidadeEnum.SALVADOR, LocalDateTime.of(1200, Month.NOVEMBER, 19, 0, 0));
        Evento[] eventolista = {e1,e2,e3,e4,e5};
        RepositorioEventos repo = new RepositorioEventos(eventolista);
       // repo.ordenarPorLocal();
        repo.ordenarPorData();
        System.out.println(repo.toString());
        System.out.println(repo.contemEvento("f"));
        
    }
    
}
