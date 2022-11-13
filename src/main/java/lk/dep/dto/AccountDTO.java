package lk.dep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AccountDTO implements Serializable {
    private String account;
    private String name;
    private String address;
    private BigDecimal balance;
}
