package br.com.alura.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataDataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public Pedido() {
    }

    public Pedido(String nomeProduto, BigDecimal valorNegociado, LocalDate dataDataEntrega, String urlProduto, String urlImagem, String descricao) {
        this.nomeProduto = nomeProduto;
        this.valorNegociado = valorNegociado;
        this.dataDataEntrega = dataDataEntrega;
        this.urlProduto = urlProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDate getDataDataEntrega() {
        return dataDataEntrega;
    }

    public void setDataDataEntrega(LocalDate dataDataEntrega) {
        this.dataDataEntrega = dataDataEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
