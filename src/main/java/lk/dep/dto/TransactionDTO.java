package lk.dep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class TransactionDTO implements Serializable {
    private String type;
    private String account;
    private BigDecimal amount;
}
