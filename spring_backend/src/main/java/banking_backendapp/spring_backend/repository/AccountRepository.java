package banking_backendapp.spring_backend.repository;

import banking_backendapp.spring_backend.entity.Accounts;
import banking_backendapp.spring_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, UUID> {
    List<Accounts> findByUser(User user);
    List<Accounts> findByUserId(Long userId);
}
