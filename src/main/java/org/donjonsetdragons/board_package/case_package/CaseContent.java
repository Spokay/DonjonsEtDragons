package org.donjonsetdragons.board_package.case_package;

import java.util.concurrent.ThreadLocalRandom;

public class CaseContent {
    static CaseContent generateRandomContent() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        return randomNum == 1 ? new EmptyCase() : randomNum == 2 ? new EnemyCase() : new SurpriseBoxCase();
    }
}
