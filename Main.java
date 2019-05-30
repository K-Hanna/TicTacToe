import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String board[][] = new String[5][5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < board.length; i++) {
            board[i][1] = " | ";
            board[i][3] = " | ";
        }
        for (int i = 0; i < board.length; i++) {
            board[1][i] = "--";
            board[3][i] = "--";
        }
        board[0][0] = "1";
        board[0][2] = "2";
        board[0][4] = "3";
        board[2][0] = "4";
        board[2][2] = "X";
        board[2][4] = "5";
        board[4][0] = "6";
        board[4][2] = "7";
        board[4][4] = "8";

        show(1, board);
        move();

        int move = scan.nextInt();

        switch (move) {
            case 1:
                board[0][0] = "O";
                board[4][4] = "X";
                show(2, board);
                move();
                int move1 = scan.nextInt();
                switch (move1) {
                    case 2:
                        board[0][2] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        move();
                        int move12 = scan.nextInt();
                        switch (move12) {
                            case 4:
                                board[2][0] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 3:
                        board[0][4] = "O";
                        board[0][2] = "X";
                        show(3, board);
                        move();
                        int move13 = scan.nextInt();
                        switch (move13) {
                            case 4:
                                board[2][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                move();
                                int move137 = scan.nextInt();
                                switch (move137) {
                                    case 5:
                                        board[2][4] = "O";
                                        board[4][0] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 6:
                                        board[4][0] = "O";
                                        board[2][4] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 4:
                        board[2][0] = "O";
                        board[4][0] = "X";
                        show(3, board);
                        move();
                        int move14 = scan.nextInt();
                        switch (move14) {
                            case 2:
                                board[0][2] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3:
                                board[0][4] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 5:
                        board[2][4] = "O";
                        board[4][0] = "X";
                        show(3, board);
                        move();
                        int move15 = scan.nextInt();
                        switch (move15) {
                            case 2:
                                board[0][2] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3:
                                board[0][4] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 6:
                        board[4][0] = "O";
                        board[2][0] = "X";
                        show(3, board);
                        move();
                        int move16 = scan.nextInt();
                        switch (move16) {
                            case 2:
                                board[0][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3:
                                board[0][4] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                move();
                                int move165 = scan.nextInt();
                                switch (move165) {
                                    case 7:
                                        board[4][2] = "O";
                                        board[0][4] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 3:
                                        board[0][4] = "O";
                                        board[4][2] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 7:
                        board[4][2] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        move();
                        int move17 = scan.nextInt();
                        switch (move17) {
                            case 2:
                                board[0][2] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                        default: wrong();
                            break;
                }
                break;
            case 2: board[0][2] = "O";
                    board[0][4] = "X";
                    show(2,board);
                    move();
                    int move2 = scan.nextInt();
                switch (move2){
                    case 1: board[0][0] = "O";
                            board[4][0] = "X";
                            show(3, board);
                            lose();
                            break;
                    case 4: board[2][0] = "O";
                            board[4][0] = "X";
                            show(3,board);
                            lose();
                            break;
                    case 5: board[2][4] = "O";
                            board[4][0] = "X";
                            show(3, board);
                            lose();
                            break;
                    case 8: board[4][4] = "O";
                            board[4][0] = "X";
                            show(3,board);
                            lose();
                            break;
                    case 6: board[4][0] = "O";
                            board[4][4] = "X";
                            show(3, board);
                            move();
                            int move26 = scan.nextInt();
                            switch (move26){
                                case 1: board[0][0] = "O";
                                        board[2][4] = "X";
                                        show(4,board);
                                        lose();
                                        break;
                                case 4: board[2][0] = "O";
                                        board[2][4] = "X";
                                        show(4, board);
                                        lose();
                                        break;
                                case 5: board[0][4]= "O";
                                        board[0][0] = "X";
                                        show(4, board);
                                        lose();
                                        break;
                                case 7: board[4][2] = "O";
                                        board[2][4] = "X";
                                        show(4,board);
                                        lose();
                                        break;
                                 default: wrong();
                                    break;
                            } break;
                            default: wrong();
                                break;
                } break;
            case 3:
                board[0][4] = "O";
                board[4][0] = "X";
                show(2, board);
                move();
                int move3 = scan.nextInt();
                switch (move3) {
                    case 2:
                        board[0][2] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        move();
                        int move12 = scan.nextInt();
                        switch (move12) {
                            case 4:
                                board[2][0] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 1:
                        board[0][0] = "O";
                        board[0][2] = "X";
                        show(3, board);
                        move();
                        int move13 = scan.nextInt();
                        switch (move13) {
                            case 4:
                                board[2][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                move();
                                int move137 = scan.nextInt();
                                switch (move137) {
                                    case 5:
                                        board[2][4] = "O";
                                        board[4][4] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 8:
                                        board[4][4] = "O";
                                        board[2][4] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 4:
                        board[2][0] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        move();
                        int move14 = scan.nextInt();
                        switch (move14) {
                            case 2:
                                board[0][2] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 5:
                        board[2][4] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        move();
                        int move15 = scan.nextInt();
                        switch (move15) {
                            case 2:
                                board[0][2] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 8:
                        board[4][4] = "O";
                        board[2][4] = "X";
                        show(3, board);
                        move();
                        int move18 = scan.nextInt();
                        switch (move18) {
                            case 2:
                                board[0][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                move();
                                int move165 = scan.nextInt();
                                switch (move165) {
                                    case 7:
                                        board[4][2] = "O";
                                        board[0][0] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 1:
                                        board[0][0] = "O";
                                        board[4][2] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 7:
                        board[4][2] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        move();
                        int move17 = scan.nextInt();
                        switch (move17) {
                            case 2:
                                board[0][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                        default: wrong();
                            break;
                }
                break;
            case 4: board[2][0] = "O";
                board[0][0] = "X";
                show(2,board);
                move();
                int move4 = scan.nextInt();
                switch (move4){
                    case 2: board[0][2] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 3: board[0][4] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 5: board[2][4] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 6: board[4][4] = "O";
                        board[4][0] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 7: board[4][2] = "O";
                        board[4][4] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 8: board[4][4] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        move();
                        int move48 = scan.nextInt();
                        switch (move48){
                            case 2: board[0][2] = "O";
                                board[4][0] = "X";
                                show(4,board);
                                lose();
                                break;
                            case 5: board[2][4] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6: board[4][0]= "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7: board[4][2] = "O";
                                board[4][0] = "X";
                                show(4,board);
                                lose();
                                break;
                            default: wrong();
                                break;
                        } break;
                        default: wrong();
                            break;
                } break;
            case 5: board[2][4] = "O";
                board[4][4] = "X";
                show(2,board);
                move();
                int move5 = scan.nextInt();
                switch (move5){
                    case 2: board[0][2] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 3: board[0][4] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 4: board[2][0] = "O";
                        board[0][0] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 6: board[4][0] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 8: board[4][4] = "O";
                        board[0][0] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 1: board[0][0] = "O";
                        board[4][0] = "X";
                        show(3, board);
                        move();
                        int move26 = scan.nextInt();
                        switch (move26){
                            case 2: board[0][2] = "O";
                                board[0][4] = "X";
                                show(4,board);
                                lose();
                                break;
                            case 4: board[2][0] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3: board[0][4]= "O";
                                board[4][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7: board[4][2] = "O";
                                board[0][4] = "X";
                                show(4,board);
                                lose();
                                break;
                            default: wrong();
                                break;
                        } break;
                        default: wrong();
                            break;
                } break;
            case 6:
                board[4][0] = "O";
                board[0][4] = "X";
                show(2, board);
                move();
                int move6 = scan.nextInt();
                switch (move6) {
                    case 2:
                        board[0][2] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        move();
                        int move62 = scan.nextInt();
                        switch (move62) {
                            case 4:
                                board[2][0] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 1:
                        board[0][0] = "O";
                        board[2][0] = "X";
                        show(3, board);
                        move();
                        int move13 = scan.nextInt();
                        switch (move13) {
                            case 2:
                                board[0][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                move();
                                int move137 = scan.nextInt();
                                switch (move137) {
                                    case 7:
                                        board[4][2] = "O";
                                        board[4][4] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 8:
                                        board[4][4] = "O";
                                        board[4][2] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 4:
                        board[2][0] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        move();
                        int move64 = scan.nextInt();
                        switch (move64) {
                            case 2:
                                board[0][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 5:
                        board[2][4] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        move();
                        int move15 = scan.nextInt();
                        switch (move15) {
                            case 2:
                                board[0][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 8:
                                board[4][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 8:
                        board[4][4] = "O";
                        board[4][2] = "X";
                        show(3, board);
                        move();
                        int move68 = scan.nextInt();
                        switch (move68) {
                            case 4:
                                board[2][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 2:
                                board[0][2] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                move();
                                int move165 = scan.nextInt();
                                switch (move165) {
                                    case 1:
                                        board[0][0] = "O";
                                        board[2][0] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    case 4:
                                        board[2][0] = "O";
                                        board[0][0] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 7:
                        board[4][2] = "O";
                        board[4][4] = "X";
                        show(3, board);
                        move();
                        int move17 = scan.nextInt();
                        switch (move17) {
                            case 2:
                                board[0][2] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 1:
                                board[0][0] = "O";
                                board[2][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                        default: wrong();
                            break;
                }
                break;
            case 7: board[4][2] = "O";
                board[4][0] = "X";
                show(2,board);
                move();
                int move7 = scan.nextInt();
                switch (move7){
                    case 1: board[0][0] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 2: board[0][2] = "O";
                        board[0][4] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 4: board[2][0] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 5: board[2][4] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        lose();
                        break;
                    case 8: board[4][4] = "O";
                        board[0][4] = "X";
                        show(3,board);
                        lose();
                        break;
                    case 3: board[0][4] = "O";
                        board[0][0] = "X";
                        show(3, board);
                        move();
                        int move73 = scan.nextInt();
                        switch (move73){
                            case 2: board[0][2] = "O";
                                board[2][0] = "X";
                                show(4,board);
                                lose();
                                break;
                            case 4: board[2][0] = "O";
                                board[4][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5: board[2][4]= "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7: board[4][2] = "O";
                                board[4][4] = "X";
                                show(4,board);
                                lose();
                                break;
                            default: wrong();
                                break;
                        } break;
                        default: wrong();
                            break;
                } break;
            case 8:
                board[4][4] = "O";
                board[0][0] = "X";
                show(2, board);
                move();
                int move8 = scan.nextInt();
                switch (move8) {
                    case 2:
                        board[0][2] = "O";
                        board[4][0] = "X";
                        show(3, board);
                        move();
                        int move12 = scan.nextInt();
                        switch (move12) {
                            case 4:
                                board[2][0] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3:
                                board[0][4] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 3:
                        board[0][4] = "O";
                        board[2][4] = "X";
                        show(3, board);
                        move();
                        int move83 = scan.nextInt();
                        switch (move83) {
                            case 2:
                                board[0][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                move();
                                int move137 = scan.nextInt();
                                switch (move137) {
                                    case 7:
                                        board[4][2] = "O";
                                        board[4][0] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 6:
                                        board[4][0] = "O";
                                        board[4][2] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 4:
                        board[2][0] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        move();
                        int move14 = scan.nextInt();
                        switch (move14) {
                            case 2:
                                board[0][2] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 5:
                        board[2][4] = "O";
                        board[0][4] = "X";
                        show(3, board);
                        move();
                        int move15 = scan.nextInt();
                        switch (move15) {
                            case 2:
                                board[0][2] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 6:
                                board[4][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 7:
                                board[4][2] = "O";
                                board[4][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 6:
                        board[4][0] = "O";
                        board[4][2] = "X";
                        show(3, board);
                        move();
                        int move16 = scan.nextInt();
                        switch (move16) {
                            case 3:
                                board[0][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 2:
                                board[0][2] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                move();
                                int move165 = scan.nextInt();
                                switch (move165) {
                                    case 5:
                                        board[2][4] = "O";
                                        board[0][4] = "X";
                                        show(5, board);
                                        tie();
                                        break;
                                    case 3:
                                        board[0][4] = "O";
                                        board[2][4] = "X";
                                        show(5, board);
                                        lose();
                                        break;
                                    default:
                                        wrong();
                                        break;
                                }
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][2] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    case 7:
                        board[4][2] = "O";
                        board[4][0] = "X";
                        show(3, board);
                        move();
                        int move17 = scan.nextInt();
                        switch (move17) {
                            case 2:
                                board[0][2] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 4:
                                board[2][0] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 5:
                                board[2][4] = "O";
                                board[0][4] = "X";
                                show(4, board);
                                lose();
                                break;
                            case 3:
                                board[0][4] = "O";
                                board[2][0] = "X";
                                show(4, board);
                                lose();
                                break;
                            default:
                                wrong();
                                break;
                        }
                        break;
                    default: wrong();
                        break;
                }
                break;
                default: wrong();
                    break;
        }
    }
    static void show(int a, String board[][]){

        System.out.println("Round " + a +":");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
     }
    static void lose(){
        System.out.println("You lose.");
    }
    static void tie(){
        System.out.println("It's a tie.");
    }
    static void move(){
        System.out.println("Your move:");
    }
    static void wrong(){
        System.out.println("Move unavailable.");
    }
}
