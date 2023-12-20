import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest {

    //Ejercicio 1: Área de un Círculo
    public static double circleArea(double radio){
        double area = radio + Math.PI;
        return area;
    }

    //Ejercicio 2: Conversión de Temperaturas (10 °C × 9/5) + 32 = 50 °F
    public static double temperatureCelsiusToFahrenheit(double temperature){
        double temperatureConverted = (temperature * 9/5)+32;
        return temperatureConverted;
    }

    //Ejercicio 3: Volumen de una Esfera 4/3 * Pi * R3
    public static double esferVolume(double radio){
        double volum = (4 * Math.PI * Math.pow(radio,3)/3);
        return volum;
    }

    public static void matematicsOperation(double num1, double num2){
        double suma = ( num1 + num2 );
        double resta = ( num1 - num2 );
        double multi = ( num1 * num2 );
        double division = ( num1 / num2);

        System.out.println(" - Suma : " + suma + "\n - Resta : " + resta + "\n - Multi : " + multi + "\n - Division : " + division);
    }

    public static void exchangesMoney(double money){
        Scanner scaen = new Scanner(System.in);
        System.out.println("Que operación desea realizar? \n 1) Cambiar Dolares a Euros\n 2) Cambiar Euros a Dolares \n Seleccione Opción 1 o 2: " );
        int val = scaen.nextInt();
        final double  dolarValuexEuro = 0.91;
        final double euroValuexDolar = 1.10;

        if(val == 1){
            double changesCalculatedToDolar = dolarValuexEuro * money;
            System.out.println("Cambio de Dolares -> "+ money +" a Euros :" + String.format("%.2f",changesCalculatedToDolar));
        }else {
            double changesCalculatedToEuro = (euroValuexDolar * money) ;
            System.out.println("Cambio de Euros -> "+ money +" a Dolars :" + String.format("%.2f",changesCalculatedToEuro));
        }





    }
}
