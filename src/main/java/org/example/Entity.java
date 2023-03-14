package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity implements Action {

    public String name;

    public int maxRunDistance;
    public int maxJumpHeigth;

    @Override
    public void jump() {
        System.out.println(name + " прыгает");

    }

    @Override
    public void jump(int WallHeigth) {

        if (maxJumpHeigth < WallHeigth) {
            System.out.println(name + " не перепрыгнул стену высотой "+WallHeigth + " и выбывает из соревнования");
        }else{
            System.out.println(name + " перепрыгнул стену высотой "+WallHeigth+ "  и двигается дальше");
        }
    }

    @Override
    public void run() {
        System.out.println(name + " бегает");

    }


    @Override
    public void run(int TrackDistance) {
//        System.out.println(name+" бегает");
        if (maxRunDistance < TrackDistance) {
            System.out.println(name + " не пробежал дистанцию "+TrackDistance + " и выбывает из соревнования");
        } else{
            System.out.println(name + " пробежал дистанцию " + TrackDistance +" и двигается дальше");
        }

    }

}