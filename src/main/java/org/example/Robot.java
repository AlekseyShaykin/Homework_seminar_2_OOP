package org.example;

public class Robot extends Entity implements Action{
    public Robot(String name, int maxRunDistance, int maxJumpHeigth) {
        super(name, maxRunDistance, maxJumpHeigth);
    }

    public Robot() {
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает ");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");

    }
}
