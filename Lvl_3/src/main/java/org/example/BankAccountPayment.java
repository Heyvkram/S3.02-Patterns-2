package org.example;

public class BankAccountPayment implements PaymentMethod {
    @Override
    public void processPayment(PaymentCallback callback) {
        boolean success = Math.random() < 0.7;
        if (success) {
            callback.onPaymentSuccess();
        } else {
            callback.onPaymentFailure("Payment fail.");
        }
    }
}
