package com.test.assignment.util;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "classpath:features",
        glue = "com.test.assignment.steps",
        plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" },
        tags ="" )
public class runner extends AbstractTestNGCucumberTests {

}
