package com.syntax;

public class Main {

    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.sun = 1;
        solarSystem.moon = 1;
        solarSystem.planets = 2;

        Sun sun = new Sun();
        sun.temperature = "5,778 K";
    }
}
