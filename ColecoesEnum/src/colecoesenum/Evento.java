
package colecoesenum;

import java.time.LocalDateTime;
import java.util.Objects;


public class Evento implements Comparable<Evento>{
    private String nome;
    private CidadeEnum local;
    private LocalDateTime dataHora;
    
    public Evento(String nome, CidadeEnum local, LocalDateTime dataHora) {
        this.nome = nome;
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CidadeEnum getLocal() {
        return local;
    }

    public void setLocal(CidadeEnum local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    @Override
    public int compareTo(Evento evento) {
        
        if(this.dataHora.isBefore(evento.getDataHora()))
            return 1;
        if(this.dataHora.isAfter(evento.getDataHora()))
            return -1;
        else 
            return 0;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", local=" + local + ", dataHora=" + dataHora + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.local);
        hash = 29 * hash + Objects.hashCode(this.dataHora);
        System.out.println("nome evento :" + this.nome + "hash :" + hash);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        boolean b = true;
        if (this == obj) {
            b =  true;
        }
        if (obj == null) {
            b = false;
        }
        if (getClass() != obj.getClass()) {
            b =  false;
        }
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            b = false;
        }
        if (this.local != other.local) {
            b = false;
        }
        if (!Objects.equals(this.dataHora, other.dataHora)) {
            b =  false;
        }
        System.out.println(b);
        return b;
    }


    
   
    
}
