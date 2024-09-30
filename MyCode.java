import java.util.Scanner;

/**
 * @author isamil
 **/
public class MyCode {


    public static void main(String[] args) {
        char[][] cells={{' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}};
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER CELL LOCATION :\t FROM 1->>>9");
        String UserInput=scanner.nextLine();
        System.out.println(UserInput);
        switch (UserInput){
            case "1": cells[0][0]='X';
            case "2": cells[0][0]='X';
            case "3": cells[0][0]='X';
            case "4": cells[0][0]='X';
            case "5": cells[0][0]='X';
            case "6": cells[0][0]='X';
            case "7": cells[0][0]='X';
            case "8": cells[0][0]='X';
            case "9": cells[0][0]='X';
            default:System.out.println("Not valid Number");
        }

    }
    private void printGame(){
System.out.println("_____");
    }
}
