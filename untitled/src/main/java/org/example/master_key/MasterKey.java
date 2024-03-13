package org.example.master_key;

import java.security.SecureRandom;

public class MasterKey {
    public static byte[] generateMasterKey() {
        SecureRandom random = new SecureRandom();

        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        return bytes;
    }
}