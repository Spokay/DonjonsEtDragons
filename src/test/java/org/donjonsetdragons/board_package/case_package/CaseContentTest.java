package org.donjonsetdragons.board_package.case_package;

import org.donjonsetdragons.Models.board_package.case_package.Case;
import org.donjonsetdragons.Models.board_package.case_package.CaseContent;

import static org.junit.jupiter.api.Assertions.*;

class CaseContentTest {

    @org.junit.jupiter.api.Test
    void generateRandomContent() {
        Case caseClass = new Case(0);
        assertTrue(caseClass.caseContent instanceof CaseContent);
        System.out.println(caseClass.caseContent);
    }
}