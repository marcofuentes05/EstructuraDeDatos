/**
 * Interfaz Radio
 *
 * Define los metodos y prametros que se utilizaran en la clase RadioImp
 *
 * @author Marco Fuentes y Abril Palencia
 * @version 17/01/2019
 */

package Interfaz;

public interface Radio {
    //metodos publicos
    /**
     *  Enciende y apaga la radio. Cambiar el esttado de la radio
     */
    public void toggle();

    /**
     * Comprueba si el radio esta apagado o encendido.
     * @return <ul>
     *       <li>true: encendido</li>
     *       <li>false: apagado</li>
     *       </ul>
     */
    public boolean getState();

    /**
     * Cambia la frecuencia del radio. FM o Am
     */
    public void changeFrequency();

    /**
     * Cambiar las estaciones de la radio.
     * @param up si el usuario quiere bajar o subir de frecuencia
     */
    public void changeStation(boolean up);

    /**
     * Comprueba en que frecuencia se encuentra la radio.
     * @return  <ul>
     *          <li>true: FM</li>
     *          <li>false: AM</li>
     *          </ul>
     */
    public boolean getFrequency();

    /**
     * Guardar las estacines en lso respectivos botones.
     * @param numButton el boton en el cual el usuario quiere guardar la estacion.
     */
    public void saveStation(int numButton);

    /**
     * Cambiar de estacion utilizando los botones con estaciones guardadas previamente.
     * @param numButton el boton en el cual el usuario quiere sonar
     */
    public void changeStationButton(int numButton);

    /**
     * Muestra la estacion  donde se encuentra la radio.
     * @return estacion
     */
    public double getStation();

    /**
     * Muestra o imprime el radio en consola.
     * @return a: la imagen o figura de la radio
     */
    public String toString();
}
