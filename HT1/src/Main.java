import Clases.RadioImp;
import Interfaz.Radio;

import java.util.Scanner;

public class Main {

    public static String stateToString(boolean b){
        String a = "";
        if (b){
            a = "Encendido";
        }else{
            a = "Apagado";
        }
        return a;
    }
    public static void main (String args[]){
        Radio r = new RadioImp();

        while (1>0){
            System.out.println(r.toString());
            if(r.getState()){
                System.out.println("Ingresa O para Encender/Apagar\nIngresa +,- para subir o bajar estaciones\nIngresa M para cambiar AM/FM\nIngresa un número de 1-12 para acceder a la memoria\nIngresa r para guardar la estacion\"");
            }else{
                System.out.println("Ingresa O para Encender");
            }

            Scanner sc = new Scanner(System.in);
            String respuesta = sc.nextLine();
            switch(respuesta){
                case "O" : r.toggle();
                    break;
                case "+": r.changeStation(true);
                    break;
                case "-": r.changeStation(false);
                    break;
                case "M": r.changeFrequency();
                    break;
                case "1": r.changeStationButton(1);
                    break;
                case "2": r.changeStationButton(2);
                    break;
                case "3": r.changeStationButton(3);
                    break;
                case "4": r.changeStationButton(4);
                    break;
                case "5": r.changeStationButton(5);
                    break;
                case "6": r.changeStationButton(6);
                    break;
                case "7": r.changeStationButton(7);
                    break;
                case "8": r.changeStationButton(8);
                    break;
                case "9": r.changeStationButton(9);
                    break;
                case "10": r.changeStationButton(10);
                    break;
                case "11": r.changeStationButton(11);
                    break;
                case "12": r.changeStationButton(12);
                    break;
                case "r":
                    System.out.println("Ingresa el numero de memeoria para guardar esta estación");
                    int res = Integer.parseInt(new Scanner(System.in).nextLine());
                    if (res < 12){
                        r.saveStation(res);
                    }else{
                        System.out.println("Ese no es un dato valido");
                    }
                    break;
                default:
                    System.out.println("Ese comando no está definido... :(");
                    break;
            }
        }

    }
}
