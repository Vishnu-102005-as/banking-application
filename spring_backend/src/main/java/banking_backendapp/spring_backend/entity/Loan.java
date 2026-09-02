package banking_backendapp.spring_backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loanType;

    private BigDecimal amount;

    private Integer durationYrs;

    private BigDecimal monthlyIncome;

    private String status;

    private LocalDateTime appliedTime = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Loan() {
    }

    public Loan(Long id, String loanType, BigDecimal amount, Integer durationYrs, BigDecimal monthlyIncome, String status, LocalDateTime appliedTime, User user) {
        this.id = id;
        this.loanType = loanType;
        this.amount = amount;
        this.durationYrs = durationYrs;
        this.monthlyIncome = monthlyIncome;
        this.status = status;
        this.appliedTime = appliedTime;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getDurationYrs() {
        return durationYrs;
    }

    public void setDurationYrs(Integer durationYrs) {
        this.durationYrs = durationYrs;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getAppliedTime() {
        return appliedTime;
    }

    public void setAppliedTime(LocalDateTime appliedTime) {
        this.appliedTime = appliedTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
