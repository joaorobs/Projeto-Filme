package br.com.projetos.joao;

import br.com.projetos.joao.model.DataMovie;
import br.com.projetos.joao.service.DataConversion;
import br.com.projetos.joao.service.MovieAPI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do filme que deseja ver: ");
        String movieInput = scan.next();

        String endereco = "http://www.omdbapi.com/?apikey=37b85e2d&t=" + movieInput;

        DataConversion converter = new DataConversion();
        MovieAPI movieAPI = new MovieAPI();

        String json = movieAPI.searchMovie(endereco);
        DataMovie movieData = converter.getData(json, DataMovie.class);
        System.out.println(movieData);
    }
}