package com.cursospringalura.ScreenMatch.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Serie(

        @JsonAlias("Title")
        String titulo,

        @JsonAlias("Year")
        String year,

        @JsonAlias("Rated")
        String calificada,

        @JsonAlias("Released")
        String fechaPublicacion,

        @JsonAlias("Runtime")
        String duracion,

        @JsonAlias("Genre")
        String genero,

        @JsonAlias("Director")
        String director,

        @JsonAlias("Writer")
        String escritor,

        @JsonAlias("Actors")
        String actores,

        @JsonAlias("Plot")
        String sinopsis,

        @JsonAlias("Language")
        String lenguaje,

        @JsonAlias("Country")
        String pais,

        @JsonAlias("Awards")
        String premios,

        @JsonAlias("Poster")
        String imagen,

        @JsonAlias("totalSeasons")
        Integer totalTemporadas,

        @JsonAlias("imdbRating")
        String evaluacion,

        @JsonAlias("imdbVotes")
        String totalVotos
) {

        @Override
        public String toString() {
                return "\nSERIE: " +
                        "\nTitulo: " + titulo +
                        "\nAño: " + year +
                        "\ncalificada: " + calificada +
                        "\nFecha de publicacion: " + fechaPublicacion +
                        "\nDuracion: " + duracion +
                        "\nGenero: " + genero +
                        "\nDirector: " + director +
                        "\nEscritor: " + escritor +
                        "\nActores: " + actores +
                        "\nSinopsis: " + sinopsis +
                        "\nLenguaje: " + lenguaje +
                        "\nPais: " + pais +
                        "\nPremios: " + premios +
                        "\nImagen: " + imagen +
                        "\nTotal de temporadas: " + totalTemporadas +
                        "\nEvaluacion: " + evaluacion +
                        "\nTotal de votos: " + totalVotos;
        }
}
