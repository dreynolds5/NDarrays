import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        //declarations
        int dimension;
        int ln;
        int datatypesearch;
        int choice = 0;
        Searcher array = new Searcher();
        Scanner scanner = new Scanner(System.in);



        //intro art
        //ascii art made by patorjk.com
        System.out.println("\n" +
                "  _   _ ____       _                            ____                           _             \n" +
                " | \\ | |  _ \\     / \\   _ __ _ __ __ _ _   _   / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __ \n" +
                " |  \\| | | | |   / _ \\ | '__| '__/ _` | | | | | |  _ / _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|\n" +
                " | |\\  | |_| |  / ___ \\| |  | | | (_| | |_| | | |_| |  __/ | | |  __/ | | (_| | || (_) | |   \n" +
                " |_| \\_|____/  /_/   \\_\\_|  |_|  \\__,_|\\__, |  \\____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|   \n" +
                "                                       |___/                                                 \n");
        System.out.println("Made by Danny Reynolds");




        //main runner class, gives user choices on what they want to do
        //choices 1 - 5
        /* 1: create array
            2: fill array
            3: searches for a term
            4: prints size, length, dimensions, and array
            5: quits
         */
        //precondition: User inputs correct data type
        while (choice != 5){
            System.out.println("Chose an option: \n" +
                    " 1: Create an array \n" +
                    " 2: Fill an array \n" +
                    " 3: Search for a term in the array \n" +
                    " 4: Get array information \n" +
                    " 5: Quit");
            System.out.print("");
            choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Enter the number of dimensions 1 - 10: ");
                dimension = scanner.nextInt();
                System.out.println("Enter the length of each dimension: ");
                ln = scanner.nextInt();
                //calls constructors
                array = new Searcher(dimension, ln);
            }

            else if (choice == 2){
                //gives choice for autofill/manualfill
                System.out.println("1: Autofill (all dimensions)\n" +
                        "2: Manual fill (only 1 or 2 dimensions)");
                choice = scanner.nextInt();
                if (choice == 1){
                    array.autoFill();
                }
                else if (choice == 2) {
                    array.manualFill();
                }

            }

            else if (choice == 3){
                //gives search datatypes
                System.out.println("What datatype do you want to search for? \n" +
                        "1: String \n" +
                        "2: Integer \n" +
                        "3: Double");
                datatypesearch = scanner.nextInt();
                //searches for strings
                if(datatypesearch == 1){
                    String target;
                    System.out.println("Enter your search target: ");
                    target = scanner.nextLine();
                    target = scanner.nextLine();
                    System.out.println(array.search(target));
                }

                //searches for ints
                if(datatypesearch == 2){
                    int target;
                    System.out.println("Enter your search target: ");
                    target = scanner.nextInt();
                    System.out.println(array.search(target));

                }

                //searches for doubles
                if(datatypesearch == 3){
                    double target;
                    System.out.println("Enter your search target: ");
                    target = scanner.nextDouble();
                    System.out.println(array.search(target));
                }
            }

            // prints array information
            else if (choice == 4){
                int s = array.getSize();
                int d = array.getDimensions();
                int l = array.getLength();
                String str = array.toString();
                System.out.println("Size: " + s + "\n" +
                        "Dimensions: " + d + "\n" +
                        "Length: " + l + "\n" +
                        "Array: \n" + str);

            }

            //closes scanner and ends program
            else if (choice == 5){
                scanner.close();
                break;
            }

            //repeats if not option 1 - 5
            else {
                System.out.println("Chose an option: \n" +
                        " 1: Create an array \n" +
                        " 2: Fill an array \n" +
                        " 3: Search for a term in the array \n" +
                        " 4: Get array information \n" +
                        " 5: Quit");
                choice = scanner.nextInt();
            }
        }
    }
}

