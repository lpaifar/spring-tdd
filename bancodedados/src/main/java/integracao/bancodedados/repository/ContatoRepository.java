package integracao.bancodedados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import integracao.bancodedados.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}