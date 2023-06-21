package com.sonu.utils.s.o.l.i.d;

/**
 * Open for extension but closed for modification
 * Eg: We have a OTP using WhatsApp, but new requirement is notification should be done by mail,
 * in this case we should write new class instead modifying existing class
 */
interface Notification {

    public void sendOTP();

    public void validateOTP();
}

//Existing class
class WhatsAppOTP implements Notification {

    @Override
    public void sendOTP() {
        //something
    }

    @Override
    public void validateOTP() {
        //something
    }
}

//New Requirement
class MailOTP implements Notification {

    @Override
    public void sendOTP() {
        //something
    }

    @Override
    public void validateOTP() {
        //something
    }

}
