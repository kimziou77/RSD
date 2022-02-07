import jdk.jfr.Category;

import java.time.Month;
import java.util.List;

public interface BankTransactionProcessor {
    double calculateTotlaAmount();
    double calculateTotalInMonth(Month month);
    double calculateTotalInJanuary();
    double calculateAverageAmount();
    double calculateAverageAmountForCategory(Category category);
    List<BankTransaction> findTransactions(BankTransactionFilter bankTransactionFilter);

}
