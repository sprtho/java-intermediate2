package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zelaot;

public class UnitUtilTest {

    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

        Zelaot z1 = new Zelaot("질럿1", 100);
        Zelaot z2 = new Zelaot("질럿2", 150);
        Zelaot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZelaot = " + resultZealot);

    }
}
