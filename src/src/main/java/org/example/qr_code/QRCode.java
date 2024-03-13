package org.example.qr_code;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;

import static org.example.link.Link.generateLink;

public class QRCode {
    public static void generateQRCode() throws GeneralSecurityException, URISyntaxException, IOException, WriterException {
        URI link = generateLink();

        generateQRCodeToFile(link.toString(), "my_qrcode.png");
    }

    public static void generateQRCodeToFile(String text, String filePath) throws WriterException, IOException {
        int width = 400;
        int height = 400;

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, com.google.zxing.BarcodeFormat.QR_CODE, width, height);

        File qrFile = new File(filePath);
        com.google.zxing.client.j2se.MatrixToImageWriter.writeToPath(bitMatrix, "PNG", qrFile.toPath());
    }
}