package server.model;

import server.model.ICadastro;
import server.model.Quarto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reserva_quarto")
public class ReservaQuarto implements ICadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    private Quarto quarto;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_inicio")
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_fim")
    private Date dataFim;
    private Double preco;


    public long getId() {
        return 0;
    }


    public void setId(long id) {

    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
