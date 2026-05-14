package game;

public class MyRobo implements Robot {

    private int life = 100;
    private boolean activated = false;


    @Override
    public void activate() {
        System.out.println("Iniciando robot...");
        activated = true;
    }

    @Override
    public int attack(Robot enemy) {
        if (!activated) {
            System.out.println("Robot no activado");
            return 0;
        }
        System.out.println("Golpea y gasta life");
        life -= 5;
        enemy.takeDamage(20);
        return enemy.getHealth();
    }

    @Override
    public void takeDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getHealth() {
        return life;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }
    
}
