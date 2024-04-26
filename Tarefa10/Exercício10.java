package Tarefa10;

public class Exercício10 {
	
public static void main(String[] args) {
		

		for (int grausCelsius = 10; grausCelsius <= 100; grausCelsius += 10) {
            int formulaFahrenheit = (9 * grausCelsius + 160) / 5;
            System.out.println(grausCelsius + "º Celsius equivalem a " + formulaFahrenheit + "º Fahrenheit");
        }

	}

}
 