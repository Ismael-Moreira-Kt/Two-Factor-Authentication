package org.example.master_key;

import java.security.SecureRandom;
import java.util.Base64;

public class MasterKey {
    public static String generateMasterKey() {
        SecureRandom random = new SecureRandom();

        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        return Base64.getEncoder().encodeToString(bytes);
    }
}