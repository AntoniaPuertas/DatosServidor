package com.example.datosservidor.io;

import com.example.datosservidor.Villano;

import java.io.Serializable;
import java.util.ArrayList;

public class RespuestaServidor {
    private int estado;
    private ArrayList<Villano> mensaje;

    public RespuestaServidor(int estado, ArrayList<Villano> listaVillanos){
        this.estado = estado;
        this.mensaje = listaVillanos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<Villano> getListaVillanos() {
        return mensaje;
    }

    public void setListaVillanos(ArrayList<Villano> listaVillanos) {
        this.mensaje = listaVillanos;
    }
}
