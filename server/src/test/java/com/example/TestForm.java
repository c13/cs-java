package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestForm {

    private Form format;

    @Before
    public void setup() {
        format = new Form();
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted() {
        String someone = "Alex";

        assertThat(format.form(someone), containsString(someone));
    }

    @Test
    public void greetShouldIncludeGreetingPhrase() {
        String someone = "Alex";

        assertThat(format.form(someone).length(), is(greaterThan(someone.length())));
    }
}
