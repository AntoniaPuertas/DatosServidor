package com.example.datosservidor.io;

import com.example.datosservidor.Villano;

import java.io.Serializable;
import java.util.ArrayList;

public class RespuestaServidor {
    private int estado;
    private Mensaje mensaje;

    public RespuestaServidor(int estado, Mensaje mensaje){
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public class Mensaje implements Serializable{
        private ArrayList<Villano> villanos;

        public ArrayList<Villano> getVillanos() {
            return villanos;
        }

        public void setVillanos(ArrayList<Villano> villanos) {
            this.villanos = villanos;
        }
    }
}
