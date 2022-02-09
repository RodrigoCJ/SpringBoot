package br.com.solinftec.treinamentospringboot.repository;

import br.com.solinftec.treinamentospringboot.model.TipoEquipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEquipamentorepository extends JpaRepository<TipoEquipamento, Long> {
}
