package br.edu.infnet.applocadora.model.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class CD extends Midia {

    private String titulo;
    private String gravadora;
    private String interprete;
    private Date dataLancamento;
    private Integer totalFaixas;
    @Builder.Default
    private Boolean duplo = false;

    @Override
    public String toString() {
        return new StringBuilder()
                .append(titulo).append(";")
                .append(gravadora).append(";")
                .append(interprete).toString();
    }
}
