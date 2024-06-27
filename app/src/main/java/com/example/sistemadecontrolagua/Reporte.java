package com.example.sistemadecontrolagua;

public class Reporte {
    private String titulo;
    private String flujo;
    private String temperatura;
    private String pH;
    private String cloro;
    private String orp;
    private String tds;
    private String turbidez;

    public Reporte(String titulo, String flujo, String temperatura) {
        this.titulo = titulo;
        this.flujo = flujo;
        this.temperatura = temperatura;
        this.pH = pH;
        this.cloro = cloro;
        this.orp = orp;
        this.tds = tds;
        this.turbidez = turbidez;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFlujo() {
        return flujo;
    }

    public void setFlujo(String flujo) {
        this.flujo = flujo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getpH() {
        return pH;
    }

    public void setpH(String pH) {
        this.pH = pH;
    }

    public String getCloro() {
        return cloro;
    }

    public void setCloro(String cloro) {
        this.cloro = cloro;
    }

    public String getOrp() {
        return orp;
    }

    public void setOrp(String orp) {
        this.orp = orp;
    }

    public String getTds() {
        return tds;
    }

    public void setTds(String tds) {
        this.tds = tds;
    }

    public String getTurbidez() {
        return turbidez;
    }

    public void setTurbidez(String turbidez) {
        this.turbidez = turbidez;
    }
}

