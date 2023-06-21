package com.sonu.utils.s.o.l.i.d;

/**
 * That the Larger Interfaces split into smaller Ones.Because the implementation classes use only the methods that are required.
 * we should not force the client to use the methods that they do not use
 * for that we need segregate the interface into smaller
 */

interface PictureNChat {
    void sendPhoto();

    void chat();

}

interface PostPicture {
    void postPhoto();
}

class Instagrams implements PictureNChat, PostPicture {

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

class WhatsApps implements PictureNChat {

    @Override
    public void sendPhoto() {

    }

    @Override
    public void chat() {

    }
}