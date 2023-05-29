package jv.builder;

public class GuitarraProduct {
    private String captadores;
    private String madeira;
    private String modelo;
    private String ponte;
    private String afinacao;
    private int anoFabricacao;

    @Override
    public String toString() {
        return "\n-- GuitarraProduct --\n" +
                "captadores: " + captadores + '\n' +
                "madeira: " + madeira + '\n' +
                "modelo: " + modelo + '\n' +
                "ponte: " + ponte + '\n' +
                "afinação: " + afinacao + '\n' +
                "anoFabricação: " + anoFabricacao;
    }

    public String getCaptadores() {
        return captadores;
    }

    public void setCaptadores(String captadores) {
        this.captadores = captadores;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPonte() {
        return ponte;
    }

    public void setPonte(String ponte) {
        this.ponte = ponte;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

