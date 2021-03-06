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
    long id;

    @Column(name = "DESCRICAO")
    String descricao;

    @Column(name = "AREA")
    float area;

    @Column(name = "LATITUDE")
    float latitude;

    @Column(name = "LONGITUDE")
    float longitude;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDEIRO")
    @JsonManagedReference
    private Fazendeiro fazendeiro;

}
