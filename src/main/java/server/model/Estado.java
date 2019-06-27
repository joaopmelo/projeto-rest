package server.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Estado implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
