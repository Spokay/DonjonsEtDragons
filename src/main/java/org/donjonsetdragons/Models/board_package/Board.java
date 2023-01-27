package org.donjonsetdragons.Models.board_package;

import org.donjonsetdragons.Models.board_package.case_package.Case;

public class Board {
    private final int totalCases = 64;
    private int currentCaseNumber = 0;
    private Case currentCase;

    public int getTotalCases() {
        return totalCases;
    }
    public int getRemainingCases() {
        return currentCaseNumber;
    }

    public void setCurrentCaseNumber() {
        this.currentCaseNumber = this.getCurrentCase().getCaseNumber();
    }

    public Case getCurrentCase() {
        return currentCase;
    }

    public void setCurrentCase(Case currentCase) {
        this.currentCase = currentCase;
    }

    public void makeCaseInteraction(Case currentCase){

    }
}
