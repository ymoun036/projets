package com.example.devoir1.exercice1;

public abstract class AirTransport extends Transport {
    private static int count = 0;

    public AirTransport() {
        super();
        count++;
        System.out.printf("Parametrized constructor of AirTransport completed creation of instance %d with emptyWeight=%.2f, cruisingSpeed=%.2f%n",
                count, getPoids_vide(), getVitesse_croisiere());
    }

    public AirTransport(double poids_vide, double vitesse_croisiere) {
        super(poids_vide, vitesse_croisiere);
        count++;
        System.out.printf("Parametrized constructor of AirTransport completed creation of instance %d with emptyWeight=%.2f, cruisingSpeed=%.2f%n",
                count, poids_vide, vitesse_croisiere);
    }

    public static int getCount() { return count; }
}
