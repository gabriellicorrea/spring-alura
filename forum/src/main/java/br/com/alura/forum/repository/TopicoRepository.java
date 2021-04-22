package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

	//@Query("SELECT t FROM topico t WHERE t.cuso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param("nomeCuso")String nomeCurso);

}
