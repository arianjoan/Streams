package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas = Arrays.asList(new Persona("Juan",25,37636113),
                new Persona("Pedro",28,19152989),
                new Persona("Arian",21,40580066),
                new Persona("Ramoncito",16,46123456),
                new Persona("Euclavides",18,44258965),
                new Persona("Cosme Fulanito",34,29256232)
        );


        System.out.println(String.format("Personas: %s",personas));

        System.out.println(String.format("Mayores a 21: %s",personas.stream()
        .filter(persona -> persona.getEdad() > 21)
        .collect(Collectors.toList())));

        System.out.println(String.format("Menores a 18: %s",personas.stream()
        .filter(persona -> persona.getEdad() < 18)
        .collect(Collectors.toList())));

        System.out.println(String.format("Mayores a 21 + DNI mayor a 20 Millones: %s",personas.stream()
        .filter(persona -> persona.getEdad() > 21)
        .filter(persona -> persona.getDni() > 20000000)
        .collect(Collectors.toList())));

    }
}
