package org.example;

import lombok.AllArgsConstructor;

public class Main {
    public static void main(String[] args) {

        // создаем экземпляры классов от родителя Entity

        Entity[] entity = {new Man("Alex", 600, 2), new Cat("Barsik", 200, 4), new Robot("Terminator", 10000, 5)};
        Obstruction[] obstructions = {new RunningTrack(150), new Wall(1), new RunningTrack(700),new RunningTrack(200)};


        // Соревнование

        for (int i = 0; i < entity.length; i++) {
            for (int j = 0; j < obstructions.length; j++) {
                if (obstructions[j] instanceof RunningTrack) {
                    entity[i].run(((RunningTrack) obstructions[j]).getLength());
                    if (((RunningTrack) obstructions[j]).getLength() > entity[i].maxRunDistance) {
                        break;
                    }
                }
                if (obstructions[j] instanceof Wall) {
                    entity[i].jump(((Wall) obstructions[j]).getHeight());
                    if (((Wall) obstructions[j]).getHeight() > entity[i].maxJumpHeigth) {
                        break;
                    }
                }

            }

        }
    }
}
