
package colecoesenum;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collection;
import java.util.HashSet;


public class TesteSet {

    
    public static void main(String[] args) {
        Collection eventos = new  HashSet<>();
        Evento e1 = new Evento("a", CidadeEnum.MACEIO, LocalDateTime.now());
        Evento e2 = new Evento("b", CidadeEnum.RECIFE, LocalDateTime.now());
        Evento e3 = new Evento("c", CidadeEnum.FORTALEZA, LocalDateTime.now());
        Evento e4 = new Evento("d", CidadeEnum.TERESEINA, LocalDateTime.of(1200, Month.MARCH, 19, 0, 0));
        Evento e5 = new Evento("e", CidadeEnum.SALVADOR, LocalDateTime.of(1200, Month.NOVEMBER, 19, 0, 0));
        Evento e6 = new Evento("e", CidadeEnum.SALVADOR, LocalDateTime.of(1200, Month.NOVEMBER, 19, 0, 0));
        
        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);
        eventos.add(e4);
        eventos.add(e5);
        eventos.add(e6);
        
    }
    
}
