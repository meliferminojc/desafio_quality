package meli.com.desafio_quality.entity;

import java.math.BigDecimal;

public class District {
    private Long id;
    private String name;
    private BigDecimal valueM2;

    public District(Long id, String name, BigDecimal valueM2) {
        this.id = id;
        this.name = name;
        this.valueM2 = valueM2;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValueM2() {
        return valueM2;
    }

    public void setValueM2(BigDecimal valueM2) {
        this.valueM2 = valueM2;
    }
}
