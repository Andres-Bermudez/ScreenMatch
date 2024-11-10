package com.aluracursos.screenmatch.repositorio;

import com.aluracursos.screenmatch.modelos.Categoria;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByOrderByEvaluacionDesc();
    List<Serie> findByGenero(Categoria categoria);
    //List<Serie> findByTotalTemporadasLessThanEqualAndEvaluacionGreaterThanEqual(int totalTemporadas, Double evaluacion);

    @Query("SELECT s FROM Serie s WHERE s.totalTemporadas <= :totalTemporadas AND s.evaluacion >= :evaluacion")
    List<Serie> seriesPorTemparadaYEvaluacion(int totalTemporadas, Double evaluacion);

    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE e.titulo ILIKE %:nombreEpisodio%")
    List<Episodio> episodiosPorNombre(String nombreEpisodio);

    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s = :serie ORDER BY e.evaluacion DESC LIMIT 5 ")
    List<Episodio> top5Episodios(Serie serie);
}