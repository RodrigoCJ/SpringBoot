package br.com.solinftec.treinamentospringboot.repository;

import br.com.solinftec.treinamentospringboot.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Equipamentorepository extends JpaRepository<Equipamento, Long> {
}
