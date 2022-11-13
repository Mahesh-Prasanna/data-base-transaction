package lk.dep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class TransferDTO implements Serializable {
    private String type;
    private String from;
    private String to;
    private BigDecimal amount;
}
