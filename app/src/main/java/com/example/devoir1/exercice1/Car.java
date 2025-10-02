package com.example.devoir1.exercice1;

public class Car extends LandTransport {
    private static final double POIDS_MAX = 3000;
    private static final double VITESSE_MAX = 180;
    private static int count = 0;

    public Car() {
        super(POIDS_MAX * 0.3, VITESSE_MAX * 0.3);
        count++;
        System.out.printf("Default constructor completed creation instance %d of Car.%n", count);
    }

    public Car(double poids_vide, double vitesse_croisiere) {
        super(poids_vide, vitesse_croisiere);
        if (poids_vide <= 0 || poids_vide > POIDS_MAX) {
            throw new IllegalArgumentException("Poids à vide invalide");
        }
        double vitesse_min = VITESSE_MAX * 0.1;
        if (vitesse_croisiere < vitesse_min || vitesse_croisiere > VITESSE_MAX) {
            throw new IllegalArgumentException("Vitesse de croisière invalide");
        }

        count++;
        System.out.printf("Parametrized constructor of Car completed creation of instance %d with emptyWeight=%.2f, cruisingSpeed=%.2f%n",
                count, poids_vide, vitesse_croisiere);
    }

    @Override
    public String getTransportType() { return "Car"; }

    public static double getMaxWeight() { return POIDS_MAX; }

    public static double getMaxSpeed() { return VITESSE_MAX; }

    public static int count() { return count; }
}
