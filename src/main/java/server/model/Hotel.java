package server.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Hotel implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    private Bairro bairro;
    @OneToMany(mappedBy = "hotel")
    private List<Andar> andares = new ArrayList<>();


    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {
        this.id=id;
    }

    public List<Andar> getAndares() {
        return andares;
    }

    public void setAndares(List<Andar> andares) {
        this.andares = andares;
    }
}