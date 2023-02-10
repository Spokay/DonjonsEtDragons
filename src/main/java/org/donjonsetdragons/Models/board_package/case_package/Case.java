package org.donjonsetdragons.Models.board_package.case_package;

import javafx.beans.property.SimpleIntegerProperty;
import org.donjonsetdragons.Models.character_package.Hero;

public class Case {
    public CaseContent caseContent;
    public SimpleIntegerProperty caseNumber;

    public Case(int caseNumber) {
        this.caseContent = CaseContent.generateRandomContent();
        this.setCaseNumber(caseNumber);
    }
    public CaseContent getCaseContent() {
        return caseContent;
    }

    public void setCaseContent(CaseContent caseContent) {
        this.caseContent = caseContent;
    }

    public int getCaseNumber() {
        return caseNumber.get();
    }

    public SimpleIntegerProperty caseNumberProperty() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = new SimpleIntegerProperty(caseNumber);
    }
}
