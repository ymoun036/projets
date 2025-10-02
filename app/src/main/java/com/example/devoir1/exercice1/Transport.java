package com.example.devoir1.exercice1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Transport implements Printable {
    private static final double POIDS_MAX = 1000;
    private static final double VITESSE_MAX = 200;
    private static final String DATE_ENREGISTREMENT;

    private static int count = 0;

    private final String Idu;
    private final int instanceId;
    private double poids_vide;
    private double vitesse_croisiere;

    static {
        DATE_ENREGISTREMENT = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Transport() {
        this(POIDS_MAX * 0.3, VITESSE_MAX * 0.3);
    }

    public Transport(double poids_vide, double vitesse_croisiere) {
        count++;
        this.instanceId = count;
        this.poids_vide = poids_vide;
        this.vitesse_croisiere = vitesse_croisiere;
        this.Idu = generateUniqueId();

        System.out.printf("Parametrized constructor of Transport completed creation of instance %d with emptyWeight=%.2f, cruisingSpeed=%.2f%n",
                instanceId, poids_vide, vitesse_croisiere);
    }

    private String generateUniqueId() {
        return "T-" + System.nanoTime();
    }

    public int getInstanceId() {
        return instanceId;
    }

    public static int getCount() {
        return count;
    }

    public String getIdu() {
        return Idu;
    }

    public double getPoids_vide() { return poids_vide; }

    public void setPoids_vide(double poids) { this.poids_vide = poids; }

    public double getVitesse_croisiere() { return vitesse_croisiere; }

    public void setVitesse_croisiere(double vitesse) { this.vitesse_croisiere = vitesse; }

    public abstract String getTransportType();

    public static double getMaxWeight() { return POIDS_MAX; }

    public static double getMaxSpeed() { return VITESSE_MAX; }

    public static String getRegistrationTime() { return DATE_ENREGISTREMENT; }

    public void start() { System.out.println(getTransportType() + " started"); }

    public void move() { System.out.println(getTransportType() + " moving"); }

    public void stop() { System.out.println(getTransportType() + " stopped"); }

    public void run() {
        start();
        move();
        stop();
    }

    @Override
    public void dump() {
        System.out.printf("Instance %d of Transport: emptyWeight=%.2f, cruisingSpeed=%.2f%n",
                instanceId, poids_vide, vitesse_croisiere);
    }
}
