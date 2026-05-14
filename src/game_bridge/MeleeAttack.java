package game.bridge;

import game.Enemy;

public class MeleeAttack implements AttackStrategy {

    @Override
    public int attack(Enemy target) {
        int damage = (int)(Math.random() * 10);
        System.out.println("Melee attack:"+damage);
        return damage;
    }
}
//Considerar otra implementación: LaserAttack(40)