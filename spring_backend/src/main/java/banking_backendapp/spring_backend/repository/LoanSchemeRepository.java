package banking_backendapp.spring_backend.repository;

import banking_backendapp.spring_backend.entity.LoanScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanSchemeRepository extends JpaRepository<LoanScheme, Long> {
    Optional<LoanScheme> findByLoanType(String loanType);
    boolean existsByLoanType(String loanType);
}
