package seedu.moneygowhere.data.recurringpayments;

import java.util.ArrayList;

/**
 * Stores and manages a list of recurring payments.
 */
@SuppressWarnings({"unused", "FieldMayBeFinal"})
public class RecurringPaymentManager {
    private ArrayList<RecurringPayment> recurringPayments;

    public RecurringPaymentManager() {
        recurringPayments = new ArrayList<>();
    }

    public void addRecurringPayment(RecurringPayment recurringPayment) {
        recurringPayments.add(recurringPayment);
    }

    public RecurringPayment getRecurringPayment(int recurringPaymentIndex) {
        return recurringPayments.get(recurringPaymentIndex);
    }

    public ArrayList<RecurringPayment> getRecurringPayments() {
        return recurringPayments;
    }
}