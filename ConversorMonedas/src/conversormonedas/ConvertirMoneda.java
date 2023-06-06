/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormonedas;

/**
 *
 * @author rogeliop
 */
public class ConvertirMoneda {

    /*
    De Pesos a Dólar
    De Pesos a Euro
    De Pesos a Libras
    De Pesos a Yen
    De Pesos a Won Coreano
    De Dólar a Pesos
    De Euro a Pesos
    De Libras a Pesos
    De Yen a Pesos
    De Won Coreano a Pesos
     */
    public static double importeBase;

    final String pesoDolar = "De Pesos a Dólar";
    final String pesoEuro = "De Pesos a Euro";
    final String pesoLibra = "De Pesos a Libras";
    final String pesoYen = "De Pesos a Yen";
    final String pesoWonCoreano = "De Pesos a Won Coreano";
    final String dolarPeso = "De Dólar a Pesos";
    final String euroPeso = "De Euro a Pesos";
    final String libraPeso = "De Libras a Pesos";
    final String yenPeso = "De Yen a Pesos";
    final String wonCoereanoPeso = "De Won Coreano a Pesos";

    public double getResultado(String s) {

        switch (s) {
            case pesoDolar:
                return importeBase / 17.89;
            case pesoEuro:
                return importeBase / 19.74;
            case pesoLibra:
                return importeBase / 22.56;
            case pesoYen:
                return importeBase / 0.13;
            case pesoWonCoreano:
                return importeBase / 0.014;
            case dolarPeso:
                return importeBase * 17.89;
            case euroPeso:
                return importeBase * 19.74;
            case libraPeso:
                return importeBase * 22.56;
            case yenPeso:
                return importeBase * 0.13;
            case wonCoereanoPeso:
                return importeBase * 0.014;

        }

        return 0;

    }

}
