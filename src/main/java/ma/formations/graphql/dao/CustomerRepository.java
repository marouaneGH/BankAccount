package ma.formations.graphql.dao;
import ma.formations.graphql.service.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.formations.graphql.service.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByIdentityRef(String identityRef);
    Optional<Customer> findByUsername(String username);
}
