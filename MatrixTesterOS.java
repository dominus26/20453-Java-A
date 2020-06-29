/**
 * 2020b 20453 Tester for Maman 16 by Oren Sharvit
 */

public class MatrixTesterOS {

    public static void main (String[] args) {
        // Testing passing 1 variable to Matrix:
        System.out.println("1. Matrix with 1 variable");
        System.out.println("i. 1x1 Matrix");
        int[][] a = {{1}};
        Matrix A = new Matrix(a);
        System.out.println(A);
        System.out.println();
        System.out.println("ii. 2x4 Matrix");
        int[][] b = {{1,2,3,4}, {5,6,7,8}};
        Matrix B = new Matrix(b);
        System.out.println(B);
        System.out.println();
        System.out.println("iii. 3x3");
        int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        System.out.println(D);
        System.out.println("Another 3x3");
        System.out.println();
        int [][] e ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
            };
        Matrix E = new Matrix(e);
        System.out.println(E);
        System.out.println();

        // Testing passing 2 variables to Matrix:
        System.out.println("2. Matrix with 2 variables");
        System.out.println("2x2 Zeros");
        Matrix F = new Matrix(2,2);
        System.out.println(F);
        System.out.println();
        System.out.println("3x4 Zeros");
        Matrix G = new Matrix(3,4);
        System.out.println(G);
        System.out.println();

        // Testing MakeNegative Matrix:
        System.out.println("3. Testing the MakeNegative Method:");
        int[][] neg = { { 19, 124, 28, 35, 38 }, { 115, 22, 25, 230,31 }, { 9, 21, 22, 249,230} ,{0,6,9,232,255},{2,5,10,116,129}};
        Matrix H = new Matrix(neg);
        System.out.println("\tThe Original Matrix:");
        System.out.println(H);
        System.out.println("\tThe Negative Matrix:");
        System.out.println(H.makeNegative());

        // Testing filter method:
        System.out.println("4. Testing the imageFilter method:");
        int[][] filter = { { 19, 124, 28, 35, 38 }, { 115, 22, 25, 230,31 }, { 9, 21, 22, 249,230} ,{0,6,9,232,255},{2,5,10,116,129}};
        Matrix I = new Matrix(filter);
        System.out.println("\tThe Original Matrix:");
        System.out.println(I);
        System.out.println("\tThe 'filtered' Matrix:");
        System.out.println(I.imageFilterAverage());
        
        // Testing rotate clockwise
        System.out.println("5. Testing the RotateClockwise method:");
        int[][] rotate = { { 19, 124, 28, 35}, { 115, 22, 25, 230 }, { 19, 21, 22, 249} ,{0,16,9,232},{62,35,10,116}};
        Matrix J = new Matrix(rotate);
        System.out.println("\tThe Original Matrix:");
        System.out.println(J);
        System.out.println("\tThe 'Rotated' Matrix:");
        System.out.println(J.rotateClockwise());
        System.out.println("\tRotated 2 times:");
        System.out.println(J.rotateClockwise().rotateClockwise());
        System.out.println("Rotated 4 times (should be the original):");
        System.out.println(J.rotateClockwise().rotateClockwise().rotateClockwise().rotateClockwise());        
        
        // Testing rotate counter clockwise
        System.out.println("5. Testing the RotateCounterClockwise method:");
        int[][] rotateCCW = { { 19, 124, 28, 35}, { 115, 22, 25, 230 }, { 19, 21, 22, 249} ,{0,16,9,232},{62,35,10,116}};
        Matrix K = new Matrix(rotateCCW);
        System.out.println("\tThe Original Matrix:");
        System.out.println(K);
        System.out.println("\tThe 'Rotated' Matrix:");
        System.out.println(K.rotateCounterClockwise());
        System.out.println("\tRotated 2 times:");
        System.out.println(K.rotateCounterClockwise().rotateCounterClockwise());
        System.out.println("Rotated 4 times (Should be original Matrix:)");
        System.out.println(K.rotateCounterClockwise().rotateCounterClockwise().rotateCounterClockwise().rotateCounterClockwise());        
    }
}