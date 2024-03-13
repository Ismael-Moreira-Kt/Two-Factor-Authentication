package org.example;

import java.net.URISyntaxException;
import java.security.GeneralSecurityException;

import static org.example.qr_code.QRCode.generateQRCode;

public class Main {

    public static void main(String[] args) throws GeneralSecurityException, URISyntaxException {
        generateQRCode();
    }
}