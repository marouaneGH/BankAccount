package ma.formations.graphql.dtos.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.graphql.dtos.customer.CustomerDto;
import ma.formations.graphql.enums.AccountStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class AddBankAccountResponse {
    private String message;
    private String rib;
    private Double amount;
    private String createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private CustomerDto customer;
}

