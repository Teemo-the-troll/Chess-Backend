package game.Figures;

import utils.Pair;

public class Pawn implements IFigure{
    private final Teams owner;

    public Pawn(Teams owner){
        this.owner = owner;
    }

    @Override
    public Teams getOwner() {
        return owner;
    }

    @Override
    public String getType() {
        return "Pawn";
    }

    @Override
    public boolean checkMoveValidity(Pair<Integer, Integer> cords1, Pair<Integer, Integer> cords2) {
        //na potom lol
        return true;
    }
}
