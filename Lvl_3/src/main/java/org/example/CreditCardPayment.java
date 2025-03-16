package org.example;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(PaymentCallback callback) {
        boolean success = Math.random() < 0.8;
        if (success) {
            callback.onPaymentSuccess();
        } else {
            callback.onPaymentFailure("Payment fail.");
        }
    }
}
