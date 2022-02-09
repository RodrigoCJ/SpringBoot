package br.com.solinftec.treinamentospringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "DESCRICAO")
    String descricao;

    @Column(name = "LATITUDE")
    float latitude;

    @Column(name = "LONGITUDE")
    float longitude;

    @Column(name = "ATIVO")
    int ativo;


    //TODO: verificar
    @ManyToOne
    @JsonManagedReference
    @JoinTable(name = "TIPO_EQUIPAMENTO",
            joinColumns={@JoinColumn(name = "ID", referencedColumnName = "ID_TIPO_EQUIPAMENTO")})
    private int tipoEquipamento;
}
