import Entidades.AdaptadorTemperatura;

public class App {
    public static void main(String[] args){
        System.out.println("\n=== SISTEMA DE TEMPERATURA ===");
        
        ConversorTemperatura conversor = new AdaptadorTemperatura();
        
        double celsius = 25.0;
        double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        
        fahrenheit = 77.0;
        celsius = conversor.fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}
