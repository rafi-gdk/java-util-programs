package com.sonu.utils.programs;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Random;

public class MouseMove {

    public static void main(String[] args) throws Exception {
        Robot hal = new Robot();
        Random random = new Random();
        while (true) {
            hal.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            System.out.println("MouseMove.main->" + LocalDateTime.now());
            hal.mouseMove(x, y);
        }
    }
}
