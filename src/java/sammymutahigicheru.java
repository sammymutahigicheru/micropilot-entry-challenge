
/*
 * Given a, b, c for a quadratric expression ax2 + bx + c = 0.
 *  Write a function getX that returns the larger of the values for X, i.e. if x1 = -2 and x2 = 5, getX should return 5.
 *
 *
 * */

public class sammymutahigicheru {

    double getX(double a, double b, double c) {

        //roots
        double x2 = 0;
        double x1 = 0;

        // calculate the determinant (b^2 - 4ac)
        double determinant = b * b - 4 * a * c;

        /*
         * First Test Case( det > 0)
         *
         * */
        if (determinant > 0) {

            // two real and distinct roots
            x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            x2 = (-b - Math.sqrt(determinant)) / (2 * a);

        }
        /*
         * Second Test Case (det == 0)
         * */
        else if (determinant == 0) {

            // x1 and x2 are equal
            // det = 0
            // so -b + 0 == -b
            x1 = x2 = -b / (2 * a);
        }
        /*
         * Third Test Case (det < 0)
         * */
        else {

            // x1 and x2 are complex numbers and distinct
            x1 = -b / (2 * a);
            x2 = Math.sqrt(-determinant) / (2 * a);
        }
        //return the maximum
        return Math.max(x1, x2);
    }
}
