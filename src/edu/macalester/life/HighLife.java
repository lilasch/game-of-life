package edu.macalester.life;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "HighLife";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive == true) {
           if (neighborCount > 3) {
                return false;
            } else if (neighborCount < 2) {
                return false;
        } }else {
                if (neighborCount == 3) {
                    return true;
                } else if (neighborCount == 6) {
                    return true;
                }
            }
        return isAlive;
    } 
}





