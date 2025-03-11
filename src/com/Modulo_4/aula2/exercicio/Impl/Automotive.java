package com.Modulo_4.aula2.exercicio.Impl;

public abstract class Automotive {

    protected Motor[] motors;
    protected float speed;

    public Automotive(Motor[] motors) {
        this.motors = motors;
        this.speed = 0;
    }

    public void increase(float value) {
        this.speed += value;
    }

    public void decrease(float value) {
        this.speed -= value;
    }

}
