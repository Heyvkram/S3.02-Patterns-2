package org.example;

public interface PaymentMethod {
    void processPayment(PaymentCallback callback);
}
