package Entidades;

import Servicos.ParcelamentoInterface;

import java.time.LocalDateTime;

public class Contrato {
    private Integer numero;
    private LocalDateTime date;
    private Double valorContrato;
    private  Integer nParcelas;
    private ParcelamentoInterface parcelamentoInterface;

    public Contrato(Integer numero, LocalDateTime date, Double valorContrato, Integer nParcelas,ParcelamentoInterface parcelamentoInterface) {
        this.numero = numero;
        this.date = date;
        this.valorContrato = valorContrato;
        this.nParcelas = nParcelas;
        this.parcelamentoInterface = parcelamentoInterface;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public Integer getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(Integer nParcelas) {
        this.nParcelas = nParcelas;
    }

    public ParcelamentoInterface getParcelamentoInterface() {
        return parcelamentoInterface;
    }

    public void setParcelamentoInterface(ParcelamentoInterface parcelamentoInterface) {
        this.parcelamentoInterface = parcelamentoInterface;
    }
}
