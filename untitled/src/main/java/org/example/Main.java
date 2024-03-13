package org.example;

import com.eatthepath.otp.TimeBasedOneTimePasswordGenerator;

import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.time.LocalDateTime;
import static org.example.master_key.MasterKey.generateMasterKey;


public class Main {
    private static final byte[] MASTER_KEY_BYTES = generateMasterKey();
    private static final SecretKeySpec MASTER_KEY = new SecretKeySpec(MASTER_KEY_BYTES, "AES");

    public static void main(String[] args) throws GeneralSecurityException {
        TimeBasedOneTimePasswordGenerator totp = new TimeBasedOneTimePasswordGenerator();
        Instant now = Instant.now();

        int code = totp.generateOneTimePassword(MASTER_KEY, now);
    }
}