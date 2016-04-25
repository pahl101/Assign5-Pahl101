/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Equilateral Triangle
 * @author Dr. Donyina
 * @author Madison Pahl
 * @version 4/18/16
 * 
 * This class extends the regular triangle class, with all of its functionality, and then changes
 * the area equation to be specific for an equilateral triangle and for  a valid input
 */
public class EquilateralTriangle extends Triangle {
 
    EquilateralTriangle(double length)
            throws Exception {
        super(length, length, length);
    }

   /*
    * (non-Javadoc)
    * @see Triangle#validateInput(double, double, double)
    * @param takes in sideA sideB and sideC to ensure they are valid for an equilateral triangle.
    * @return true or false depending if the statement is correct or not.
    * @throws exception to ensure that there is a valid input
    */
    public boolean validateInput(double sideA, double sideB, double sideC) {
    	if (sideA == sideB && sideA == sideC && sideB == sideC){ //think there was code bug here (missing info)
    		return true;
    	}

    	else return false;
    }

   /*
    * (non-Javadoc)
    * @see Triangle#getArea()
    * @param does not take in any parameters, just uses the sides collected through the getSide functions
    * @return returns a double of the area of the equilateral triangle.
    */
    public double getArea() {
        return (Math.sqrt(3)/4) * sideA * sideA;
    }

}
