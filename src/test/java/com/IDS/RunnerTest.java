package com.IDS;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =  "src/main/resources/features",
//        {"src/main/resources/features/01Login.feature",
//        "src/main/resources/features/04Logout.feature"},
        glue = "com.IDS",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
