import java.util.Random;
import java.util.Scanner;

public class MyCode{
    public static void main(String[] args) {
        char[][] cells={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
       Scanner scanner=new Scanner(System.in);
       while (true) {
           if(CheckExist(cells)){
               scanner.close();
               System.out.println("GAME IS ENDED \n RELOADED AND PLAY AGAIN 👽");
               break;
           }
           if (CheckWining(cells,'X')){
               System.out.println("====== You Won =====");
               break;
           }
           if (CheckWining(cells,'O')){
               System.out.println("====== You Lost =====");
               break;
           }
           PlayerMove(scanner, cells);

//        Computer move
           ComputerTurn(cells);

           Print(cells);
           }

    }
    private static boolean CheckWining(char[][] cells,char symbol){
        if ((cells[0][0]==symbol && cells[0][1]==symbol && cells[0][2]==symbol)||
                (cells[1][0]==symbol && cells[1][1]==symbol&&cells[1][2]==symbol)||
                (    cells[2][0]==symbol && cells[2][1]==symbol&&cells[2][2]==symbol)||
                (cells[0][2]==symbol && cells[1][2]==symbol&&cells[2][2]==symbol)||
                (cells[2][0]==symbol && cells[1][1]==symbol&&cells[0][2]==symbol)||

        (cells[0][0]==symbol && cells[1][0]==symbol&&cells[2][0]==symbol)||


                (cells[2][1]==symbol && cells[1][1]==symbol &&cells[0][1]==symbol)||
                (cells[0][2]==symbol && cells[1][1]==symbol &&cells[2][2]==symbol)


        ){
            return true;
        }
        return false;
    }
private static boolean CheckExist(char[][] cells){
        for (int i=0;i<cells.length;i++){
            for (int j=0;j<i;j++){
                if(cells[i][j]==' ')return false;
            }
                   }
        return true;
}
    private static void PlayerMove(Scanner scanner, char[][] cells) {
        String InputUser;
       while (true) {
           System.out.println("Start with a number 1--->9");
            InputUser = scanner.nextLine();
//     check if valid move
           if (CheckisValid(cells, Integer.parseInt(InputUser))) {
break;
           } else {
System.out.println("invalid num");
           }
       }
        //ASSIGN CELL WITH CORRESPONDENT
        Fill(InputUser, cells,'X');
    }
    private static boolean CheckisValid(char[][] cells,int Input){
        switch (Input){
            case 1:
             return   ( cells[0][0]==' ');
            case 2:
                return   ( cells[0][1]==' ');
             case 3:
                 return   ( cells[0][2]==' ');
            case 4:
                return    cells[1][0]==' ';
            case 5:
                return    cells[1][1]==' ';
            case 6:
                return    cells[1][2]==' ';
            case 7:
                return    cells[2][0]==' ';
            case 8:
                return    cells[2][1]==' ';
            case 9:
                return    cells[2][2]==' ';
            default:
             return false;

        }
    }
    private static void ComputerTurn(char[][] cells) {
        Random random=new Random();
        int ComputerInput;
        while (true){
         ComputerInput=random.nextInt(9)+1;
         System.out.println("computer input"+ComputerInput);
        if (CheckisValid(cells,ComputerInput)){
            break;
        }}

        Fill(Integer.toString(ComputerInput), cells,'O');
    }

    private static void Print(char[][] cells) {
        System.out.println(cells[0][0]+" |"+ cells[0][1]+" |"+ cells[0][2]+"\n__+__+__\n"+ cells[1][0]+" |"+ cells[1][1]+" |"+ cells[1][2]+"\n__+__+__\n"+ cells[2][0]+" |"+ cells[2][1]+" |"+ cells[2][2]);
    }

    private static void Fill(String inputUser, char[][] cells,char symbol) {

        switch (inputUser){
            case "1":
                cells[0][0]=symbol;break;
            case "2":
                cells[0][1]=symbol;break;
                case "3":
                    cells[0][2]=symbol;break;
                    case "4":
                        cells[1][0]=symbol;break;
                    case "5":
                        cells[1][1]=symbol;break;
                       case "6":
                           cells[1][2]=symbol;break;
                       case "7": cells[2][0]=symbol;break;
                       case "8":
                           cells[2][1]=symbol;break;
                       case "9":
                           cells[2][2]=symbol;break;
            default:
                System.out.println("ENTER VALID NUMBER");
                break;
        }

    }

}