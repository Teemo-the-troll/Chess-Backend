package game.Figures;

import utils.Pair;

public class King implements IFigure{
    private final Teams owner;

    public King(Teams owner){
        this.owner = owner;
    }

    @Override
    public Teams getOwner() {
        return owner;
    }

    @Override
    public String getType() {
        return "King";
    }

    @Override
    public boolean checkMoveValidity(Pair<Integer, Integer> cords1, Pair<Integer, Integer> cords2) {
        return Math.abs(cords1.first() - cords2.first()) == 1 && Math.abs(cords1.second() - cords2.second()) == 1;
    }
}
