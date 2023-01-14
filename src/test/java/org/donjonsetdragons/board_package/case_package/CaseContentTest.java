package org.donjonsetdragons.board_package.case_package;

import static org.junit.jupiter.api.Assertions.*;

class CaseContentTest {

    @org.junit.jupiter.api.Test
    void generateRandomContent() {
        Case caseClass = new Case();
        assertTrue(caseClass.caseContent instanceof CaseContent);
        System.out.println(caseClass.caseContent);
    }
}