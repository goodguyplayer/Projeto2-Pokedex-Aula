package test;

import model.PokemonList;
import org.json.JSONArray;
import parser.PokemonListParser;

import java.io.*;

// Class created for the purpose of testing json import
public class JsonTest {
    public static void main(String[] args) {
        PokemonList lista = PokemonListParser.fromJson(lerArquivo("dados.json"));
        System.out.println("Lista Carregada");
        System.out.println(lista.getPokemons().get(0).getName());
        System.out.println(lista.getPokemons().get(0).getId());
        System.out.println(lista.getPokemons().get(0).getHeight());
        System.out.println(lista.getPokemons().get(0).getWeight());
        System.out.println(lista.getPokemons().get(0).getDescription());
    }

    private static JSONArray lerArquivo(String nomeArquivo) {
        JSONArray json = null;
        File file = new File(nomeArquivo);
        try{
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            json = new JSONArray (bufferedReader.readLine());

            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();

        }catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
        return json;
    }


    private static void escreverArquivo(String nomeArquivo, JSONArray json) {
        File file = new File(nomeArquivo);
        try{

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("" + json);

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();

        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}

