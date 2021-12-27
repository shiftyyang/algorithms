package com.example.algorithms.concurrence;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/25 6:05 下午
 * @description：
 */
public class Zoo {
    public void animalActive(Bird bird) {
        bird.fly();
        bird.eat();
    }

    public static void main(String[] args) {
        new Zoo().animalActive(new Bird() {
            @Override
            public void fly() {
                System.out.println(" a green bird fly");
            }

            @Override
            public void eat() {
                System.out.println("a green bird eat reeds");
            }
        });
    }
}
