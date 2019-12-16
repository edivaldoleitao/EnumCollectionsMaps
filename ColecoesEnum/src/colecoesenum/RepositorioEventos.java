
package colecoesenum;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.Map;

public class RepositorioEventos {
   Map<String, Evento> eventos;
   
   public RepositorioEventos(Evento[] eventolista) {
       eventos = new LinkedHashMap<>();
       for(Evento e : eventolista) {
           if(!eventos.containsKey(e.getNome()))
                eventos.put(e.getNome(), e);
           else 
               eventos.replace(e.getNome(), e);
       }
   }
   @Override
   public String toString() {
       
       String s = "";
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       for(Map.Entry<String, Evento> entry : eventos.entrySet()) {
           s += "Nome Evento " + entry.getKey() + " - " + "Cidade do evento " + entry.getValue().getLocal().getCapital() + " - " + "data " + entry.getValue().getDataHora().format(formatter) + "\n";
       }  
       return s;
   }

   public boolean contemEvento(String nomeEvento) {
       boolean bool = false;
       if(eventos.containsKey(nomeEvento))
           bool = true;
       return bool;
   }

   public List<Evento> ordenarPorData() {
       List<Evento> lista = new ArrayList<>();
       for(Map.Entry<String, Evento> entry : eventos.entrySet()) {
        lista.add(entry.getValue());
       }
       Collections.sort(lista,Collections.reverseOrder());
      // lista.sort(Comparator.comparing(o -> o.getDataHora()));
       this.eventos.clear();
       for(int i = 0; i < lista.size(); i++) {
           this.eventos.put(lista.get(i).getNome(), lista.get(i));
       }
       lista.sort(Comparator.comparing(o -> o.getDataHora()));
       return lista;
   }                                                                                                  

   public List<Evento> ordenarPorLocal() {
       LocalComparator comparador = new LocalComparator();
       List<Evento> list = new ArrayList<>();
       for(Map.Entry<String, Evento> entry : eventos.entrySet()) {
           list.add(entry.getValue());
       }
       Collections.sort(list, comparador);
       this.eventos.clear();
       
       for(int i = 0; i < list.size(); i++) {
           this.eventos.put(list.get(i).getNome(), list.get(i));
       }
       
       
       return list;
   }
   
}


        