package org.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\psjey\\eclipse-workspace\\Cucumberproject\\src\\test\\resources\\"
		+ "features\\quincesignup.feature",glue="org.step")
public class steprunnerclass {

}
