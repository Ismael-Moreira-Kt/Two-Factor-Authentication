package org.example;

import java.time.LocalDateTime;
import static org.example.master_key.MasterKey.generateMasterKey;


public class Main {
    public static void main(String[] args) {
        String masterKey = generateMasterKey();
        
    }
}