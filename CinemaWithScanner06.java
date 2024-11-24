import java.util.Scanner;

public class CinemaWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Cinema Menu List:");
            System.out.println("Menu 1: Input audience data");
            System.out.println("Menu 2: Show audience list");
            System.out.println("Menu 3: Exit");
            System.out.println();
            System.out.print("Input the menu numbers (1-3): ");
            int menu = sc.nextInt();

            if (menu==1) {
                while (true) {
                    System.out.print("Enter a name: ");
                    name = sc.next();
                    System.out.print("Enter row number (1-4): ");
                    row = sc.nextInt();
                    System.out.print("Enter column number (1-2): ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if(row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("That row or column is not valid, please enter row 1 to 4 and column 1 to 2!");
                        System.out.println();
                        continue;
                    }
                    if(audience[row - 1][column - 1] != null) {
                        System.out.println("Seat row-" + row + " Column-" + column + " is existed. Choose another seat");
                        System.out.println();
                        continue;
                    }

                    audience[row - 1][column - 1] = name;
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = sc.nextLine();
                    System.out.println();

                    if (next.equalsIgnoreCase("n")) {
                        System.out.println("Back to menu~");
                        System.out.println();
                        break;
                        }
                    }
                }

                if (menu==2) {
                    System.out.println("Audience list:");
                    for (int i = 0; i < audience.length; i++) {
                        System.out.print("Audience in the row " + (i+1) + ": ");
                        for(int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] != null) {
                                System.out.print(audience[i][j]);
                            }
                            if (audience[i][j] == null) {
                                System.out.print("***");
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
                if (menu==3) {
                    System.out.println("Exiting~");
                    break;
                }
        
        }
        sc.close();
    }
}
