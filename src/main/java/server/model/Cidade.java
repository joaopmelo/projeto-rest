package server.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cidade")
public class Cidade implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    @ManyToOne
    private Estado estado;

    public long getId() {
        return id;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }



}
