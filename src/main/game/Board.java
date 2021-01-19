package game;

import game.Figures.*;
import utils.Pair;

public class Board implements IBoard{

    private final IFigure[][] board = new IFigure[8][8];

    public Board(){
        //Init Board
        for (int x = 0;x < 8;x++){
            for (int y = 0;y < 8;y++){
                board[y][x] = new EmptySpace();
            }
        }


        //place pieces
        for (int repeat = 2;repeat > 0;repeat--){
            for(int x = 0;x < 8;x++){
                for (int y = 0;y < 2;y++){
                    if (repeat == 1 && y == 1 || repeat == 2 && y == 0){
                        //other pieces

                        switch (x){


                            case 7 :
                            case 0 :
                                //rooks
                                board[y + (repeat%2)*6 ][x] = new Rook(repeat == 1 ? Teams.Black : Teams.White);
                                break;

                            case 1:
                            case 6:
                                //knights
                                board[y + (repeat%2)*6 ][x] = new Knight(repeat == 1 ? Teams.Black : Teams.White);
                                break;

                            case 2:
                            case 5:
                                //priests xd
                                board[y + (repeat%2)*6 ][x] = new Bishop(repeat == 1 ? Teams.Black : Teams.White);
                                break;

                            case 3:
                                //queen
                                board[y + (repeat%2)*6 ][x] = new Queen(repeat == 1 ? Teams.Black : Teams.White);
                                break;
                            case 4:
                                //king
                                board[y + (repeat%2)*6 ][x] = new King(repeat == 1 ? Teams.Black : Teams.White);
                                break;
                            default:
                                System.out.println("Je tu nějaký strážník, pane probléme.");
                                break;
                        }

                    }else {
                        //pawns
                        board[y + (repeat%2)*6 ][x] = new Pawn(repeat == 1 ? Teams.Black : Teams.White);
                    }
                }
            }
        }
    }

    @Override
    public IFigure[][] getBoard() {
        return board;
    }

    @Override
    public IFigure getTile(Pair<Integer, Integer> location) {
        return board[location.second()][location.first()];
    }

    public boolean movePiece(Pair<Integer, Integer> source, Pair<Integer, Integer> target){
        //placeholder
        if (board[source.second()][source.first()].checkMoveValidity(source,target)){
            board[target.second()][target.first()] = board[source.second()][source.first()];
            board[source.second()][source.first()] = new EmptySpace();
            return true;
        }else{
            return false;
        }

    }
}
