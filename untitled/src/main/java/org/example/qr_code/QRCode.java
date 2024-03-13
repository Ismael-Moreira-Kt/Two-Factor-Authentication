package org.example.qr_code;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;

import static org.example.link.Link.generateLink;

public class QRCode {
    public static void generateQRCode() throws GeneralSecurityException, URISyntaxException {
        URI link = generateLink();
        System.out.println(link);
    }
}