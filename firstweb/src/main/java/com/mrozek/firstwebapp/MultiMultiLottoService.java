package com.mrozek.firstwebapp;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MultiMultiLottoService implements LottoService {
    @Override
    public String generateNumbers() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append(random.nextInt(80)+", ");
        }
        return sb.toString();
    }

}
