package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

    @CucumberOptions(
                    features="src/test/resources/features",//business layer
                    glue="com/cydeo/library/step_definitions",///implementation layer -> stands for step definition package
                    dryRun = false,////false run the test, true -> checks for missing steps
                    tags="@smoke"

    )

public class CukesRunner {

}
