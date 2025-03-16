package org.example;

public class Main {
    public static void main(String[] args) {
        ShoeStore shoeStore = new ShoeStore();

        System.out.println("Credit Card payment:");
        shoeStore.purchaseShoes(new CreditCardPayment());

        System.out.println("\nPayPal payment:");
        shoeStore.purchaseShoes(new PayPalPayment());

        System.out.println("\nBank account payment:");
        shoeStore.purchaseShoes(new BankAccountPayment());
    }
}