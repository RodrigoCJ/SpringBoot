package br.com.solinftec.treinamentospringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FAZENDA")
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "DESCRICAO")
    String descricao;

    @Column(name = "AREA")
    float area;

    @Column(name = "LATITUDE")
    float latitude;

    @Column(name = "LONGITUDE")
    float longitude;


    //TODO: verificar
    @ManyToOne
    @JsonManagedReference
    @JoinTable(name = "FAZENDEIRO",
            joinColumns={@JoinColumn(name = "ID", referencedColumnName = "ID_FAZENDEIRO")})
    private int idFazendeiro;
}
