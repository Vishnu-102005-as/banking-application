package banking_backendapp.spring_backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "loan_schemes")
public class LoanScheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loanType;

    private BigDecimal interestRate;

    private BigDecimal maxAmount;

    private BigDecimal minMonthlyIncome;

    private Integer maxTenureYears;

    public LoanScheme() {
    }

    public LoanScheme(Long id, String loanType, BigDecimal interestRate, BigDecimal maxAmount, BigDecimal minMonthlyIncome, Integer maxTenureYears) {
        this.id = id;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.maxAmount = maxAmount;
        this.minMonthlyIncome = minMonthlyIncome;
        this.maxTenureYears = maxTenureYears;
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

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getMinMonthlyIncome() {
        return minMonthlyIncome;
    }

    public void setMinMonthlyIncome(BigDecimal minMonthlyIncome) {
        this.minMonthlyIncome = minMonthlyIncome;
    }

    public Integer getMaxTenureYears() {
        return maxTenureYears;
    }

    public void setMaxTenureYears(Integer maxTenureYears) {
        this.maxTenureYears = maxTenureYears;
    }
}
