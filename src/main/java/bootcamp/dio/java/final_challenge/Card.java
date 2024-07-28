package bootcamp.dio.java.final_challenge;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numberCard;

    @Column(name = "extra_limit", precision = 13, scale = 2)
    private BigDecimal limitCard;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumberCard() { return numberCard; }
    public void setNumberCard(String numberCard) { this.numberCard = numberCard; }

    public BigDecimal getLimitCard() { return limitCard; }
    public void setLimitCard(BigDecimal limitCard) { this.limitCard = limitCard; }
}
