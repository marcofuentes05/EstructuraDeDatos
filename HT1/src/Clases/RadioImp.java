/**
 * Clase RadioImp
 *
 * Implementa los metodos de la interfaz para que e radio pueda ejecutar sus funciones basicas.
 *
 * @author Marco Fuentes y Abril Palencia
 * @version 17/01/2019
 */

package Clases;

import Interfaz.Radio;

public class RadioImp implements Radio {
    //atributos del objeto radio
    /**
     * estado y frecuencia actual de la radio
     */
    private boolean state, frequency; //Frecuencia es True para FM
    /**
     * estacion actual de la radio
     */
    private double station;
    /**
     * lista de estaciones guardadas. frecuencia  FM.
     */
    private double listaAM [] = new double [12];
    /**
     * lista de estaciones guardadas. fecuencia AM.
     */
    private double listaFM [] = new double [12];

    /**
     * constructor por defecto.
     */
    public RadioImp(){
        this.state = true;
        this.frequency = true;
        this.station = 87.9;
    }

    /**
     *  Enciende y apaga la radio. Cambiar el estado de la radio.
     */
    public void toggle() {
        this.state = !state;
    }

    /**
     * Comprueba si el radio esta apagado o encendido.
     * @return <ul>
     *       <li>true: encendido</li>
     *       <li>false: apagado</li>
     *       </ul>
     */
    public boolean getState() {
        return this.state;
    }

    /**
     * Cambia la frecuencia del radio. FM o Am
     */
    public void changeFrequency() {
        this.frequency = !frequency;
        if (frequency){
            station = 87.9;
        }else{
            station = 530;
        }
    }

    /**
     * Cambiar las estaciones de la radio.
     * @param up
     */
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

    /**
     * Comprueba en que frecuencia se encuentra la radio.
     * @return  <ul>
     *          <li>true: FM</li>
     *          <li>false: AM</li>
     *          </ul>
     */
    public boolean getFrequency() {
        return frequency;
    }

    /**
     * Guardar las estacines en lso respectivos botones.
     * @param numButton
     */
    public void saveStation(int numButton) {
        if (frequency){
            this.listaFM [numButton-1] = this.station;
        }else{
            this.listaAM [numButton-1] = this.station;
        }
    }

    /**
     * Cambiar de estacion utilizando los botones con estaciones guardadas previamente.
     * @param numButton
     */
    public void changeStationButton(int numButton) {
        if(frequency){
            this.station = listaFM[numButton-1];
        }else{
            this.station = listaAM[numButton-1];
        }
    }

    /**
     * Muestra la estacion  donde se encuentra la radio.
     * @return estacion
     */
    public double getStation() {
        return this.station;
    }

    /**
     * Muestra o imprime el radio en consola.
     * @return a: la imagen o figura de la radio
     */
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
