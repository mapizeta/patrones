package external.robo;

public class EnemyRobot {

    private int energy = 100;
    private boolean activated = false;

    public void bootSequence() {
        System.out.println("Booting robot...");
        activated = true;
    }

    public void moveForward(int steps) {
        if (!activated) {
            System.out.println("Robot not activated");
            return;
        }
        System.out.println("Moving " + steps + " steps");
        energy -= steps;
    }

    public void smash(int damage) {
        if (!activated) {
            System.out.println("Robot not activated");
            return;
        }
        System.out.println("Smash attack with damage " + damage);
        energy -= 5;
    }

    public int energyLevel() {
        return energy;
    }

    public void receiveShock(int amount) {
        System.out.println("⚡ Robot receives shock: " + amount);
        energy -= amount;
    }

    public void setEnergy(int e){
        energy = e;
    }
}