package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Cat extends Entity implements Action{


    public Cat(String name, int maxRunDistance, int maxJumpHeigth) {
        super(name, maxRunDistance, maxJumpHeigth);
    }

    public Cat() {
    }

}
