package org.example;

import com.google.zxing.WriterException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;

import static org.example.qr_code.QRCode.generateQRCode;

public class Main {

    public static void main(String[] args) throws GeneralSecurityException, URISyntaxException, IOException, WriterException {
        generateQRCode();
    }
}