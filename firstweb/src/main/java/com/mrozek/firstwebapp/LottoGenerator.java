package com.mrozek.firstwebapp;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LottoGenerator {

    public String generateLottoNumbers() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(49)+", ");
        }
        return sb.toString();
    }
}
