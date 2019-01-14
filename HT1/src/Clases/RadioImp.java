package Clases;

import Interfaz.Radio;

public class RadioImp implements Radio {
    //atributos del objeto radio
    private boolean state, frequency; //Frecuencia es True para FM
    private double station;

    private double listaAM [] = new double [12];
    private double listaFM [] = new double [12];

    public RadioImp(){
        this.state = true;
        this.frequency = true;
        this.station = 87.9;
    }

    //metodo para encender y apagar el radio
    public void toggle() {
        this.state = !state;
    }

    //metodo que devuelve si el radio esta apagado o encendido
    public boolean getState() {
        return this.state;
    }

    //metodo para cambiar la frecuencia del radio. FM o AM
    public void changeFrequency() {
        this.frequency = !frequency;
        if (frequency){
            station = 87.9;
        }else{
            station = 530;
        }
    }

    //metodo para cambiar las estaciones de la radio. sube o baja.
    public void changeStation(boolean up) {
        if (up){
            if (frequency){
                station = station + 0.2;
                if (station >107.9){
                    station = 87.9;
                }
            }else{
                station = station + 10;
                if (station > 1610){
                    station = 530;
                }
            }
        }else{
            if (frequency){
                station = station - 0.2;
                if (station < 87.9){
                    station = 107.9;
                }
            }else{
                station = station - 10;
                if (station < 530){
                    station = 1610;
                }
            }
        }
    }

    //metodo que devuelve la frecuencia en que se encuentra el radio
    public boolean getFrequency() {
        return frequency;
    }

    //metod para guardar las estacones.
    public void saveStation(int numButton) {
        if (frequency){
            this.listaFM [numButton-1] = this.station;
        }else{
            this.listaAM [numButton-1] = this.station;
        }
    }

    //metodo para cambiar alguna estacion guardada
    public void changeStationButton(int numButton) {
        if(frequency){
            this.station = listaFM[numButton-1];
        }else{
            this.station = listaAM[numButton-1];
        }
    }

    //metodo que devuelve la estacion.
    public double getStation() {
        return this.station;
    }

    public String toString(){
        String onOff, frec, a;
        if (state){
            onOff = "Encendido";
        }else{
            onOff = "Apagado";
        }

        if (frequency){
            frec = "FM";
        }else{
            frec = "AM";
        }
        if (state){
            a = "------------------------------------\n" +
                    "|                                   |\n" +
                    "|\t\t"+onOff+"   \t\t\t    |\n" +
                    "|\t\t\t\t\t\t\t\t    |\n" +
                    "|\t\t"+station+"\t\t \t \t \t    |\n" +
                    "|\t\t "+frec+"\t\t\t\t \t\t\t|\n" +
                    "|\t\t\t\t\t\t\t\t   \t|\n" +
                    "|\t\t\t\t\t \t\t\t\t|\n" +
                    "|     1 2 3 4 5 6 7 8 9 10 11 12    |\n" +
                    "|\t\t\t\t\t\t\t\t\t|\n" +
                    "|\t\t\t\t \t  \t\t\t\t|\n" +
                    "-------------------------------------\n";
        }else{
            a = "------------------------------------\n" +
                    "|                                   |\n" +
                    "|\t\tApagado\t\t    |\n" +
                    "|\t\t\t\t    |\n" +
                    "|\t\t----\t\t    |\n" +
                    "|\t\t --\t\t    |\n" +
                    "|\t\t\t\t    |\n" +
                    "|\t\t\t\t    |\n" +
                    "|     1 2 3 4 5 6 7 8 9 10 11 12    |\n" +
                    "|\t\t\t\t    |\n" +
                    "|\t\t\t\t    |\n" +
                    "-------------------------------------";
        }
        return a;
    }
}
