package com.endava.letskata.workshops.gdansk.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestWorkshopsAppShould {

    @Test
    public void getInitialized() {
        // GIVEN
        WorkshopsApp workshopsApp = new WorkshopsApp();

        // WHEN
        workshopsApp.run();

        // THEN
        assertThat(true).isEqualTo(true);

    }
}