package br.com.solinftec.treinamentospringboot.service;

import br.com.solinftec.treinamentospringboot.model.Equipamento;
import br.com.solinftec.treinamentospringboot.repository.Equipamentorepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipamentoService {

    final Equipamentorepository equipamentorepository;

    public List<Equipamento>
}
