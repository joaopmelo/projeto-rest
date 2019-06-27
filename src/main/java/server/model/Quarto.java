package server.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Quarto implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private int numeroQuarto;
    @Column(nullable = false)
    private int totalCamas;
    @Column(precision = 10, scale = 2, nullable = false)
    private Double preco;
    @ManyToOne
    private Andar andar;


    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {

    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getTotalCamas() {
        return totalCamas;
    }

    public void setTotalCamas(int totalCamas) {
        this.totalCamas = totalCamas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Andar getAndar() {
        return andar;
    }

    public void setAndar(Andar andar) {
        this.andar = andar;
    }
}