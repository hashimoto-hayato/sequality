package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    assertEquals(2.5, calc.average(2, 3), 0.001); // 第3引数は誤差許容範囲
  }

  @Test
  public void testSumBetween() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumBetween(1, 10)); // 1+2+...+10 = 55
  }

  @Test
  public void testSumOdd() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOdd(1, 10)); // 1+3+5+7+9
  }

  @Test
  public void testSumEven() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEven(1, 10)); // 2+4+6+8+10
  }
}
