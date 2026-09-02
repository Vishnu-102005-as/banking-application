package banking_backendapp.spring_backend.repository;

import banking_backendapp.spring_backend.entity.Accounts;
import banking_backendapp.spring_backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccount(Accounts account);
    List<Transaction> findByAccountUuid(UUID accountUuid);
    List<Transaction> findByAccountUuidOrderByTransactionDateDesc(UUID accountUuid);
    List<Transaction> findByAccountOrToAccountOrderByTransactionDateDesc(String fromAccount, String toAccount);
}
