
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author Madison Pahl
 * @version 4/18/16
 * 
 * This class calculates the Perimeter and the area of a triangle from given inputs. 
 * There are functions to get inputs for the sides, a function to make sure there is valid input,
 * and functions to calculate the perimeter and the area.
 */

public class Triangle {
    
    protected double sideA;
    
   
    protected double sideB;
    
    
    protected double sideC;
    
 
    Triangle(double sideA, double sideB, double sideC) throws Exception {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
   /*
    * @param the validInput takes in each side of a triangle sideA, sideB, and sideC
    * @return true if equation below is satisfied and false if not.
    * @throws to ensure that there is a valid input
    */
    public boolean validateInput(double sideA, double sideB, double sideC) throws Exception { //there was a bug here (code missing information)
       if( sideA < sideB + sideC || sideB < sideA + sideC ||  sideC < sideA + sideB ){
           return true;
       }
       
       else {
    	   throw new Exception("Invalid Inputs");
  
       }
    }
   
    /*
     * @param no parameter taken in
     * @return sideA, gets the sideA
     */
    public double getSideA() {
        return this.sideA;
    }
    
    /*
     * @param no parameter taken in
     * @return sideB, gets the sideB
     */
    public double getSideB() {
        return this.sideB;
    }
    
    /*
     * @param no parameter taken in
     * @return sideC, gets the sideC
     */
    public double getSideC() {
        return this.sideC;
    }
    
 /*
  * @param no parameter taken in
  * @return the perimeter amount in the size of double
  */
    public double getPerimeter() {
    	double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    
  /*
   * @param no parameter taken in
   * @return the area from the equation in the size of double
   */
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
