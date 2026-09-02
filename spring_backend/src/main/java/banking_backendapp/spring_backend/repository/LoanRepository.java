package banking_backendapp.spring_backend.repository;

import banking_backendapp.spring_backend.entity.Loan;
import banking_backendapp.spring_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUser(User user);
    List<Loan> findByUserId(Long userId);
    List<Loan> findByStatus(String status);
}
