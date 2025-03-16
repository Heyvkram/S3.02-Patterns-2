package org.example;

public class ShoeStore {
    private PaymentGateway paymentGateway = new PaymentGateway();

    public void purchaseShoes(PaymentMethod paymentMethod) {
        System.out.println("Starting the purchase...");
        paymentGateway.processPayment(paymentMethod, new PaymentCallback() {
            @Override
            public void onPaymentSuccess() {
                System.out.println("Payment success. Thank you for your purchase!");
            }

            @Override
            public void onPaymentFailure(String errorMessage) {
                System.out.println("Payment error: " + errorMessage);
            }
        });
    }
}
