package br.com.solinftec.treinamentospringboot.dto.cooperativa;

import br.com.solinftec.treinamentospringboot.model.Cooperativa;
import lombok.Data;

@Data
public class CooperativaDto {

    private Long id;
    private String nome;
    private String email;

    public CooperativaDto(Cooperativa cooperativa) {
        this.id = cooperativa.getId();
        this.nome = cooperativa.getNome();
        this.email = cooperativa.getEmail();
    }


}
