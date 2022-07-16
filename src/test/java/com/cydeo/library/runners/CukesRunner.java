package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

    @CucumberOptions(
            plugin = {
                    "json:target/cucumber.json",
                    "html:target/cucumber/report.html",
                    "junit:target/junit/junit-report.xml",
                    "rerun:target/rerun.txt",},
                    features="src/test/resources/features",//business layer
                    glue="com/cydeo/library/step_definitions",///implementation layer -> stands for step definition package
                    dryRun = false//false run the test, true -> checks for missing steps



    )

public class CukesRunner {

}
