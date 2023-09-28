package com.wo.lp2_t1_wilmerocampo.repositories;

import com.wo.lp2_t1_wilmerocampo.entities.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicamentoRepository extends JpaRepository<Medicamento, Integer> {
}
