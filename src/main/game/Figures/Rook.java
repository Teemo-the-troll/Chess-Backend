package game.Figures;

import utils.Pair;

public class Rook implements IFigure{
    private final Teams owner;

    public Rook(Teams owner){
        this.owner = owner;
    }

    @Override
    public Teams getOwner() {
        return owner;
    }

    @Override
    public String getType() {
        return "Rook";
    }

    @Override
    public boolean checkMoveValidity(Pair<Integer, Integer> cords1, Pair<Integer, Integer> cords2) {
        return cords1.second() == cords2.second() || cords1.first() == cords2.first();
    }
}
