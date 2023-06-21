package com.sonu.utils.s.o.l.i.d;

/**
 * we Must use abstraction(abstract classes and Interfaces) instead of concrete implementation.
 */
interface BankCard {
    void doTransaction();
}

class DebitCard implements BankCard {
    @Override
    public void doTransaction() {

    }
}

class CreditCard implements BankCard {

    @Override
    public void doTransaction() {

    }
}

class ShoppingMall {

    BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    void doPurchase() {

    }

    public static void main(String[] args) {
        BankCard card = new DebitCard();
        ShoppingMall mall = new ShoppingMall(card);
        mall.doPurchase();
    }
}
