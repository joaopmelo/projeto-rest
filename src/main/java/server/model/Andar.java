package server.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "andar")
public class Andar implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Hotel hotel;
    @Column(nullable = false)
    private int numeroAndar;
    @OneToMany(mappedBy = "andar")
    private List<Quarto> quartos;


    public long getId() {
        return 0;
    }

    public void setId(long id) {

    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }
}
