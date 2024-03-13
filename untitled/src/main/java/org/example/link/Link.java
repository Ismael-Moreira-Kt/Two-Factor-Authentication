package org.example.link;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

import static org.example.code.Code.generateCode;

public class Link {
    public static URI generateLink() throws GeneralSecurityException, URISyntaxException {
        Scanner scan = new Scanner(System.in);

        int code = generateCode();

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your username: ");
        String userName = scan.nextLine();

        URI link = new URI("otpauth", "totp", "/" + userName + ":" + name,
                "secret=" + code + "&issuer=" + userName, null);


        scan.close();
        return link;
    }
}
