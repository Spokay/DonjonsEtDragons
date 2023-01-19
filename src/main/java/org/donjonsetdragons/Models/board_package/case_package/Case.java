package org.donjonsetdragons.Models.board_package.case_package;

public class Case {
    public CaseContent caseContent;

    public Case() {
        this.caseContent = CaseContent.generateRandomContent();
    }
}
