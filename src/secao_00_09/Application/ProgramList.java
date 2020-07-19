package secao_00_09.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {

        // declaração de lista de valores inteiros
        // a lista não aceita numeros primitivos
        // e precisso usar uma wrapper class
        // para ser instaciada demanda uma classe
        // que implementa a interface 'List'
        // ArrayList é bem otimizado para listas
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
        System.out.println("-----------------");
        list.remove(1);

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
        System.out.println("-----------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
        System.out.println("-----------------");

        System.out.println("Index of bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        /*
        * strem é um tipo que aceita funções lambda
        * a partir do java8
        *
        * objetivo: manter na lista apenas os valores que começam com "A"
        *
        * converte lista para stream, faz a operação
        * e retorna os dados para formato de lista
        * */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


        for (String item : result) {
            System.out.println(item);
        }
        System.out.println("-----------------");

        /*
        * retorna o primeiro nome que começa com 'A'
        * */
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
