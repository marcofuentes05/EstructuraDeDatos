package Interfaz;

public interface Radio {
    //metodo para encender y apagar el radio
    public void toggle();

    //metodo que devuelve si el radio esta apagado o encendido
    public boolean getState();

    //metodo para cambiar la frecuencia del radio. FM o AM
    public void changeFrequency();

    //metodo para cambiar las estaciones de la radio. sube o baja.
    public void changeStation(boolean up);

    //metodo que devuelve la frecuencia en que se encuentra el radio
    public boolean getFrequency();

    //metod para guardar las estacones.
    public void saveStation(int numButton);

    //metodo para cambiar alguna estacion guardada
    public void changeStationButton(int numButton);

    //metodo que devuelve la estacion.
    public double getStation();

    //Metodo que ayuda a imprimir el radio en consola
    public String toString();
}
