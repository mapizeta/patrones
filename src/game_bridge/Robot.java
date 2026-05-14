package game;

public interface Robot {
    void activate();
    void move();
    int attack(Robot enemy);
    void takeDamage(int damage);
    int getHealth();
}
