/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormonedas;

import static conversormonedas.ConvertirMoneda.importeBase;

/**
 *
 * @author rogeliop
 */
public class ConvertirTemperaturas {

    public static double valorTemperatura;

    final String celsiusFahrenheit = "De Celsius a Fahrenheit";
    final String fahrenheitCelsius = "De Farenheit a Celsius";
    final String kelvinCelsius = "De Kelvin a Celsius";
    final String celsiuskelvin = "De Celsius a Kelvin";
    final String fahrenheitKelvin = "De Farenheit a Kelvin";
    final String kelvinFahrenheit = "De Kelvin a Fahrenheit";

    public double getResultado(String s) {

        switch (s) {
            case celsiusFahrenheit:
                return valorTemperatura * 1.8 + 32;
            case fahrenheitCelsius:
                return (valorTemperatura - 32) / 1.8;
            case kelvinCelsius:
                return valorTemperatura - 273.15;
            case celsiuskelvin:
                return valorTemperatura + 273.15;
            case fahrenheitKelvin:
                return 5/9 * (valorTemperatura - 32) + 273.15;
            case kelvinFahrenheit:
                return 1.8 * (valorTemperatura - 273.15) + 32;
        }

        return 0;

    }

}
