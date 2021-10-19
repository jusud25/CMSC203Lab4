package gradebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
   private GradeBook g1;
   private GradeBook g2;

   @BeforeEach
   public void setUp() throws Exception {
       g1 = new GradeBook(5);
       g1.addScore(25.0);
       g1.addScore(75.0);
      
       g2 = new GradeBook(5);
       g2.addScore(40.0);
       g2.addScore(60.0);
   }

   @AfterEach
   public void tearDown() throws Exception {
       g1 = null;
       g2 = null;
   }

   /**
   * Compare the results on the arrays to the ones being displayed
   * Compare score size to the expected numbers of scores
   */
   @Test
   public void testAddScore() {
       assertTrue((g1.toString()).equals(" 25.0 75.0 "));
       assertTrue((g2.toString()).equals(" 40.0 60.0 "));
      
       assertEquals(2, g1.getScoreSize(), 0.001);
       assertEquals(2, g2.getScoreSize(), 0.001);
   }

   /**
   * Compares the total when all the numbers are added
   */
   @Test
   public void testingSum() {
       assertEquals(100.0, g1.sum(), .001);
       assertEquals(100.0, g2.sum(), .001);
   }

   /**
   * Compare the minimum of the numbers
   */
   @Test
   public void minimumtesting() {
       assertEquals(25.0, g1.minimum(), .001);
       assertEquals(40.0, g2.minimum(), .001);
   }

   /**
   * Compare the maximum of the numbers
   */
   @Test
   public void finalScoretTesting() {
       assertEquals(75.0, g1.finalScore(), .001);
       assertEquals(60.0, g2.finalScore(), .001);
   }
}