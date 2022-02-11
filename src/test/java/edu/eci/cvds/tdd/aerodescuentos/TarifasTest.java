package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {



    //casos limite




    @Test
    public void validateNoDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 20, 18), 500000,  0.0);

    }
    @Test
    public void validateNoDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 20, 65), 500000,  0.0);

    }
    @Test
    public void validate15PercentDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 21, 22), 500000*0.85,  0.0);

    }
    @Test
    public void validate5PercentDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 19, 17), 500000*0.95,  0.0);
    }
    @Test
    public void validate8PercentDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 19, 66), 500000*0.92,  0.0);

    }
    @Test
    public void validate8PercentDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 19, 119), 500000*0.92,  0.0);
    }
    @Test
    public void validate20PercentDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 24, 17), 500000*0.80,  0.0);
    }
    @Test
    public void validate23PercentDisc() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 27, 66), 500000*0.77,  0.0);
    }
    @Test
    public void validate23PercentDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 30, 119), 500000*0.77,  0.0);
    }



    //casos medios


    @Test
    public void validateNoDisc2() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(500000, 15, 25), 500000,  0.0);

    }
    @Test
    public void validate15PercentDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(400000, 30, 23), 400000*0.85,  0.0);

    }
    @Test
    public void validate5PercentDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(350000, 18, 12), 350000*0.95,  0.0);
    }
    @Test
    public void validate8PercentDisc2() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(380000, 11, 69), 380000*0.92,  0.0);
    }
    @Test
    public void validate20PercentDisc1() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(700000, 24, 8), 700000*0.80,  0.0);
    }
    @Test
    public void validate23PercentDisc2() {
        CalculadorDescuentos calculator = new CalculadorDescuentos();
        Assert.assertEquals( calculator.calculoTarifa(200000, 28, 72), 200000*0.77,  0.0);
    }

}
