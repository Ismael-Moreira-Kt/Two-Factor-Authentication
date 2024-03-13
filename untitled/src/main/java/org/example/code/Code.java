package org.example.code;

import com.eatthepath.otp.TimeBasedOneTimePasswordGenerator;
import java.security.GeneralSecurityException;
import java.time.Instant;

import static org.example.master_key.MasterKey.getMasterKey;

public class Code {
    public static int generateCode() throws GeneralSecurityException {
        TimeBasedOneTimePasswordGenerator totp = new TimeBasedOneTimePasswordGenerator();

        Instant now = Instant.now();

        return totp.generateOneTimePassword(getMasterKey(), now);
    }
}