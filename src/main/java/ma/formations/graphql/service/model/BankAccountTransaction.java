package ma.formations.graphql.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.graphql.enums.TransactionType;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.sql.RowSet;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccountTransaction {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private Double amount;
    @ManyToOne
    private BankAccount bankAccount;
    @ManyToOne
    private User user;
}


