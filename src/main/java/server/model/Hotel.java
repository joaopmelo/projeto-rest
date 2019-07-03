package server.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Bairro bairro;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Andar> andares;


    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public List<Andar> getAndares() {
        return andares;
    }

    public void setAndares(List<Andar> andares) {
        this.andares = andares;
    }


    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
