package org.example;


import lombok.Data;

@Data


public class Man extends  Entity {


    public Man() {
    }

    public Man(String name, int maxRunDistance, int maxJumpHeigth) {
        super(name, maxRunDistance, maxJumpHeigth);

    }


}
