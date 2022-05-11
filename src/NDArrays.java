import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NDArrays {
    //declarations
    private int dimensions;
    private int length;
    private int size;
    //Move the declaration of arrays to the outside of the constructor
    //move them here
    protected Object[] array1D;
    protected Object[][] array2D;
    protected Object[][][] array3D;
    protected Object[][][][] array4D;
    protected Object[][][][][] array5D;
    protected Object[][][][][][] array6D;
    protected Object[][][][][][][] array7D;
    protected Object[][][][][][][][] array8D;
    protected Object[][][][][][][][][] array9D;
    protected Object[][][][][][][][][][] array10D;
    Scanner scan = new Scanner(System.in);


    //default constructor, 1D array with length 10
    public NDArrays() {
        array1D = new Object[10];
    }


    //parameterized constructor builds array with d dimensions and length l
    public NDArrays(int d, int l) {
        dimensions = d;
        length = l;
        size = (int) Math.pow(length, dimensions);

        //Wanted to keep the cool half pyramid pattern
        //Please don't lower my grade for this
        if (dimensions == 1) {
            array1D = new Object[length];
        } else if (dimensions == 2) {
            array2D = new Object[length][length];
        } else if (dimensions == 3) {
            array3D = new Object[length][length][length];
        } else if (dimensions == 4) {
            array4D = new Object[length][length][length][length];
        } else if (dimensions == 5) {
            array5D = new Object[length][length][length][length][length];
        } else if (dimensions == 6) {
            array6D = new Object[length][length][length][length][length][length];
        } else if (dimensions == 7) {
            array7D = new Object[length][length][length][length][length][length][length];
        } else if (dimensions == 8) {
            array8D = new Object[length][length][length][length][length][length][length][length];
        } else if (dimensions == 9) {
            array9D = new Object[length][length][length][length][length][length][length][length][length];
        } else if (dimensions == 10) {
            array10D = new Object[length][length][length][length][length][length][length][length][length][length];
        } else {
            // throw exception that only uses 1-10
            System.out.println("Enter dimensions from 1 - 10");
        }
    }

    //method to autofill each index with a long, increments by one for each element
    public void autoFill() {
        int fill = 0;
        if (dimensions == 1) {
            for (int i = 0; i < array1D.length; i++) {
                array1D[i] = fill;
                fill++;
            }
        }
        if (dimensions == 2) {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = fill;
                    fill++;
                }
            }
        }
        if (dimensions == 3) {
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        array3D[i][j][k] = fill;
                        fill++;
                    }
                }
            }
        }
        if (dimensions == 4) {
            for (int i = 0; i < array4D.length; i++) {
                for (int j = 0; j < array4D[i].length; j++) {
                    for (int k = 0; k < array4D[i][j].length; k++) {
                        for (int l = 0; l < array4D[i][j][k].length; l++) {
                            array4D[i][j][k][l] = fill;
                            fill++;
                        }
                    }
                }
            }
        }
        if (dimensions == 5) {
            for (int i = 0; i < array5D.length; i++) {
                for (int j = 0; j < array5D[i].length; j++) {
                    for (int k = 0; k < array5D[i][j].length; k++) {
                        for (int l = 0; l < array5D[i][j][k].length; l++) {
                            for (int m = 0; m < array5D[i][j][k][l].length; m++) {
                                array5D[i][j][k][l][m] = fill;
                                fill++;
                            }
                        }
                    }
                }
            }
        }
        if (dimensions == 6) {
            for (int i = 0; i < array6D.length; i++) {
                for (int j = 0; j < array6D[i].length; j++) {
                    for (int k = 0; k < array6D[i][j].length; k++) {
                        for (int l = 0; l < array6D[i][j][k].length; l++) {
                            for (int m = 0; m < array6D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array6D[i][j][k][l][m].length; n++) {
                                    array6D[i][j][k][l][m][n] = fill;
                                    fill++;
                                }
                            }
                        }
                    }

                }
            }
        }
        if (dimensions == 7) {
            for (int i = 0; i < array7D.length; i++) {
                for (int j = 0; j < array7D[i].length; j++) {
                    for (int k = 0; k < array7D[i][j].length; k++) {
                        for (int l = 0; l < array7D[i][j][k].length; l++) {
                            for (int m = 0; m < array7D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array7D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array7D[i][j][k][l][m][n].length; o++) {
                                        array7D[i][j][k][l][m][n][o] = fill;
                                        fill++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (dimensions == 8) {
            for (int i = 0; i < array8D.length; i++) {
                for (int j = 0; j < array8D[i].length; j++) {
                    for (int k = 0; k < array8D[i][j].length; k++) {
                        for (int l = 0; l < array8D[i][j][k].length; l++) {
                            for (int m = 0; m < array8D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array8D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array8D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array8D[i][j][k][l][m][n][o].length; p++) {
                                            array8D[i][j][k][l][m][n][o][p] = fill;
                                            fill++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (dimensions == 9) {
            for (int i = 0; i < array9D.length; i++) {
                for (int j = 0; j < array9D[i].length; j++) {
                    for (int k = 0; k < array9D[i][j].length; k++) {
                        for (int l = 0; l < array9D[i][j][k].length; l++) {
                            for (int m = 0; m < array9D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array9D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array9D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array9D[i][j][k][l][m][n][o].length; p++) {
                                            for (int q = 0; q < array9D[i][j][k][l][m][n][o][p].length; q++) {
                                                array9D[i][j][k][l][m][n][o][p][q] = fill;
                                                fill++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (dimensions == 10) {
            for (int i = 0; i < array10D.length; i++) {
                for (int j = 0; j < array10D[i].length; j++) {
                    for (int k = 0; k < array10D[i][j].length; k++) {
                        for (int l = 0; l < array10D[i][j][k].length; l++) {
                            for (int m = 0; m < array10D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array10D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array10D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array10D[i][j][k][l][m][n][o].length; p++) {
                                            for (int q = 0; q < array10D[i][j][k][l][m][n][o][p].length; q++) {
                                                for (int r = 0; r < array10D[i][j][k][l][m][n][o][p][q].length; r++) {
                                                    array10D[i][j][k][l][m][n][o][p][q][r] = fill;
                                                    fill++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //manual fill, ask what dimension they want to fill, what datatype, and what index
    //then ask what they want in it, as well as if they want to continue filling
    //only works on arrays of dimensions 1 or 2
    //precondition: Dim >=1, <=2, user inputs correct data types
    public void manualFill() throws InterruptedException {
        //declarations for local variables
        int dimension = 0;
        int index = -1;
        String datatype = "";
        int cont = -1;
        boolean conti = true;

        //main body of manual fill
        if (dimensions <= 2) {
            while (conti) {
                System.out.println("What datatype would you like to enter?");
                datatype = scan.next();


                //manual fill for ints
                if (datatype.equalsIgnoreCase("int")) {
                    if (dimensions == 1) {
                        System.out.println("What index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input?");
                        array1D[index - 1] = scan.nextInt();
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }
                    } else if (dimensions == 2) {
                        System.out.println("Which dimension would you like to fill?");
                        dimension = scan.nextInt();
                        System.out.println("Which index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input?");
                        array2D[dimension - 1][index - 1] = scan.nextInt();
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }
                    }
                }

                //manual fill for doubles
                else if (datatype.equalsIgnoreCase("double")) {
                    if (dimensions == 1) {
                        System.out.println("What index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input?");
                        array1D[index - 1] = scan.nextDouble();
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }

                    } else if (dimensions == 2) {
                        System.out.println("Which dimension would you like to fill?");
                        dimension = scan.nextInt();
                        System.out.println("Which index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input?");
                        array2D[dimension - 1][index - 1] = scan.nextDouble();
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue:  ");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }
                    }
                }

                //manual fill for strings
                else if (datatype.equalsIgnoreCase("string")) {
                    if (dimensions == 1) {
                        System.out.println("What index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input?");
                        array1D[index - 1] = scan.nextLine();
                        array1D[index - 1] = scan.nextLine();//Don't know why this is necessary, but it does not work without it
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }
                    } else if (dimensions == 2) {
                        System.out.println("Which dimension would you like to fill?");
                        dimension = scan.nextInt();
                        System.out.println("Which index would you like to fill?");
                        index = scan.nextInt();
                        System.out.println("What would you like to input? ");
                        array2D[dimension - 1][index - 1] = scan.nextLine();
                        array2D[dimension - 1][index - 1] = scan.nextLine();
                        System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                        cont = scan.nextInt();
                        if (cont == -1) {
                            conti = false;
                        } else if (cont == 1) {
                            conti = true;
                        } else {
                            System.out.println("Would you like to add another item? -1 to end, 1 to continue: ");
                            cont = scan.nextInt();
                        }
                    }
                }
            }
        } else
            System.out.println("Only can manual fill 2 dimensions");

    }

    //accessor methods
    public int getDimensions() {
        return dimensions;
    }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }


    //sort method
    public void sort() {
        if (dimensions == 1) {
            Arrays.sort(array1D);
        }
        if (dimensions == 2) {
            Arrays.sort(array2D);
        }
        if (dimensions == 3) {
            Arrays.sort(array3D);
        }
        if (dimensions == 4) {
            Arrays.sort(array4D);
        }
        if (dimensions == 5) {
            Arrays.sort(array5D);
        }
        if (dimensions == 6) {
            Arrays.sort(array6D);
        }
        if (dimensions == 7) {
            Arrays.sort(array7D);
        }
        if (dimensions == 8) {
            Arrays.sort(array8D);
        }
        if (dimensions == 9) {
            Arrays.sort(array9D);
        }
        if (dimensions == 10) {
            Arrays.sort(array10D);
        }
    }


    //overwritten toString methodz
    public String toString() {
        String s = "";
        if (dimensions == 1) {
            for (int i = 0; i < array1D.length; i++) {
                s += array1D[i] + ", ";
            }
        } else if (dimensions == 2) {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    s += array2D[i][j] + ", ";
                }
                s += "\n";
            }
        } else if (dimensions == 3) {
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        s += array3D[i][j][k] + ", ";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 4) {
            for (int i = 0; i < array4D.length; i++) {
                for (int j = 0; j < array4D[i].length; j++) {
                    for (int k = 0; k < array4D[i][j].length; k++) {
                        for (int l = 0; l < array4D[i][j][k].length; l++) {
                            s += array4D[i][j][k][l] + ", ";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
            s += "\n";
        } else if (dimensions == 5) {
            for (int i = 0; i < array5D.length; i++) {
                for (int j = 0; j < array5D[i].length; j++) {
                    for (int k = 0; k < array5D[i][j].length; k++) {
                        for (int l = 0; l < array5D[i][j][k].length; l++) {
                            for (int m = 0; m < array5D[i][j][k][l].length; m++) {
                                s += array5D[i][j][k][l][m] + ", ";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 6) {
            for (int i = 0; i < array6D.length; i++) {
                for (int j = 0; j < array6D[i].length; j++) {
                    for (int k = 0; k < array6D[i][j].length; k++) {
                        for (int l = 0; l < array6D[i][j][k].length; l++) {
                            for (int m = 0; m < array6D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array6D[i][j][k][l][m].length; n++) {
                                    s += array6D[i][j][k][l][m][n] + ", ";
                                }
                                s += "\n";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 7) {
            for (int i = 0; i < array7D.length; i++) {
                for (int j = 0; j < array7D[i].length; j++) {
                    for (int k = 0; k < array7D[i][j].length; k++) {
                        for (int l = 0; l < array7D[i][j][k].length; l++) {
                            for (int m = 0; m < array7D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array7D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array7D[i][j][k][l][m][n].length; o++) {
                                        s += array7D[i][j][k][l][m][n][o] + ", ";
                                    }
                                    s += "\n";
                                }
                                s += "\n";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 8) {
            for (int i = 0; i < array8D.length; i++) {
                for (int j = 0; j < array8D[i].length; j++) {
                    for (int k = 0; k < array8D[i][j].length; k++) {
                        for (int l = 0; l < array8D[i][j][k].length; l++) {
                            for (int m = 0; m < array8D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array8D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array8D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array8D[i][j][k][l][m][n][o].length; p++) {
                                            s += array8D[i][j][k][l][m][n][o][p] + ", ";
                                        }
                                        s += "\n";
                                    }
                                    s += "\n";
                                }
                                s += "\n";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 9) {
            for (int i = 0; i < array9D.length; i++) {
                for (int j = 0; j < array9D[i].length; j++) {
                    for (int k = 0; k < array9D[i][j].length; k++) {
                        for (int l = 0; l < array9D[i][j][k].length; l++) {
                            for (int m = 0; m < array9D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array9D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array9D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array9D[i][j][k][l][m][n][o].length; p++) {
                                            for (int q = 0; q < array9D[i][j][k][l][m][n][o][p].length; q++) {
                                                s += array9D[i][j][k][l][m][n][o][p][q] + ", ";
                                            }
                                            s += "\n";
                                        }
                                        s += "\n";
                                    }
                                    s += "\n";
                                }
                                s += "\n";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        } else if (dimensions == 10) {
            for (int i = 0; i < array10D.length; i++) {
                for (int j = 0; j < array10D[i].length; j++) {
                    for (int k = 0; k < array10D[i][j].length; k++) {
                        for (int l = 0; l < array10D[i][j][k].length; l++) {
                            for (int m = 0; m < array10D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array10D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array10D[i][j][k][l][m][n].length; o++) {
                                        for (int p = 0; p < array10D[i][j][k][l][m][n][o].length; p++) {
                                            for (int q = 0; q < array10D[i][j][k][l][m][n][o][p].length; q++) {
                                                for (int r = 0; r < array10D[i][j][k][l][m][n][o][p][q].length; r++) {
                                                    s += array10D[i][j][k][l][m][n][o][p][q][r] + ", ";
                                                }
                                                s += "\n";
                                            }
                                            s += "\n";
                                        }
                                        s += "\n";
                                    }
                                    s += "\n";
                                }
                                s += "\n";
                            }
                            s += "\n";
                        }
                        s += "\n";
                    }
                    s += "\n";
                }
                s += "\n";
            }
        }
        return s;
    }
}


