package Lab10.CPS_20191_G3_lab10;

import org.junit.Assert;
import org.junit.Test;

   public class AppTest {
   @Test
        
    
    public void testApp()
    {
        Assert.assertTrue(true);
    }
   @Test
   public void testResta() {
	   int valor=2;
	   int n1=6;
	   int n2=4;
	   App app=new App();
	   int resta=app.restar(n1,n2);
	   Assert.assertEquals(valor, resta);
   }
}
