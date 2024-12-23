package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeamBTest {

    @Test
    public void testGetRankFromGrade_A() {
        Assertions.assertEquals("High Distinction", TeamB.getRankFromGrade("A"));
    }

    @Test
    public void testGetRankFromGrade_BPlus() {
        Assertions.assertEquals("Distinction", TeamB.getRankFromGrade("B+"));
    }

    @Test
    public void testGetRankFromGrade_C() {
        Assertions.assertEquals("Good", TeamB.getRankFromGrade("C"));
    }

    @Test
    public void testGetRankFromGrade_F() {
        Assertions.assertEquals("Failed", TeamB.getRankFromGrade("F"));
    }

    @Test
    public void testGetRankFromGrade_Unknown() {
        Assertions.assertEquals("Unknown", TeamB.getRankFromGrade("Z"));
    }

    @Test
    public void testCalculateBuddhistEra() {
    int age = 20;
    // ค่าที่ถูกต้องควรเป็น 2547 ตามสูตร
    Assertions.assertEquals(2547, TeamB.calculateBuddhistEra(age));
    }
}
