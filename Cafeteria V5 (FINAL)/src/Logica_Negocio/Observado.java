package Logica_Negocio;

import Logica_Negocio.Estaciones.Observador;

abstract public class Observado {
    abstract public void agregarObservador(Observador o);
    abstract public void eliminarObservador(Observador o);
}
