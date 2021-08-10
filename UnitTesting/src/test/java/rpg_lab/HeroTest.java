package rpg_lab;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void testHeroGainsXPByKillingTargets(){

        Weapon weapon = Mockito.mock(Weapon.class);

        Hero hero = new Hero("Test_Hero", weapon);

        Target target = Mockito.mock(Target.class);
        Mockito.when(target.isDead()).thenReturn(true);
        Mockito.when(target.giveExperience()).thenReturn(10);

        hero.attack(target);

        assertEquals(10, hero.getExperience());


       /* Target target = new Target() {
            @Override
            public void takeAttack(int attackPoints) {

            }

            @Override
            public int giveExperience() {
                return 10;
            }

            @Override
            public boolean isDead() {
                return true;
            }
        };

        Weapon weapon = new Weapon() {
            @Override
            public void attack(Target target) {

            }
        };

        Hero hero = new Hero("Test_Hero", weapon);

        hero.attack(target);

        assertEquals(10, hero.getExperience());*/
    }

    /*@Test
    public  void testItemDropShouldDropCorrectly(){
        Weapon weapon = Mockito.mock(Weapon.class);

        Hero hero = new Hero("Test_Hero", weapon);

        Target target = Mockito.mock(Target.class);
        Mockito.when(target.isDead()).thenReturn(true);
        Random random = Mockito.mock(Random.class);
        Weapon weapon3 = Mockito.mock(Weapon.class);
        Mockito.when(weapon3.getAttack()).thenReturn(73);
        Mockito.when(target.dropWeapon((Random) Mockito.any())).thenReturn(weapon3);
        Weapon wep = hero.attack(target,random);

        Mockito.when(target.dropWeapon(random)).thenReturn(weapon3);


    }*/

}