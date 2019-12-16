
package colecoesenum;

import java.util.Comparator;

public class LocalComparator implements Comparator{
    
    @Override
    public int compare(Object evento1,Object evento2) {
        if((evento1 instanceof Evento) && (evento2 instanceof Evento))
            return ((Evento)evento1).getLocal().getCapital().compareTo(((Evento)evento2).getLocal().getCapital());
        return 0;
    }
}
