package server.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bairro")
public class Bairro implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    @ManyToOne
    private Cidade cidade;


    public long getId() {
        return 0;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


}
