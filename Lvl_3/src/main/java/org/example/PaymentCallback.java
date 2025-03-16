package org.example;

public interface PaymentCallback {
    void onPaymentSuccess();
    void onPaymentFailure(String errorMessage);
}
