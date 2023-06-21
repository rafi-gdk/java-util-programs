package com.sonu.utils.s.o.l.i.d;

/**
 * Derived classes must be completely substitutable for their base classes
 * for Example there is a Social Media Interface ,It has 5 methods.If any one of the class is inhering the Social media interface,
 * all methods should be override with the implementation,If any of the method is not applicable then that is not following Liskov
 * principle, So in this case devide the methods in multiple Interfaces.
 */
interface PhotoNChat {
    void sendPhoto();

    void chat();

}

interface PostPhoto {
    void postPhoto();
}

class Instagram implements PhotoNChat, PostPhoto {

    @Override
    public void sendPhoto() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void postPhoto() {

    }
}

class WhatsApp implements PhotoNChat {

    @Override
    public void sendPhoto() {

    }

    @Override
    public void chat() {

    }
}