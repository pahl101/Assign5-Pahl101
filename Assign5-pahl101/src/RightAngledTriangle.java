/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author Madison Pahl
 * @version 4/18/16
 * 
 * This class extends all the functionality from a regular triangle, but changes the formula to get the
 * area and to make sure there is a valid input.
 */
public class RightAngledTriangle extends Triangle {
    
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception {
        super(width, height, hypotenuse);
    }
    
    /*
     * (non-Javadoc)
     * @see Triangle#validateInput(double, double, double)
     *  @param taking in the sides of a triangle. sideA, sideB, and sideC
     * @return returns a boolean to whether or not the input is valid based on the below equations
     * @throws an exception to ensure that there was a valid input of sides
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
        
    		
            if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){ //may have been bug here
                return true; //forgot to add comments as I edited the code (but this needed the correct formula)
            }

            else return false;
    }

  /*
   * (non-Javadoc)
   * @see Triangle#getArea()
   * @param no input parameters. Uses sides gain from getSide methods.
   * @return returns a double, which is the area of the right angled triangle.
   */
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
