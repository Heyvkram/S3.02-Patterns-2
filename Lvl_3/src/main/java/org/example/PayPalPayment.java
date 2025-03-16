package org.example;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(PaymentCallback callback) {
        boolean success = Math.random() < 0.9;
        if (success) {
            callback.onPaymentSuccess();
        } else {
            callback.onPaymentFailure("Payment fail.");
        }
    }
}
