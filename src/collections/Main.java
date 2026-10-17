package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main{

    public static void main(String[] args){

        List<String> alunos = new ArrayList<>();

        alunos.add("Emerson");
        alunos.add("Isabelli");
        alunos.add("Neymar");
        alunos.add("Tulio");
        alunos.add("Neymar");

        Set<String> alunosUnicos = new HashSet<>();

        alunosUnicos.add("Emerson");
        alunosUnicos.add("Isabelli");
        alunosUnicos.add("Neymar");
        alunosUnicos.add("Tulio");

        Map<String, Double> notas = new HashMap<>();

        notas.put("Emerson", 10.0);
        notas.put("Isabelli", 7.7);
        notas.put("Neymar", 4.5);
        notas.put("Tulio", 6.3);

        System.out.println(alunos.size());
        System.out.println(alunosUnicos.size());
        System.out.println(notas.get("Tulio"));
        System.out.println(alunos.contains("Neymar"));
        System.out.println(notas.containsKey("Emerson"));

        alunos.remove("Neymar");
        alunosUnicos.remove("Tulio");
        notas.put("Neymar", 8.0);

        System.out.println(alunos);
        System.out.println(alunosUnicos);
        System.out.println(notas.get("Neymar"));
    }
}