package atividade;

import java.time.LocalDate;

public class Midia {
    private long id;
    private String titulo;
    private int anoLancamento;
    private String classificacaoIndicativa;
    private LocalDate dataAquisicao;
    private String observacoes;

    public abstract String getInformacoes();
}