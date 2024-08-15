package br.com.projetos.joao.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataMovie(@JsonAlias("Title") String titulo,
                        @JsonAlias("imdbRating") String avalicao,
                        @JsonAlias("Year") String dataDeLancamento,
                        @JsonAlias("Runtime") String duracao,
                        @JsonAlias("Genre") String genero) {

    @Override
    public String toString() {
        return "Título: " + titulo + '\n' +
                "Avalicao: " + avalicao + '\n' +
                "Data de Lançamento: " + dataDeLancamento + '\n' +
                "Duração: " + duracao + '\n' +
                "Gênero: " + genero + '\n';
    }
}
