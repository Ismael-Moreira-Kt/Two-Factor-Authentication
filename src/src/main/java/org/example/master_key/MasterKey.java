package org.example.master_key;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class MasterKey {
    public static byte[] generateMasterKey() {
        SecureRandom random = new SecureRandom();

        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        return bytes;
    }

    private static final byte[] MASTER_KEY_BYTES = generateMasterKey();
    private static final SecretKeySpec MASTER_KEY = new SecretKeySpec(MASTER_KEY_BYTES, "AES");

    public static SecretKeySpec getMasterKey(){
        return MASTER_KEY;
    }
}