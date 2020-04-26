package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public String getTipoEntrada(){
        return this.tipoEntrada;
    }

}
