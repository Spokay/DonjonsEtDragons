package org.donjonsetdragons.Models.board_package.case_package;

public class Case {
    public CaseContent caseContent;
    public int caseNumber;

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
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }
}
